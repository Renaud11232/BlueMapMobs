package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricUnknownVehicle;
import be.renaud11232.bluemapvehicles.fabric.entity.boat.FabricChestRaft;
import be.renaud11232.bluemapvehicles.fabric.entity.boat.FabricRaft;
import be.renaud11232.bluemapvehicles.fabric.entity.boat.FabricRideableBoat;
import be.renaud11232.bluemapvehicles.fabric.entity.boat.FabricRideableChestBoat;
import be.renaud11232.bluemapvehicles.fabric.entity.minecart.*;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.entity.vehicle.boat.ChestRaft;
import net.minecraft.world.entity.vehicle.boat.Raft;
import net.minecraft.world.entity.vehicle.minecart.*;

public class FabricVehiclesConverter implements EntityConverter<VehicleEntity, Vehicle> {
    @Override
    public Vehicle convert(VehicleEntity vehicle) {
        return switch (vehicle) {
            case ChestRaft chestRaft -> new FabricChestRaft(chestRaft);
            case ChestBoat chestBoat -> new FabricRideableChestBoat(chestBoat);
            case Raft raft -> new FabricRaft(raft);
            case Boat boat -> new FabricRideableBoat(boat);

            case MinecartCommandBlock minecartCommandBlock -> new FabricCommandMinecart(minecartCommandBlock);
            case MinecartTNT minecartTNT -> new FabricExplosiveMinecart(minecartTNT);
            case MinecartHopper minecartHopper -> new FabricHopperMinecart(minecartHopper);
            case MinecartFurnace minecartFurnace -> new FabricPoweredMinecart(minecartFurnace);
            case Minecart minecart -> new FabricRideableMinecart(minecart);
            case MinecartSpawner minecartSpawner -> new FabricSpawnerMinecart(minecartSpawner);
            case MinecartChest minecartChest -> new FabricStorageMinecart(minecartChest);

            default -> new FabricUnknownVehicle(vehicle);
        };
    }
}
