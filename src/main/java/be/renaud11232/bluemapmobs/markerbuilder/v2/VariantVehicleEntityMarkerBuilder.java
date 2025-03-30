package be.renaud11232.bluemapmobs.markerbuilder.v2;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Vehicle;

import java.util.Map;
import java.util.Optional;

public abstract class VariantVehicleEntityMarkerBuilder<T extends Vehicle, V> extends VehicleEntityMarkerBuilder<T> implements VariantMarkerBuilder<T, V> {
    private final Map<V, Icon> icons;

    public VariantVehicleEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        VariantIconRegistry<V> registry = new VariantIconRegistry<>();
        registerVariantIcons(registry);
        icons = registry.getItems();
    }

    @Override
    public Optional<POIMarker> build(T vehicle) {
        return super.build(vehicle).map(marker -> {
            Icon icon = icons.get(getVariant(vehicle));
            if (icon != null) {
                marker.setIcon(icon.getPath(), icon.getAnchor());
            }
            return marker;
        });
    }
}
