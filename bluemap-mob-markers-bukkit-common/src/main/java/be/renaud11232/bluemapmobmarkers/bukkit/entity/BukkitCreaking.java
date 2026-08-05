package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Creaking;

public class BukkitCreaking extends BukkitMob<org.bukkit.entity.Creaking> implements Creaking {
    public BukkitCreaking(org.bukkit.entity.Creaking wrapped) {
        super(wrapped);
    }
}
