package be.renaud11232.bluemapvehicles.bukkit.entity.boat;

import be.renaud11232.bluemapvehicles.bukkit.entity.BukkitVehicle;
import be.renaud11232.bluemapvehicles.entity.boat.Raft;
import org.bukkit.entity.boat.BambooRaft;

public class BukkitRaft extends BukkitVehicle<BambooRaft> implements Raft {
    public BukkitRaft(BambooRaft wrapped) {
        super(wrapped);
    }
}
