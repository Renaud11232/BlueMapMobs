package be.renaud11232.bluemapvehiclemarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;
import be.renaud11232.bluemapentitymarkers.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentitymarkers.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.entity.Vehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.ChestRaft;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.Raft;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.RideableChestBoat;
import be.renaud11232.bluemapvehiclemarkers.entity.minecart.*;
import be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat.ChestRaftMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat.RaftMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat.RideableBoatMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.markerbuilder.boat.RideableChestBoatMarkerBuilder;
import be.renaud11232.bluemapvehiclemarkers.markerbuilder.minecart.*;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class VehiclesMarkerBuilder extends SimpleMarkerBuilder<Vehicle> {
    public VehiclesMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        register(ChestRaft.class, new ChestRaftMarkerBuilder(getAPI(), getConfiguration()));
        register(Raft.class, new RaftMarkerBuilder(getAPI(), getConfiguration()));
        register(RideableBoat.class, new RideableBoatMarkerBuilder(getAPI(), getConfiguration()));
        register(RideableChestBoat.class, new RideableChestBoatMarkerBuilder(getAPI(), getConfiguration()));

        register(CommandMinecart.class, new CommandMinecartMarkerBuilder(getAPI(), getConfiguration()));
        register(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder(getAPI(), getConfiguration()));
        register(HopperMinecart.class, new HopperMinecartMarkerBuilder(getAPI(), getConfiguration()));
        register(PoweredMinecart.class, new PoweredMinecartMarkerBuilder(getAPI(), getConfiguration()));
        register(RideableMinecart.class, new RideableMinecartMarkerBuilder(getAPI(), getConfiguration()));
        register(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder(getAPI(), getConfiguration()));
        register(StorageMinecart.class, new StorageMinecartMarkerBuilder(getAPI(), getConfiguration()));

        register(UnknownEntity.class, new EmptyMarkerBuilder<>());
    }
}
