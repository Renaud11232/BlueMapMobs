package be.renaud11232.bluemapvehicles.fabric.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.entity.boat.RideableChestBoat;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;

import java.util.HashMap;
import java.util.Map;

public class FabricRideableChestBoat extends FabricVehicle<ChestBoat> implements RideableChestBoat {
    private static final Map<EntityType<?>, RideableBoat.Type> TYPE_MAP = new HashMap<>();

    static {
        TYPE_MAP.put(EntityTypes.ACACIA_CHEST_BOAT, RideableBoat.Type.ACACIA);
        TYPE_MAP.put(EntityTypes.BIRCH_CHEST_BOAT, RideableBoat.Type.BIRCH);
        TYPE_MAP.put(EntityTypes.CHERRY_CHEST_BOAT, RideableBoat.Type.CHERRY);
        TYPE_MAP.put(EntityTypes.DARK_OAK_CHEST_BOAT, RideableBoat.Type.DARK_OAK);
        TYPE_MAP.put(EntityTypes.JUNGLE_CHEST_BOAT, RideableBoat.Type.JUNGLE);
        TYPE_MAP.put(EntityTypes.MANGROVE_CHEST_BOAT, RideableBoat.Type.MANGROVE);
        TYPE_MAP.put(EntityTypes.OAK_CHEST_BOAT, RideableBoat.Type.OAK);
        TYPE_MAP.put(EntityTypes.PALE_OAK_CHEST_BOAT, RideableBoat.Type.PALE_OAK);
        TYPE_MAP.put(EntityTypes.SPRUCE_CHEST_BOAT, RideableBoat.Type.SPRUCE);
    }

    public FabricRideableChestBoat(ChestBoat wrapped) {
        super(wrapped);
    }

    @Override
    public RideableBoat.Type getType() {
        return TYPE_MAP.get(wrapped.getType());
    }
}
