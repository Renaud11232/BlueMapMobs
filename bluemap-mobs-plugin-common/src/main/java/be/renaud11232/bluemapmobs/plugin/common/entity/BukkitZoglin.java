package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Zoglin;

public class BukkitZoglin extends BukkitMob<org.bukkit.entity.Zoglin> implements Zoglin {
    public BukkitZoglin(org.bukkit.entity.Zoglin wrapped) {
        super(wrapped);
    }
}
