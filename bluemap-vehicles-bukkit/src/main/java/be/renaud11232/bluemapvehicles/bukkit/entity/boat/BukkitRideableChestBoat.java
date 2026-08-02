package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.boat.RideableBoat;
import be.renaud11232.bluemapvehicles.entity.boat.RideableChestBoat;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class BukkitRideableChestBoat extends BukkitVehicle<ChestBoat> implements RideableChestBoat {
    private final RideableBoat.Type type;

    public BukkitRideableChestBoat(AcaciaChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.ACACIA;
    }

    public BukkitRideableChestBoat(BirchChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.BIRCH;
    }

    public BukkitRideableChestBoat(CherryChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.CHERRY;
    }

    public BukkitRideableChestBoat(DarkOakChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.DARK_OAK;
    }

    public BukkitRideableChestBoat(JungleChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.JUNGLE;
    }

    public BukkitRideableChestBoat(MangroveChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.MANGROVE;
    }

    public BukkitRideableChestBoat(OakChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.OAK;
    }

    public BukkitRideableChestBoat(PaleOakChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.PALE_OAK;
    }

    public BukkitRideableChestBoat(SpruceChestBoat wrapped) {
        super(wrapped);
        type = RideableBoat.Type.SPRUCE;
    }

    @Override
    public RideableBoat.Type getType() {
        return type;
    }
}
