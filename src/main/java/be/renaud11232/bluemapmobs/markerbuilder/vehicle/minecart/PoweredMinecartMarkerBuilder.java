package be.renaud11232.bluemapmobs.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.PoweredMinecart;

public class PoweredMinecartMarkerBuilder extends VehicleEntityMarkerBuilder<PoweredMinecart> {
    public PoweredMinecartMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.POWERED_MINECART, BlueMapMobsIcon.Vehicle.FURNACE_MINECART);
    }
}
