package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Bogged;

public class BukkitBogged extends BukkitMob<org.bukkit.entity.Bogged> implements Bogged {
    public BukkitBogged(org.bukkit.entity.Bogged wrapped) {
        super(wrapped);
    }
}
