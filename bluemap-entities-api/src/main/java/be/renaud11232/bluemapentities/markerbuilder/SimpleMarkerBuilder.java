package be.renaud11232.bluemapentities.markerbuilder;

import be.renaud11232.bluemapentities.*;
import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.icon.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;

import java.util.*;

@SuppressWarnings("rawtypes")
public abstract class SimpleMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {
    private final BlueMapEntitiesAPI api;
    private final Map<Class<? extends Entity>, MarkerBuilder> registry;
    private final Map<Class<? extends Entity>, Optional<MarkerBuilder>> cachedRegistry;
    private final Icon defaultIcon;
    private final Collection<String> defaultStyleClasses;

    public SimpleMarkerBuilder(BlueMapEntitiesAPI api) {
        this.api = api;
        this.registry = new HashMap<>();
        this.cachedRegistry = new HashMap<>();
        this.defaultIcon = getDefaultIcon();
        this.defaultStyleClasses = getDefaultStyleClasses();
    }

    protected <U extends Entity> void register(Class<? extends U> clazz, MarkerBuilder<? super U> markerBuilder) {
        registry.put(clazz, markerBuilder);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Optional<POIMarker> build(T entity) {
        Optional<MarkerBuilder> markerBuilder = cachedRegistry.computeIfAbsent(entity.getClass(), clazz -> {
            List<Class<?>> classes = new ArrayList<>();
            classes.add(clazz);
            for (int i = 0; i < classes.size(); i++) {
                Class<?> candidate = classes.get(i);
                if (registry.containsKey(candidate)) {
                    return Optional.ofNullable(registry.get(candidate));
                }
                classes.addAll(List.of(candidate.getInterfaces()));
                Class<?> superclass = candidate.getSuperclass();
                if (superclass != null) {
                    classes.add(superclass);
                }
            }
            return Optional.empty();
        });
        return markerBuilder.map(b -> b.build(entity))
                .orElseGet(() -> doBuild(entity));
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
