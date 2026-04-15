package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.icon.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.*;

@SuppressWarnings("rawtypes")
public abstract class SimpleMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {
    private final BlueMapEntitiesAPI api;
    private final Map<String, MarkerBuilder> registry;
    private final Icon defaultIcon;
    private final Collection<String> defaultStyleClasses;

    public SimpleMarkerBuilder(BlueMapEntitiesAPI api) {
        this.api = api;
        this.registry = new HashMap<>();
        this.defaultIcon = getDefaultIcon();
        this.defaultStyleClasses = getDefaultStyleClasses();
    }

    protected void register(MarkerType type, MarkerBuilder<? extends T> markerBuilder) {
        registry.put(type.getName(), markerBuilder);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Optional<POIMarker> build(T entity) {
        MarkerBuilder markerBuilder = registry.get(entity.getMarkerType().getName());
        if (markerBuilder == null) {
            return doBuild(entity);
        }
        return markerBuilder.build(entity);
    }

    private Optional<POIMarker> doBuild(T entity) {
        if (entity.getBlockLightLevel() < api.getConfiguration().getMinimumBlockLight() && entity.getSkyLightLevel() < api.getConfiguration().getMinimumSkyLight()) {
            return Optional.empty();
        }
        Icon icon = getIcon(entity);
        if (icon == null) {
            icon = defaultIcon;
        }
        if (icon == null) {
            icon = BlueMapEntitiesIcon.UNKNOWN;
        }
        Collection<String> styleClasses = getStyleClasses(entity);
        if (styleClasses == null) {
            styleClasses = defaultStyleClasses;
        }
        if (styleClasses == null) {
            styleClasses = Collections.emptyList();
        }
        Position position = entity.getPosition();
        POIMarker marker = POIMarker.builder()
                .label(entity.getName())
                .detail(entity.getName())
                .position(position.x(), position.y(), position.z())
                .icon(icon.getPath(), icon.getAnchor())
                .styleClasses(BlueMapEntitiesStyleClass.MARKER)
                .build();
        marker.addStyleClasses(styleClasses);
        return Optional.of(marker);
    }

    protected Icon getDefaultIcon() {
        return null;
    }

    protected Icon getIcon(T entity) {
        return null;
    }

    protected Collection<String> getDefaultStyleClasses() {
        return null;
    }

    protected Collection<String> getStyleClasses(T entity) {
        return null;
    }

    protected BlueMapEntitiesAPI getAPI() {
        return api;
    }
}
