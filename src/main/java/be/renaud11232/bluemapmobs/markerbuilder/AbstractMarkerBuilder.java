package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public abstract class AbstractMarkerBuilder<T> implements MarkerBuilder<T> {
    private final FileConfiguration config;
    private final FileConfiguration defaultConfig;
    private final boolean hidden;
    private final int minimumBlockLight;
    private final int minimumSkyLight;
    private final MarkerBuilderRegistry<T> markerBuilders;
    private final Icon defaultIcon;
    private final Collection<String> defaultStyleClasses;

    public AbstractMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        this.config = config;
        this.defaultConfig = defaultConfig;
        this.hidden = getVisibility() != null && !getVisibility().get(config, defaultConfig);
        this.minimumBlockLight = BlueMapMobsConfiguration.General.MINIMUM_BLOCK_LIGHT.get(config, defaultConfig);
        this.minimumSkyLight = BlueMapMobsConfiguration.General.MINIMUM_SKY_LIGHT.get(config, defaultConfig);
        this.markerBuilders = new MarkerBuilderRegistry<>();
        registerMarkerBuilders(markerBuilders);
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
                .orElseGet(() -> doBuild(element));
    }

    private Optional<POIMarker> doBuild(T element) {
        Icon icon = getIcon(element);
        if (icon == null) {
            icon = defaultIcon;
        }
        if (icon == null) {
            icon = BlueMapMobsIcon.UNKNOWN;
        }
        Collection<String> styleClasses = getStyleClasses(element);
        if (styleClasses == null) {
            styleClasses = defaultStyleClasses;
        }
        if (styleClasses == null) {
            styleClasses = Collections.emptyList();
        }
        POIMarker marker = POIMarker.builder()
                .label(getClass().getName())
                .detail(getClass().getName())
                .position(0d, 0d, 0d)
                .icon(icon.getPath(), icon.getAnchor())
                .styleClasses(BlueMapMobsStyleClass.MARKER)
                .build();
        marker.addStyleClasses(styleClasses);
        return Optional.of(marker);
    }

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

    public Icon getIcon(T element) {
        return null;
    }

    public Collection<String> getDefaultStyleClasses() {
        return null;
    }

    public Collection<String> getStyleClasses(T element) {
        return null;
    }
}
