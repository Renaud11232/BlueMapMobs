package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Piglin;

public class BukkitPiglin extends BukkitMob<org.bukkit.entity.Piglin> implements Piglin {
    public BukkitPiglin(org.bukkit.entity.Piglin wrapped) {
        super(wrapped);
    }
}
