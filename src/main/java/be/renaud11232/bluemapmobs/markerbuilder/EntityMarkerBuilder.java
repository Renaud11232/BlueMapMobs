package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.icon.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class EntityMarkerBuilder<T extends Entity> implements MarkerBuilder<T> {
    private final FileConfiguration config;
    @SuppressWarnings("rawtypes")
    private final Map<Class<? extends T>, MarkerBuilder> markerBuilders;
    private final boolean displayed;
    private final Icon defaultIcon;

    public EntityMarkerBuilder(FileConfiguration config, BooleanConfiguration visibilityConfiguration, Icon defaultIcon) {
        this.config = config;
        this.markerBuilders = new HashMap<>();
        displayed = visibilityConfiguration == null || visibilityConfiguration.get(config);
        this.defaultIcon = defaultIcon;
    }

    public EntityMarkerBuilder(FileConfiguration config, BooleanConfiguration visibilityConfiguration) {
        this(config, visibilityConfiguration, BlueMapMobsIcon.Common.UNKNOWN);
    }

    public EntityMarkerBuilder(FileConfiguration config, Icon defaultIcon) {
        this(config, null, defaultIcon);
    }

    public EntityMarkerBuilder(FileConfiguration config) {
        this(config, (BooleanConfiguration) null);
    }

    @Override
    @SuppressWarnings("unchecked")
    public final Optional<POIMarker> build(T entity) {
        Block block = entity.getLocation().getBlock();
        if(block.getLightFromBlocks() < BlueMapMobsConfiguration.General.MINIMUM_BLOCK_LIGHT.get(config) && block.getLightFromSky() < BlueMapMobsConfiguration.General.MINIMUM_SKY_LIGHT.get(config)) {
            return Optional.empty();
        }
        return markerBuilders.entrySet()
                .stream()
                .filter(entry -> entry.getKey().isInstance(entity))
                .map(Map.Entry::getValue)
                .findFirst()
                .map(markerBuilder -> (Optional<POIMarker>) markerBuilder.build(entity))
                .orElseGet(() -> MarkerBuilder.super.build(entity))
                .map(marker -> {
                    marker.addStyleClasses(List.of("bluemapmobs-marker"));//TODO: Add style classes to dedicated file ?
                    return marker;
                });
    }

    @Override
    public Optional<POIMarker> buildDefault(T entity) {
        if(displayed) {
            return MarkerBuilder.super.buildDefault(entity);
        }
        return Optional.empty();
    }

    protected <U extends T> void registerMarkerBuilder(Class<? extends U> klass, MarkerBuilder<U> builder) {
        markerBuilders.put(klass, builder);
    }

    public FileConfiguration getConfig() {
        return this.config;
    }

    @Override
    public Icon getDefaultIcon() {
        return this.defaultIcon;
    }
}
