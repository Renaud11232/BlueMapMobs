package be.renaud11232.bluemapvehiclemarkers.bukkit.entity.boat;

import be.renaud11232.bluemapvehiclemarkers.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehiclemarkers.entity.boat.Raft;
import org.bukkit.entity.boat.BambooRaft;

public class BukkitRaft extends BukkitVehicle<BambooRaft> implements Raft {
    public BukkitRaft(BambooRaft wrapped) {
        super(wrapped);
    }
}
