package be.renaud11232.bluemapvehiclemarkers.fabric.entity.boat;

import be.renaud11232.bluemapvehiclemarkers.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehiclemarkers.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.vehicle.boat.Boat;

import java.util.HashMap;
import java.util.Map;

public class FabricRideableBoat extends FabricVehicle<Boat> implements RideableBoat {
    private static final Map<EntityType<?>, Type> TYPE_MAP = new HashMap<>();

    static {
        TYPE_MAP.put(EntityTypes.ACACIA_BOAT, Type.ACACIA);
        TYPE_MAP.put(EntityTypes.BIRCH_BOAT, Type.BIRCH);
        TYPE_MAP.put(EntityTypes.CHERRY_BOAT, Type.CHERRY);
        TYPE_MAP.put(EntityTypes.DARK_OAK_BOAT, Type.DARK_OAK);
        TYPE_MAP.put(EntityTypes.JUNGLE_BOAT, Type.JUNGLE);
        TYPE_MAP.put(EntityTypes.MANGROVE_BOAT, Type.MANGROVE);
        TYPE_MAP.put(EntityTypes.OAK_BOAT, Type.OAK);
        TYPE_MAP.put(EntityTypes.PALE_OAK_BOAT, Type.PALE_OAK);
        TYPE_MAP.put(EntityTypes.SPRUCE_BOAT, Type.SPRUCE);
    }

    public FabricRideableBoat(Boat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return TYPE_MAP.get(wrapped.getType());
    }
}
