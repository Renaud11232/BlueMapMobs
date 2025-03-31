package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Map;

public abstract class VariantMobEntityMarkerBuilder<T extends Mob, V> extends MobEntityMarkerBuilder<T> implements VariantMarkerBuilder<T, V> {
    private final Map<V, Icon> icons;

    public VariantMobEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        VariantIconRegistry<V> registry = new VariantIconRegistry<>();
        registerVariantIcons(registry);
        icons = registry.getItems();
    }

    @Override
    public Icon getIcon(T mob) {
        return icons.get(getVariant(mob));
    }
}
