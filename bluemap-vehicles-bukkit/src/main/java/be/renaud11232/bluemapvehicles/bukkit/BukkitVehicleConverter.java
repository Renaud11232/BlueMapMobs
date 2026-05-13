package be.renaud11232.bluemapvehicles.bukkit;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitUnknownVehicle;
import be.renaud11232.bluemapvehicles.bukkit.entity.boat.*;
import be.renaud11232.bluemapvehicles.bukkit.entity.minecart.*;
import org.bukkit.entity.Vehicle;
import org.bukkit.entity.boat.*;
import org.bukkit.entity.minecart.*;

public class BukkitVehicleConverter implements EntityConverter<Vehicle, be.renaud11232.bluemapvehicles.entity.Vehicle> {
    @Override
    public be.renaud11232.bluemapvehicles.entity.Vehicle convert(Vehicle vehicle) {
        return switch (vehicle) {
            case BambooChestRaft bambooChestRaft -> new BukkitChestRaft(bambooChestRaft);
            case AcaciaChestBoat acaciaChestBoat -> new BukkitRideableChestBoat(acaciaChestBoat);
            case BirchChestBoat birchChestBoat -> new BukkitRideableChestBoat(birchChestBoat);
            case CherryChestBoat chestChestBoat -> new BukkitRideableChestBoat(chestChestBoat);
            case DarkOakChestBoat darkOakChestBoat -> new BukkitRideableChestBoat(darkOakChestBoat);
            case JungleChestBoat jungleChestBoat -> new BukkitRideableChestBoat(jungleChestBoat);
            case MangroveChestBoat mangroveChestBoat -> new BukkitRideableChestBoat(mangroveChestBoat);
            case OakChestBoat oakChestBoat -> new BukkitRideableChestBoat(oakChestBoat);
            case PaleOakChestBoat paleOakChestBoat -> new BukkitRideableChestBoat(paleOakChestBoat);
            case SpruceChestBoat spruceChestBoat -> new BukkitRideableChestBoat(spruceChestBoat);
            case BambooRaft bambooRaft -> new BukkitRaft(bambooRaft);
            case AcaciaBoat acaciaBoat -> new BukkitRideableBoat(acaciaBoat);
            case BirchBoat birchBoat -> new BukkitRideableBoat(birchBoat);
            case CherryBoat cherryBoat -> new BukkitRideableBoat(cherryBoat);
            case DarkOakBoat darkOakBoat -> new BukkitRideableBoat(darkOakBoat);
            case JungleBoat jungleBoat -> new BukkitRideableBoat(jungleBoat);
            case MangroveBoat mangroveBoat -> new BukkitRideableBoat(mangroveBoat);
            case OakBoat oakBoat -> new BukkitRideableBoat(oakBoat);
            case PaleOakBoat paleOakBoat -> new BukkitRideableBoat(paleOakBoat);
            case SpruceBoat spruceBoat -> new BukkitRideableBoat(spruceBoat);

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
