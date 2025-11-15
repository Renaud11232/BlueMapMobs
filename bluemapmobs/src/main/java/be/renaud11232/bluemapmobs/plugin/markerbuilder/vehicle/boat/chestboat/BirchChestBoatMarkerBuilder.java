package be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle.boat.chestboat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.BirchChestBoat;

public class BirchChestBoatMarkerBuilder extends AbstractVehicleMarkerBuilder<BirchChestBoat> {
    public BirchChestBoatMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.BIRCH_CHEST_BOAT;
    }
}
