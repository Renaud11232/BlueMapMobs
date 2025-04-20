package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.Registry;
import be.renaud11232.bluemapmobs.registry.impl.SimpleRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Collection;
import java.util.Map;

public abstract class AbstractVariantMobMarkerBuilder<T extends Mob, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends AbstractMobMarkerBuilder<T> implements VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> {
    private final Map<ICON_VARIANT, Icon> icons;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public AbstractVariantMobMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        Registry<ICON_VARIANT, Icon> iconRegistry = new SimpleRegistry<>();
        registerVariantIcons(iconRegistry);
        icons = iconRegistry.getItems();
        Registry<STYLE_CLASSES_VARIANT, Collection<String>> styleClassesRegistry = new SimpleRegistry<>();
        registerVariantStyleClasses(styleClassesRegistry);
        styleClasses = styleClassesRegistry.getItems();
    }

    @Override
    public Icon getIcon(T mob) {
        return icons.get(getIconVariant(mob));
    }

    @Override
    public Collection<String> getStyleClasses(T mob) {
        return styleClasses.get(getStyleClassesVariant(mob));
    }
}
