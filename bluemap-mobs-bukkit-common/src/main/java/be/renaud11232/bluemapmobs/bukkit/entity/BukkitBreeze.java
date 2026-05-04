package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Breeze;

public class BukkitBreeze extends BukkitMob<org.bukkit.entity.Breeze> implements Breeze {
    public BukkitBreeze(org.bukkit.entity.Breeze wrapped) {
        super(wrapped);
    }
}
