package be.renaud11232.bluemapvehicles.fabric.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.Boat;

public class FabricRideableBoat extends FabricVehicle<Boat> implements RideableBoat {
    public FabricRideableBoat(Boat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        var type = wrapped.getType();
        if (type.equals(EntityType.ACACIA_BOAT)) {
            return Type.ACACIA;
        } else if (type.equals(EntityType.BIRCH_BOAT)) {
            return Type.BIRCH;
        } else if (type.equals(EntityType.CHERRY_BOAT)) {
            return Type.CHERRY;
        } else if (type.equals(EntityType.DARK_OAK_BOAT)) {
            return Type.DARK_OAK;
        } else if (type.equals(EntityType.JUNGLE_BOAT)) {
            return Type.JUNGLE;
        } else if (type.equals(EntityType.MANGROVE_BOAT)) {
            return Type.MANGROVE;
        } else if (type.equals(EntityType.OAK_BOAT)) {
            return Type.OAK;
        } else if (type.equals(EntityType.PALE_OAK_BOAT)) {
            return Type.PALE_OAK;
        } else if (type.equals(EntityType.SPRUCE_BOAT)) {
            return Type.SPRUCE;
        } else {
            return null;
        }
    }
}
