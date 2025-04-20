package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

public abstract class AbstractMarkerBuilder<T> implements MarkerBuilder<T> {
    private final FileConfiguration config;
    private final FileConfiguration defaultConfig;
    private final boolean hidden;
    private final int minimumBlockLight;
    private final int minimumSkyLight;
    @SuppressWarnings("rawtypes")
    private final Map<Class<? extends T>, MarkerBuilder> markerBuilders;
    private final Icon defaultIcon;
    private final Collection<String> defaultStyleClasses;

    public AbstractMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        this.config = config;
        this.defaultConfig = defaultConfig;
        this.hidden = getVisibility() != null && !getVisibility().get(config, defaultConfig);
        this.minimumBlockLight = BlueMapMobsConfiguration.General.MINIMUM_BLOCK_LIGHT.get(config, defaultConfig);
        this.minimumSkyLight = BlueMapMobsConfiguration.General.MINIMUM_SKY_LIGHT.get(config, defaultConfig);
        MarkerBuilderRegistry<T> registry = new MarkerBuilderRegistry<>();
        registerMarkerBuilders(registry);
        this.markerBuilders = registry.getItems();
        this.defaultIcon = getDefaultIcon();
        this.defaultStyleClasses = getDefaultStyleClasses();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Optional<POIMarker> build(T element) {
        if (hidden) {
            return Optional.empty();
        }
        Block block = getBlock(element);
        if (block.getLightFromBlocks() < minimumBlockLight && block.getLightFromSky() < minimumSkyLight) {
            return Optional.empty();
        }
        return markerBuilders.entrySet()
                .stream()
                .filter(entry -> entry.getKey().isInstance(element))
                .map(Map.Entry::getValue)
                .findFirst()
                .map(markerBuilder -> (Optional<POIMarker>) markerBuilder.build(element))
                .orElseGet(() -> buildDefault(element))
                .map(marker -> {
                    Icon icon = getIcon(element);
                    if (icon == null) {
                        icon = defaultIcon;
                    }
                    if (icon != null) {
                        marker.setIcon(icon.getPath(), icon.getAnchor());
                    }
                    Collection<String> styleClasses = getStyleClasses(element);
                    if (styleClasses == null) {
                        styleClasses = defaultStyleClasses;
                    }
                    if (styleClasses != null) {
                        marker.addStyleClasses(styleClasses);
                    }
                    return marker;
                });
    }

    public abstract Optional<POIMarker> buildDefault(T element);

    public abstract Block getBlock(T element);

    public final FileConfiguration getConfig() {
        return config;
    }

    public final FileConfiguration getDefaultConfig() {
        return defaultConfig;
    }

    public Configuration<Boolean> getVisibility() {
        return null;
    }

    public void registerMarkerBuilders(MarkerBuilderRegistry<T> registry) {
    }

    public Icon getDefaultIcon() {
        return null;
    }

    public Icon getIcon(T entity) {
        return null;
    }

    public Collection<String> getDefaultStyleClasses() {
        return null;
    }

    public Collection<String> getStyleClasses(T entity) {
        return null;
    }
}
