package be.renaud11232.bluemapmobs.markersetbuilder;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

public abstract class EntityMarkerSetBuilder<T extends Entity> implements MarkerSetBuilder<T> {

    private final FileConfiguration config;
    private final FileConfiguration defaultConfig;

    public EntityMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
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
