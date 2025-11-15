package be.renaud11232.bluemapmobs.markersetbuilder;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;

public abstract class AbstractEntityMarkerSetBuilder<T extends Entity> extends AbstractMarkerSetBuilder<T> {
    public AbstractEntityMarkerSetBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }
}
