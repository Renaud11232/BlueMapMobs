package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Blaze;

public class BukkitBlaze extends BukkitMob<org.bukkit.entity.Blaze> implements Blaze {
    public BukkitBlaze(org.bukkit.entity.Blaze wrapped) {
        super(wrapped);
    }
}
