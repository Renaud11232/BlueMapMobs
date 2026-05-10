package be.renaud11232.bluemapvehicles.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapentities.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import be.renaud11232.bluemapvehicles.entity.boat.*;
import be.renaud11232.bluemapvehicles.entity.minecart.*;
import be.renaud11232.bluemapvehicles.markerbuilder.boat.*;
import be.renaud11232.bluemapvehicles.markerbuilder.minecart.*;

public class VehiclesMarkerBuilder extends SimpleMarkerBuilder<Vehicle> {
    public VehiclesMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        register(ChestRaft.class, new ChestRaftMarkerBuilder(getAPI()));
        register(Raft.class, new RaftMarkerBuilder(getAPI()));
        register(RideableBoat.class, new RideableBoatMarkerBuilder(getAPI()));
        register(RideableChestBoat.class, new RideableChestBoatMarkerBuilder(getAPI()));

        register(CommandMinecart.class, new CommandMinecartMarkerBuilder(getAPI()));
        register(ExplosiveMinecart.class, new ExplosiveMinecartMarkerBuilder(getAPI()));
        register(HopperMinecart.class, new HopperMinecartMarkerBuilder(getAPI()));
        register(PoweredMinecart.class, new PoweredMinecartMarkerBuilder(getAPI()));
        register(RideableMinecart.class, new RideableMinecartMarkerBuilder(getAPI()));
        register(SpawnerMinecart.class, new SpawnerMinecartMarkerBuilder(getAPI()));
        register(StorageMinecart.class, new StorageMinecartMarkerBuilder(getAPI()));

        register(UnknownEntity.class, new EmptyMarkerBuilder<>());
    }
}
