package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Bogged;

public class BukkitBogged extends BukkitMob<org.bukkit.entity.Bogged> implements Bogged {
    public BukkitBogged(org.bukkit.entity.Bogged wrapped) {
        super(wrapped);
    }
}
