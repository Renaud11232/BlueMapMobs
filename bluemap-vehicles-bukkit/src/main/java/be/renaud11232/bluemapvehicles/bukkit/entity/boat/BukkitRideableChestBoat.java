package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.entity.boat.RideableChestBoat;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class BukkitRideableChestBoat extends BukkitVehicle<ChestBoat> implements RideableChestBoat {
    public BukkitRideableChestBoat(ChestBoat wrapped) {
        super(wrapped);
    }

    @Override
    public RideableBoat.Type getType() {
        return switch (wrapped) {
            case AcaciaChestBoat _ -> RideableBoat.Type.ACACIA;
            case BirchChestBoat _ -> RideableBoat.Type.BIRCH;
            case CherryChestBoat _ -> RideableBoat.Type.CHERRY;
            case DarkOakChestBoat _ -> RideableBoat.Type.DARK_OAK;
            case JungleChestBoat _ -> RideableBoat.Type.JUNGLE;
            case MangroveChestBoat _ -> RideableBoat.Type.MANGROVE;
            case OakChestBoat _ -> RideableBoat.Type.OAK;
            case PaleOakChestBoat _ -> RideableBoat.Type.PALE_OAK;
            case SpruceChestBoat _ -> RideableBoat.Type.SPRUCE;
            default -> null;
        };
    }
}
