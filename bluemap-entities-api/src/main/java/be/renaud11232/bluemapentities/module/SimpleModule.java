package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.module.configuration.MarkerConfiguration;
import be.renaud11232.bluemapentities.module.configuration.MarkerSetConfiguration;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;

import java.util.*;
import java.util.stream.Collectors;

public abstract class SimpleModule<SOURCE_TYPE, TARGET_TYPE extends Entity> implements Module {
    private final BlueMapEntitiesAPI api;
    private final ModuleConfiguration configuration;
    private final EntityConverter<SOURCE_TYPE, TARGET_TYPE> converter;
    private final MarkerBuilder<TARGET_TYPE> markerBuilder;

    protected SimpleModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<SOURCE_TYPE, TARGET_TYPE> converter, MarkerBuilder<TARGET_TYPE> markerBuilder) {
        this.api = api;
        this.configuration = configuration;
        this.converter = converter;
        this.markerBuilder = markerBuilder;
    }

    protected abstract Collection<? extends SOURCE_TYPE> getEntities(Object world);

    public void update(Object world) {
        List<TARGET_TYPE> allEntities = getEntities(world).stream()
                .map(converter::convert)
                .toList();
        Map<String, List<TARGET_TYPE>> entitiesByType = allEntities.stream()
                .collect(Collectors.groupingBy(e -> e.getMarkerType().getName()));
        configuration.getMarkerSets()
                .forEach(markerSetConfig -> {
                    Map<String, Marker> markers = markerSetConfig.getMarkers()
                            .stream()
                            .filter(markerConfiguration -> markerConfiguration.getType().equals("*"))
                            .findAny()
                            .map(markerConfiguration -> buildMarkers(markerConfiguration, allEntities))
                            .orElseGet(() -> markerSetConfig.getMarkers()
                                    .stream()
                                    .map(markerConfig -> buildMarkers(markerConfig, entitiesByType.getOrDefault(markerConfig.getType(), Collections.emptyList())))
                                    .flatMap(map -> map.entrySet().stream())
                                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                            );
                    api.getBlueMap().getWorld(world).ifPresent(w -> w.getMaps().forEach(map -> {
                        MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(markerSetConfig.getId(), id -> buildMarkerSet(markerSetConfig));
                        markerSet.getMarkers().clear();
                        markerSet.getMarkers().putAll(markers);
                    }));
                });
    }

    private Map<String, Marker> buildMarkers(MarkerConfiguration markerConfiguration, List<TARGET_TYPE> entities) {
        return entities.stream()
                .map(entity -> Map.entry(entity.getUUID().toString(), markerBuilder.build(entity)))
                .filter(e -> e.getValue().isPresent())
                .peek(e -> e.getValue().get().setMaxDistance(markerConfiguration.getMaxDistance()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().get()));
    }

    private MarkerSet buildMarkerSet(MarkerSetConfiguration conf) {
        return MarkerSet.builder()
                .label(conf.getLabel())
                .toggleable(conf.isToggleable())
                .defaultHidden(conf.isHiddenByDefault())
                .build();
    }
}
