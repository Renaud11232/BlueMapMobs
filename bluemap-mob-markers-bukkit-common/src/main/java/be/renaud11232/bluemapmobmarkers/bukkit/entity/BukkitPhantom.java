package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Phantom;

public class BukkitPhantom extends BukkitMob<org.bukkit.entity.Phantom> implements Phantom {
    public BukkitPhantom(org.bukkit.entity.Phantom wrapped) {
        super(wrapped);
    }
}
