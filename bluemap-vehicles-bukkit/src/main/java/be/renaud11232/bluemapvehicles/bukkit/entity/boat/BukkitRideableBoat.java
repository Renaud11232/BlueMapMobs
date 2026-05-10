package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import org.bukkit.entity.Boat;
import org.bukkit.entity.boat.*;

public class BukkitRideableBoat extends BukkitVehicle<Boat> implements RideableBoat {
    public BukkitRideableBoat(Boat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped) {
            case AcaciaBoat _ -> Type.ACACIA;
            case BirchBoat _ -> Type.BIRCH;
            case CherryBoat _ -> Type.CHERRY;
            case DarkOakBoat _ -> Type.DARK_OAK;
            case JungleBoat _ -> Type.JUNGLE;
            case MangroveBoat _ -> Type.MANGROVE;
            case OakBoat _ -> Type.OAK;
            case PaleOakBoat _ -> Type.PALE_OAK;
            case SpruceBoat _ -> Type.SPRUCE;
            default -> null;
        };
    }
}
