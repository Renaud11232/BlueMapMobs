package be.renaud11232.bluemapmobs.markerbuilder.vehicle;

import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class ChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<ChestBoat> {
    public ChestBoatMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.vehicles.markers.types.chest_boat");
        registerMarkerBuilder(AcaciaChestBoat.class, new AcaciaChestBoatMarkerBuilder(config));
        registerMarkerBuilder(BambooChestRaft.class, new BambooChestRaftMarkerBuilder(config));
        registerMarkerBuilder(BirchChestBoat.class, new BirchChestBoatMarkerBuilder(config));
        registerMarkerBuilder(CherryChestBoat.class, new CherryChestBoatMarkerBuilder(config));
        registerMarkerBuilder(DarkOakChestBoat.class, new DarkOakChestBoatMarkerBuilder(config));
        registerMarkerBuilder(JungleChestBoat.class, new JungleChestBoatMarkerBuilder(config));
        registerMarkerBuilder(MangroveChestBoat.class, new MangroveChestBoatMarkerBuilder(config));
        registerMarkerBuilder(OakChestBoat.class, new OakChestBoatMarkerBuilder(config));
        registerMarkerBuilder(PaleOakChestBoat.class, new PaleOakChestBoatMarkerBuilder(config));
        registerMarkerBuilder(SpruceChestBoat.class, new SpruceChestBoatMarkerBuilder(config));
    }
}
