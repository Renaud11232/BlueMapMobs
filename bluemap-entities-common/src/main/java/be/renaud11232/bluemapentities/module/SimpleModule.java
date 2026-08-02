package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.io.AssetExtractor;
import be.renaud11232.bluemapentities.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.configuration.MarkerConfiguration;
import be.renaud11232.bluemapentities.configuration.MarkerSetConfiguration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public abstract class SimpleModule<WORLD_TYPE, SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE extends Entity> implements Module<WORLD_TYPE, SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE> {
    private final BlueMapAPI api;
    private final Configuration configuration;
    private final EntityConverter<SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE> converter;
    private final MarkerBuilder<TARGET_ENTITY_TYPE> markerBuilder;

    protected SimpleModule(BlueMapAPI api, Configuration configuration, EntityConverter<SOURCE_ENTITY_TYPE, TARGET_ENTITY_TYPE> converter, MarkerBuilder<TARGET_ENTITY_TYPE> markerBuilder) {
        this.api = api;
        this.configuration = configuration;
        this.converter = converter;
        this.markerBuilder = markerBuilder;
        extractAssets();
    }

    @Override
    public void update() {
        getWorlds().forEach(this::update);
    }

    private void update(WORLD_TYPE world) {
        List<TARGET_ENTITY_TYPE> allEntities = getEntities(world).stream()
                .map(converter::convert)
                .toList();
        Map<String, List<TARGET_ENTITY_TYPE>> entitiesByType = allEntities.stream()
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
                    api.getWorld(world).ifPresent(w -> w.getMaps().forEach(map -> {
                        MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(markerSetConfig.getId(), _ -> buildMarkerSet(markerSetConfig));
                        markerSet.getMarkers().entrySet().removeIf(marker -> marker.getKey().startsWith(getModuleIdentifier()));
                        markerSet.getMarkers().putAll(markers);
                    }));
                });
    }

    private Map<String, Marker> buildMarkers(MarkerConfiguration markerConfiguration, List<TARGET_ENTITY_TYPE> entities) {
        return entities.stream()
                .map(entity -> Map.entry(String.format("%s-%s", getModuleIdentifier(), entity.getUUID()), markerBuilder.build(entity)))
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

    private void extractAssets() {
        Path relativeDestination = Path.of("assets").resolve(getModuleIdentifier());
        Path destination = api.getWebApp().getWebRoot().resolve(relativeDestination);
        try (AssetExtractor assetExtractor = new AssetExtractor(getClass(), "assets", destination)) {
            assetExtractor.extract();
            assetExtractor.listDestinationFiles()
                    .stream()
                    .filter(f -> f.toString().toLowerCase().endsWith(".css"))
                    .map(relativeDestination::resolve)
                    .map(Path::toString)
                    .forEach(f -> api.getWebApp().registerStyle(f));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
