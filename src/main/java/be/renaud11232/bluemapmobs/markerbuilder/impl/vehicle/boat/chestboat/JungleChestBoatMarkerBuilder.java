package be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.boat.chestboat;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.boat.JungleChestBoat;

public class JungleChestBoatMarkerBuilder extends AbstractVehicleMarkerBuilder<JungleChestBoat> {
    public JungleChestBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.JUNGLE_CHEST_BOAT;
    }
}
