package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.*;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class BoatMarkerBuilder extends VehicleEntityMarkerBuilder<Boat> {

    public BoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.BOAT);
        registerMarkerBuilder(AcaciaBoat.class, new AcaciaBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(BambooRaft.class, new BambooRaftMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(BirchBoat.class, new BirchBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(CherryBoat.class, new CherryBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(DarkOakBoat.class, new DarkOakBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(JungleBoat.class, new JungleBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(MangroveBoat.class, new MangroveBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(OakBoat.class, new OakBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(PaleOakBoat.class, new PaleOakBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(SpruceBoat.class, new SpruceBoatMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(ChestBoat.class, new ChestBoatMarkerBuilder(config, defaultConfig));
    }
}
