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
        register(AcaciaBoat.class, new AcaciaBoatMarkerBuilder(getAPI()));
        register(AcaciaChestBoat.class, new AcaciaChestBoatMarkerBuilder(getAPI()));
        register(BambooRaft.class, new BambooRaftMarkerBuilder(getAPI()));
        register(BambooChestRaft.class, new BambooChestRaftMarkerBuilder(getAPI()));
        register(BirchBoat.class, new BirchBoatMarkerBuilder(getAPI()));
        register(BirchChestBoat.class, new BirchChestBoatMarkerBuilder(getAPI()));
        register(CherryBoat.class, new CherryBoatMarkerBuilder(getAPI()));
        register(CherryChestBoat.class, new CherryChestBoatMarkerBuilder(getAPI()));
        register(DarkOakBoat.class, new DarkOakBoatMarkerBuilder(getAPI()));
        register(DarkOakChestBoat.class, new DarkOakChestBoatMarkerBuilder(getAPI()));
        register(JungleBoat.class, new JungleBoatMarkerBuilder(getAPI()));
        register(JungleChestBoat.class, new JungleChestBoatMarkerBuilder(getAPI()));
        register(MangroveBoat.class, new MangroveBoatMarkerBuilder(getAPI()));
        register(MangroveChestBoat.class, new MangroveChestBoatMarkerBuilder(getAPI()));
        register(OakBoat.class, new OakBoatMarkerBuilder(getAPI()));
        register(OakChestBoat.class, new OakChestBoatMarkerBuilder(getAPI()));
        register(PaleOakBoat.class, new PaleOakBoatMarkerBuilder(getAPI()));
        register(PaleOakChestBoat.class, new PaleOakChestBoatMarkerBuilder(getAPI()));
        register(SpruceBoat.class, new SpruceBoatMarkerBuilder(getAPI()));
        register(SpruceChestBoat.class, new SpruceChestBoatMarkerBuilder(getAPI()));
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
