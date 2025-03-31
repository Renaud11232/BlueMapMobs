package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import be.renaud11232.bluemapmobs.registry.VariantStyleClassesRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Collection;
import java.util.Map;

public abstract class VariantVehicleEntityMarkerBuilder<T extends Vehicle, ICON_VARIANT, STYLE_CLASSES_VARIANT> extends VehicleEntityMarkerBuilder<T> implements VariantMarkerBuilder<T, ICON_VARIANT, STYLE_CLASSES_VARIANT> {
    private final Map<ICON_VARIANT, Icon> icons;
    private final Map<STYLE_CLASSES_VARIANT, Collection<String>> styleClasses;

    public VariantVehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        VariantIconRegistry<ICON_VARIANT> registry = new VariantIconRegistry<>();
        registerVariantIcons(registry);
        icons = registry.getItems();
        VariantStyleClassesRegistry<STYLE_CLASSES_VARIANT> styleClassesRegistry = new VariantStyleClassesRegistry<>();
        registerVariantStyleClasses(styleClassesRegistry);
        styleClasses = styleClassesRegistry.getItems();
    }

    @Override
    public Icon getIcon(T vehicle) {
        return icons.get(getIconVariant(vehicle));
    }

    @Override
    public Collection<String> getStyleClasses(T vehicle) {
        return styleClasses.get(getStyleClassesVariant(vehicle));
    }
}
