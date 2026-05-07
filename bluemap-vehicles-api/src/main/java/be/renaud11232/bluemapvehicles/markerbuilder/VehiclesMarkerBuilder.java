package be.renaud11232.bluemapvehicles.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.DefaultMarkerType;
import be.renaud11232.bluemapentities.markerbuilder.EmptyMarkerBuilder;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapvehicles.VehiclesMarkerType;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import be.renaud11232.bluemapvehicles.markerbuilder.boat.*;
import be.renaud11232.bluemapvehicles.markerbuilder.minecart.*;

public class VehiclesMarkerBuilder extends SimpleMarkerBuilder<Vehicle> {
    public VehiclesMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        register(VehiclesMarkerType.ACACIA_BOAT, new AcaciaBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.ACACIA_CHEST_BOAT, new AcaciaChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.BAMBOO_RAFT, new BambooRaftMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.BAMBOO_CHEST_RAFT, new BambooChestRaftMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.BIRCH_BOAT, new BirchBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.BIRCH_CHEST_BOAT, new BirchChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.CHERRY_BOAT, new CherryBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.CHERRY_CHEST_BOAT, new CherryChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.DARK_OAK_BOAT, new DarkOakBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.DARK_OAK_CHEST_BOAT, new DarkOakChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.JUNGLE_BOAT, new JungleBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.JUNGLE_CHEST_BOAT, new JungleChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.MANGROVE_BOAT, new MangroveBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.MANGROVE_CHEST_BOAT, new MangroveChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.OAK_BOAT, new OakBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.OAK_CHEST_BOAT, new OakChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.PALE_OAK_BOAT, new PaleOakBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.PALE_OAK_CHEST_BOAT, new PaleOakChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.SPRUCE_BOAT, new SpruceBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.SPRUCE_CHEST_BOAT, new SpruceChestBoatMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.COMMAND_MINECART, new CommandMinecartMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.EXPLOSIVE_MINECART, new ExplosiveMinecartMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.HOPPER_MINECART, new HopperMinecartMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.POWERED_MINECART, new PoweredMinecartMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.RIDEABLE_MINECART, new RideableMinecartMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.SPAWNER_MINECART, new SpawnerMinecartMarkerBuilder(getAPI()));
        register(VehiclesMarkerType.STORAGE_MINECART, new StorageMinecartMarkerBuilder(getAPI()));

        register(DefaultMarkerType.UNKNOWN, new EmptyMarkerBuilder<>());
    }
}
