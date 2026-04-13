package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.EnderDragon;

public class BukkitEnderDragon extends BukkitMob<org.bukkit.entity.EnderDragon> implements EnderDragon {
    public BukkitEnderDragon(org.bukkit.entity.EnderDragon wrapped) {
        super(wrapped);
    }
}
