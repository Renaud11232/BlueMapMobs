package be.renaud11232.bluemapmobs.markersetbuilder;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

public abstract class EntityMarkerSetBuilder<T extends Entity> extends MarkerSetBuilderBase<T> {
    public EntityMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }
}
