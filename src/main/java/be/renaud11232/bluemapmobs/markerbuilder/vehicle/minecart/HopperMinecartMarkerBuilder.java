package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.HopperMinecart;

public class HopperMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<HopperMinecart> {
    public HopperMinecartMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.HOPPER_MINECART, BlueMapMobsIcon.Vehicle.HOPPER_MINECART);
    }
}
