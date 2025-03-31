package be.renaud11232.bluemapmobs.markerbuilder;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

public abstract class SingleVariantVehicleEntityMarkerBuilder<T extends Vehicle, V> extends VariantVehicleEntityMarkerBuilder<T, V, V> {
    public SingleVariantVehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public final V getIconVariant(T vehicle) {
        return getVariant(vehicle);
    }

    @Override
    public final V getStyleClassesVariant(T vehicle) {
        return getVariant(vehicle);
    }

    public abstract V getVariant(T vehicle);
}
