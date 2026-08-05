package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.EnderDragon;

public class BukkitEnderDragon extends BukkitMob<org.bukkit.entity.EnderDragon> implements EnderDragon {
    public BukkitEnderDragon(org.bukkit.entity.EnderDragon wrapped) {
        super(wrapped);
    }
}
