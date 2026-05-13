package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import org.bukkit.entity.Boat;
import org.bukkit.entity.boat.*;

public class BukkitRideableBoat extends BukkitVehicle<Boat> implements RideableBoat {
    private final Type type;

    public BukkitRideableBoat(AcaciaBoat wrapped) {
        super(wrapped);
        type = Type.ACACIA;
    }

    public BukkitRideableBoat(BirchBoat wrapped) {
        super(wrapped);
        type = Type.BIRCH;
    }

    public BukkitRideableBoat(CherryBoat wrapped) {
        super(wrapped);
        type = Type.CHERRY;
    }

    public BukkitRideableBoat(DarkOakBoat wrapped) {
        super(wrapped);
        type = Type.DARK_OAK;
    }

    public BukkitRideableBoat(JungleBoat wrapped) {
        super(wrapped);
        type = Type.JUNGLE;
    }

    public BukkitRideableBoat(MangroveBoat wrapped) {
        super(wrapped);
        type = Type.MANGROVE;
    }

    public BukkitRideableBoat(OakBoat wrapped) {
        super(wrapped);
        type = Type.OAK;
    }

    public BukkitRideableBoat(PaleOakBoat wrapped) {
        super(wrapped);
        type = Type.PALE_OAK;
    }

    public BukkitRideableBoat(SpruceBoat wrapped) {
        super(wrapped);
        type = Type.SPRUCE;
    }

    public BukkitRideableBoat(Boat wrapped) {
        super(wrapped);
        type = null;
    }

    @Override
    public Type getType() {
        return type;
    }
}
