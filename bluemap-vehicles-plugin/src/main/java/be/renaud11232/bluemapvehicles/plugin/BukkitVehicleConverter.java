package be.renaud11232.bluemapvehicles.plugin;

import be.renaud11232.bluemapentities.EntityConverter;
import be.renaud11232.bluemapvehicles.plugin.entities.UnsupportedBukkitVehicle;
import be.renaud11232.bluemapvehicles.plugin.entities.boat.*;
import be.renaud11232.bluemapvehicles.plugin.entities.minecart.*;
import org.bukkit.entity.Vehicle;
import org.bukkit.entity.boat.*;
import org.bukkit.entity.minecart.*;

public class BukkitVehicleConverter implements EntityConverter<Vehicle, be.renaud11232.bluemapvehicles.entities.Vehicle> {
    @Override
    public be.renaud11232.bluemapvehicles.entities.Vehicle convert(Vehicle vehicle) {
        return switch (vehicle) {
            case AcaciaChestBoat acaciaChestBoat -> new BukkitAcaciaChestBoat(acaciaChestBoat);
            case AcaciaBoat acaciaBoat -> new BukkitAcaciaBoat(acaciaBoat);
            case BambooChestRaft bambooChestRaft -> new BukkitBambooChestRaft(bambooChestRaft);
            case BambooRaft bambooRaft -> new BukkitBambooRaft(bambooRaft);
            case BirchChestBoat birchChestBoat -> new BukkitBirchChestBoat(birchChestBoat);
            case BirchBoat birchBoat -> new BukkitBirchBoat(birchBoat);
            case CherryChestBoat cherryChestBoat -> new BukkitCherryChestBoat(cherryChestBoat);
            case CherryBoat cherryBoat -> new BukkitCherryBoat(cherryBoat);
            case DarkOakChestBoat darkOakChestBoat -> new BukkitDarkOakChestBoat(darkOakChestBoat);
            case DarkOakBoat darkOakBoat -> new BukkitDarkOakBoat(darkOakBoat);
            case JungleChestBoat jungleChestBoat -> new BukkitJungleChestBoat(jungleChestBoat);
            case JungleBoat jungleBoat -> new BukkitJungleBoat(jungleBoat);
            case MangroveChestBoat mangroveChestBoat -> new BukkitMangroveChestBoat(mangroveChestBoat);
            case MangroveBoat mangroveBoat -> new BukkitMangroveBoat(mangroveBoat);
            case OakChestBoat oakChestBoat -> new BukkitOakChestBoat(oakChestBoat);
            case OakBoat oakBoat -> new BukkitOakBoat(oakBoat);
            case PaleOakChestBoat paleOakChestBoat -> new BukkitPaleOakChestBoat(paleOakChestBoat);
            case PaleOakBoat paleOakBoat -> new BukkitPaleOakBoat(paleOakBoat);
            case SpruceChestBoat spruceChestBoat -> new BukkitSpruceChestBoat(spruceChestBoat);
            case SpruceBoat spruceBoat -> new BukkitSpruceBoat(spruceBoat);

            case CommandMinecart commandMinecart -> new BukkitCommandMinecart(commandMinecart);
            case ExplosiveMinecart explosiveMinecart -> new BukkitExplosiveMinecart(explosiveMinecart);
            case HopperMinecart hopperMinecart -> new BukkitHopperMinecart(hopperMinecart);
            case PoweredMinecart poweredMinecart -> new BukkitPoweredMinecart(poweredMinecart);
            case RideableMinecart rideableMinecart -> new BukkitRideableMinecart(rideableMinecart);
            case SpawnerMinecart spawnerMinecart -> new BukkitSpawnerMinecart(spawnerMinecart);
            case StorageMinecart storageMinecart -> new BukkitStorageMinecart(storageMinecart);

            default -> new UnsupportedBukkitVehicle(vehicle);
        };
    }
}
