package be.renaud11232.bluemapvehicles.bukkit;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitUnknownVehicle;
import be.renaud11232.bluemapvehicles.bukkit.entity.boat.*;
import be.renaud11232.bluemapvehicles.bukkit.entity.minecart.*;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.Vehicle;
import org.bukkit.entity.boat.*;
import org.bukkit.entity.minecart.*;

public class BukkitVehicleConverter implements EntityConverter<Vehicle, be.renaud11232.bluemapvehicles.entity.Vehicle> {
    @Override
    public be.renaud11232.bluemapvehicles.entity.Vehicle convert(Vehicle vehicle) {
        return switch (vehicle) {
            case BambooChestRaft bambooChestRaft -> new BukkitChestRaft(bambooChestRaft);
            case ChestBoat chestBoat -> new BukkitRideableChestBoat(chestBoat);
            case BambooRaft bambooRaft -> new BukkitRaft(bambooRaft);
            case Boat boat -> new BukkitRideableBoat(boat);

            case CommandMinecart commandMinecart -> new BukkitCommandMinecart(commandMinecart);
            case ExplosiveMinecart explosiveMinecart -> new BukkitExplosiveMinecart(explosiveMinecart);
            case HopperMinecart hopperMinecart -> new BukkitHopperMinecart(hopperMinecart);
            case PoweredMinecart poweredMinecart -> new BukkitPoweredMinecart(poweredMinecart);
            case RideableMinecart rideableMinecart -> new BukkitRideableMinecart(rideableMinecart);
            case SpawnerMinecart spawnerMinecart -> new BukkitSpawnerMinecart(spawnerMinecart);
            case StorageMinecart storageMinecart -> new BukkitStorageMinecart(storageMinecart);

            default -> new BukkitUnknownVehicle(vehicle);
        };
    }
}
