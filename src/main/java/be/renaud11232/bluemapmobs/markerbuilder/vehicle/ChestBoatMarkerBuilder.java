package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.*;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class ChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<ChestBoat> {
    public ChestBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.CHEST_BOAT);
        registerMarkerBuilder(AcaciaChestBoat.class, new AcaciaChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(BambooChestRaft.class, new BambooChestRaftMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(BirchChestBoat.class, new BirchChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(CherryChestBoat.class, new CherryChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(DarkOakChestBoat.class, new DarkOakChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(JungleChestBoat.class, new JungleChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(MangroveChestBoat.class, new MangroveChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(OakChestBoat.class, new OakChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PaleOakChestBoat.class, new PaleOakChestBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(SpruceChestBoat.class, new SpruceChestBoatMarkerBuilder(config, defaultConfig));
    }
}
