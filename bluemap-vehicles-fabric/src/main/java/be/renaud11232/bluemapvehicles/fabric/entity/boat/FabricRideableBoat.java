package be.renaud11232.bluemapvehicles.fabric.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;

import java.util.HashMap;
import java.util.Map;

public class FabricRideableBoat extends FabricVehicle<Boat> implements RideableBoat {
    private static final Map<EntityType<?>, Type> TYPE_MAP = new HashMap<>();

    public FabricRideableBoat(Boat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return TYPE_MAP.get(wrapped.getType());
    }

    static {
        TYPE_MAP.put(EntityType.ACACIA_BOAT, Type.ACACIA);
        TYPE_MAP.put(EntityType.BIRCH_BOAT, Type.BIRCH);
        TYPE_MAP.put(EntityType.CHERRY_BOAT, Type.CHERRY);
        TYPE_MAP.put(EntityType.DARK_OAK_BOAT, Type.DARK_OAK);
        TYPE_MAP.put(EntityType.JUNGLE_BOAT, Type.JUNGLE);
        TYPE_MAP.put(EntityType.MANGROVE_BOAT, Type.MANGROVE);
        TYPE_MAP.put(EntityType.OAK_BOAT, Type.OAK);
        TYPE_MAP.put(EntityType.PALE_OAK_BOAT, Type.PALE_OAK);
        TYPE_MAP.put(EntityType.SPRUCE_BOAT, Type.SPRUCE);
    }
}
