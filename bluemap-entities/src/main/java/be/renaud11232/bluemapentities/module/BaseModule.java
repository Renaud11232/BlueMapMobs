package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.MarkerBuilder;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.module.configuration.MarkerSetConfiguration;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class BaseModule<SOURCE_TYPE, TARGET_TYPE extends Entity> implements Module {
    private final BlueMapEntitiesAPI api;
    private final ModuleConfiguration configuration;
    private final EntityConverter<SOURCE_TYPE, TARGET_TYPE> converter;
    private final MarkerBuilder<TARGET_TYPE> markerBuilder;

    protected BaseModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration, EntityConverter<SOURCE_TYPE, TARGET_TYPE> converter, MarkerBuilder<TARGET_TYPE> markerBuilder) {
        this.api = api;
        this.configuration = configuration;
        this.converter = converter;
        this.markerBuilder = markerBuilder;
    }

    protected abstract Collection<? extends SOURCE_TYPE> getEntities(Object world);

    public void update(Object world) {
        Map<String, List<TARGET_TYPE>> entities = getEntities(world).stream().map(converter::convert).collect(Collectors.groupingBy(Entity::getMarkerType));
        configuration.getMarkerSets().forEach(markerSetConfig -> {
            Map<String, Marker> markers = new HashMap<>();
            markerSetConfig.getMarkers().forEach(markerConfiguration ->
                    entities.get(markerConfiguration.getType()).forEach(entity ->
                            markerBuilder.build(entity).ifPresent(marker ->
                                    markers.put(entity.getUUID().toString(), marker)
                            )
                    )
            );
            api.getBlueMap().getWorld(world).ifPresent(w -> w.getMaps().forEach(map -> {
                MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(markerSetConfig.getId(), id -> buildMarkerSet(markerSetConfig));
                markerSet.getMarkers().clear();
                markerSet.getMarkers().putAll(markers);
            }));
        });
    }

    private MarkerSet buildMarkerSet(MarkerSetConfiguration conf) {
        return MarkerSet.builder()
                .label(conf.getLabel())
                .toggleable(conf.isToggleable())
                .defaultHidden(conf.isHiddenByDefault())
                .build();
    }
}
