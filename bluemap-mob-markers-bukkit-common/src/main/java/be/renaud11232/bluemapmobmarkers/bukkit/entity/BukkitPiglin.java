package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Piglin;

public class BukkitPiglin extends BukkitAgeable<org.bukkit.entity.Piglin> implements Piglin {
    public BukkitPiglin(org.bukkit.entity.Piglin wrapped) {
        super(wrapped);
    }
}
