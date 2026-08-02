package be.renaud11232.bluemapvehicles.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapentities.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import be.renaud11232.bluemapvehicles.entity.boat.*;
import be.renaud11232.bluemapvehicles.entity.minecart.*;
import be.renaud11232.bluemapvehicles.markerbuilder.boat.*;
import be.renaud11232.bluemapvehicles.markerbuilder.minecart.*;
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
