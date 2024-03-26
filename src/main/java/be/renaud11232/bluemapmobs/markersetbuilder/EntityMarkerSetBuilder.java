package be.renaud11232.bluemapmobs.markersetbuilder;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

public abstract class EntityMarkerSetBuilder<T extends Entity> implements MarkerSetBuilder<T> {

    private final FileConfiguration config;

    public EntityMarkerSetBuilder(FileConfiguration config) {
        this.config = config;
    }

    public FileConfiguration getConfig() {
        return this.config;
    }

}
