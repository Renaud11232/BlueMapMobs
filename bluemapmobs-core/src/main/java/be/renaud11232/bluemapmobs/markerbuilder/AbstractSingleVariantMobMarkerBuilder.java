package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

public abstract class AbstractSingleVariantMobMarkerBuilder<T extends Mob, V> extends AbstractVariantMobMarkerBuilder<T, V, V> implements SingleVariantMarkerBuilder<T, V> {
    public AbstractSingleVariantMobMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }
}
