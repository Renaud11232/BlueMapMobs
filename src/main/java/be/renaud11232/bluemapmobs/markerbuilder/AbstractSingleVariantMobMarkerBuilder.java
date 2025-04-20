package be.renaud11232.bluemapmobs.markerbuilder;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

public abstract class AbstractSingleVariantMobMarkerBuilder<T extends Mob, V> extends AbstractVariantMobMarkerBuilder<T, V, V> {
    public AbstractSingleVariantMobMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public final V getIconVariant(T mob) {
        return getVariant(mob);
    }

    @Override
    public final V getStyleClassesVariant(T mob) {
        return getVariant(mob);
    }

    public abstract V getVariant(T mob);
}
