package be.renaud11232.bluemapvehicles.fabric.entity.boat;

import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.entity.boat.RideableChestBoat;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricVehicle;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;

public class FabricRideableChestBoat extends FabricVehicle<ChestBoat> implements RideableChestBoat {
    public FabricRideableChestBoat(ChestBoat wrapped) {
        super(wrapped);
    }

    @Override
    public RideableBoat.Type getType() {
        var type = wrapped.getType();
        if (type.equals(EntityType.ACACIA_CHEST_BOAT)) {
            return RideableBoat.Type.ACACIA;
        } else if (type.equals(EntityType.BIRCH_CHEST_BOAT)) {
            return RideableBoat.Type.BIRCH;
        } else if (type.equals(EntityType.CHERRY_CHEST_BOAT)) {
            return RideableBoat.Type.CHERRY;
        } else if (type.equals(EntityType.DARK_OAK_CHEST_BOAT)) {
            return RideableBoat.Type.DARK_OAK;
        } else if (type.equals(EntityType.JUNGLE_CHEST_BOAT)) {
            return RideableBoat.Type.JUNGLE;
        } else if (type.equals(EntityType.MANGROVE_CHEST_BOAT)) {
            return RideableBoat.Type.MANGROVE;
        } else if (type.equals(EntityType.OAK_CHEST_BOAT)) {
            return RideableBoat.Type.OAK;
        } else if (type.equals(EntityType.PALE_OAK_CHEST_BOAT)) {
            return RideableBoat.Type.PALE_OAK;
        } else if (type.equals(EntityType.SPRUCE_CHEST_BOAT)) {
            return RideableBoat.Type.SPRUCE;
        } else {
            return null;
        }
    }
}
