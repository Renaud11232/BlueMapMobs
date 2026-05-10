package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import be.renaud11232.bluemapvehicles.fabric.entity.FabricUnknownVehicle;
import be.renaud11232.bluemapvehicles.fabric.entity.minecart.*;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.entity.vehicle.minecart.*;

public class FabricVehiclesConverter implements EntityConverter<VehicleEntity, Vehicle> {
    @Override
    public Vehicle convert(VehicleEntity vehicle) {
        return switch (vehicle) {

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
