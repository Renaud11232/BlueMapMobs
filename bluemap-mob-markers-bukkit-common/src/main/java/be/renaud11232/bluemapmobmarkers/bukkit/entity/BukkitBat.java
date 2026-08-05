package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Bat;

public class BukkitBat extends BukkitMob<org.bukkit.entity.Bat> implements Bat {
    public BukkitBat(org.bukkit.entity.Bat wrapped) {
        super(wrapped);
    }
}
