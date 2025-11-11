package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.Registry;
import be.renaud11232.bluemapmobs.registry.impl.SimpleRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Collection;

public abstract class AbstractVariantMobMarkerBuilder<T extends Mob, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends AbstractMobMarkerBuilder<T> implements VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> {
    private final Registry<ICON_VARIANT, Icon> icons;
    private final Registry<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public AbstractVariantMobMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
        icons = new SimpleRegistry<>();
        styleClasses = new SimpleRegistry<>();
        registerVariantIcons(icons);
        registerVariantStyleClasses(styleClasses);
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
