package be.renaud11232.bluemapmobs.markersetbuilder;

import org.bukkit.configuration.file.FileConfiguration;

public abstract class EntityMarkerSetBuilder implements MarkerSetBuilder {

    private final FileConfiguration config;

    public EntityMarkerSetBuilder(FileConfiguration config) {
        this.config = config;
    }

    public FileConfiguration getConfig() {
        return this.config;
    }

}
