package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import be.renaud11232.bluemapmobs.registry.VariantStyleClassesRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Collection;
import java.util.Map;

public abstract class VariantMobEntityMarkerBuilder<T extends Mob, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends MobEntityMarkerBuilder<T> implements VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> {
    private final Map<ICON_VARIANT, Icon> icons;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public VariantMobEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        VariantIconRegistry<ICON_VARIANT> iconRegistry = new VariantIconRegistry<>();
        registerVariantIcons(iconRegistry);
        icons = iconRegistry.getItems();
        VariantStyleClassesRegistry<STYLE_CLASSES_VARIANT> styleClassesRegistry = new VariantStyleClassesRegistry<>();
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
