package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.MagmaCube;

public class BukkitMagmaCube extends BukkitMob<org.bukkit.entity.MagmaCube> implements MagmaCube {
    public BukkitMagmaCube(org.bukkit.entity.MagmaCube wrapped) {
        super(wrapped);
    }
}
