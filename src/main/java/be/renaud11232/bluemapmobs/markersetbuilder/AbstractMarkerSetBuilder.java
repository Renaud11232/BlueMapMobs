package be.renaud11232.bluemapmobs.markersetbuilder;

import org.bukkit.configuration.file.FileConfiguration;

public abstract class AbstractMarkerSetBuilder<T> implements MarkerSetBuilder<T> {
    private final FileConfiguration config;
    private final FileConfiguration defaultConfig;

    public AbstractMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        this.config = config;
        this.defaultConfig = defaultConfig;
    }

    public final FileConfiguration getConfig() {
        return this.config;
    }

    public final FileConfiguration getDefaultConfig() {
        return this.defaultConfig;
    }
}
