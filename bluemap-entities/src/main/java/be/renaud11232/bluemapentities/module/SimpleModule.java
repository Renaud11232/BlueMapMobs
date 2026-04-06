package be.renaud11232.bluemapentities.module;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapentities.MarkerBuilder;
import be.renaud11232.bluemapentities.MarkerSetBuilder;
import be.renaud11232.bluemapentities.entity.Entity;
import de.bluecolored.bluemap.api.markers.Marker;
import de.bluecolored.bluemap.api.markers.MarkerSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public abstract class SimpleModule<NATIVE_TYPE, T extends Entity> implements Module<T> {
    private final BlueMapEntitiesAPI api;
    private final EntityConverter<NATIVE_TYPE, T> entityConverter;
    private final MarkerSetBuilder markerSetBuilder;
    private final MarkerBuilder<T> markerBuilder;

    protected SimpleModule(BlueMapEntitiesAPI api, EntityConverter<NATIVE_TYPE, T> entityConverter, MarkerSetBuilder markerSetBuilder, MarkerBuilder<T> markerBuilder) {
        this.api = api;
        this.entityConverter = entityConverter;
        this.markerSetBuilder = markerSetBuilder;
        this.markerBuilder = markerBuilder;
    }

    protected abstract Collection<NATIVE_TYPE> getNativeEntities(Object world);

    @Override
    public Collection<T> getEntities(Object world) {
        return getNativeEntities(world).stream()
                .map(entityConverter::convert)
                .toList();
    }

    @Override
    public void update(Object world) {
        Collection<T> entities = getEntities(world);
        Map<String, Marker> markers = new HashMap<>();
        entities.forEach(entity -> markerBuilder.build(entity).ifPresent(marker -> markers.put(entity.getUUID().toString(), marker)));
        api.getBlueMap().getWorld(world).ifPresent(w -> w.getMaps().forEach(map -> {
            MarkerSet markerSet = map.getMarkerSets().computeIfAbsent(markerSetBuilder.getKey(), id -> markerSetBuilder.build());
            markerSet.getMarkers().clear();
            markerSet.getMarkers().putAll(markers);
        }));
    }
}
