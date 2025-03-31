package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Map;

public abstract class VariantVehicleEntityMarkerBuilder<T extends Vehicle, V> extends VehicleEntityMarkerBuilder<T> implements VariantMarkerBuilder<T, V> {
    private final Map<V, Icon> icons;

    public VariantVehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        VariantIconRegistry<V> registry = new VariantIconRegistry<>();
        registerVariantIcons(registry);
        icons = registry.getItems();
    }

    @Override
    public Icon getIcon(T vehicle) {
        return icons.get(getVariant(vehicle));
    }
}
