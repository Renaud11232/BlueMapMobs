package be.renaud11232.bluemapmobs.vehicles;

import be.renaud11232.bluemapmobs.MarkerBuilder;
import org.bukkit.entity.Vehicle;

public interface VehicleEntityMarkerBuilder<T extends Vehicle> extends MarkerBuilder<T> {

    @Override
    default String getAsset(String file) {
        return MarkerBuilder.super.getAsset("vehicles/" + file);
    }

}
