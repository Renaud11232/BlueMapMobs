package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Blaze;

public class BukkitBlaze extends BukkitMob<org.bukkit.entity.Blaze> implements Blaze {
    public BukkitBlaze(org.bukkit.entity.Blaze wrapped) {
        super(wrapped);
    }
}
