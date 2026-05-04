package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Creaking;

public class BukkitCreaking extends BukkitMob<org.bukkit.entity.Creaking> implements Creaking {
    public BukkitCreaking(org.bukkit.entity.Creaking wrapped) {
        super(wrapped);
    }
}
