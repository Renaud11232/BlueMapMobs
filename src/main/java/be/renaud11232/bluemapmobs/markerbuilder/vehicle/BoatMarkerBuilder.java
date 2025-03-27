package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.*;
import be.renaud11232.bluemapmobs.visibility.VehicleMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class BoatMarkerBuilder extends VehicleEntityMarkerBuilder<Boat> {

    public BoatMarkerBuilder(FileConfiguration config) {
        super(config, VehicleMarkerVisibilityConfiguration.BOAT);
        registerMarkerBuilder(AcaciaBoat.class, new AcaciaBoatMarkerBuilder(config));
        registerMarkerBuilder(BambooRaft.class, new BambooRaftMarkerBuilder(config));
        registerMarkerBuilder(BirchBoat.class, new BirchBoatMarkerBuilder(config));
        registerMarkerBuilder(CherryBoat.class, new CherryBoatMarkerBuilder(config));
        registerMarkerBuilder(DarkOakBoat.class, new DarkOakBoatMarkerBuilder(config));
        registerMarkerBuilder(JungleBoat.class, new JungleBoatMarkerBuilder(config));
        registerMarkerBuilder(MangroveBoat.class, new MangroveBoatMarkerBuilder(config));
        registerMarkerBuilder(OakBoat.class, new OakBoatMarkerBuilder(config));
        registerMarkerBuilder(PaleOakBoat.class, new PaleOakBoatMarkerBuilder(config));
        registerMarkerBuilder(SpruceBoat.class, new SpruceBoatMarkerBuilder(config));
        registerMarkerBuilder(ChestBoat.class, new ChestBoatMarkerBuilder(config));
    }
}
