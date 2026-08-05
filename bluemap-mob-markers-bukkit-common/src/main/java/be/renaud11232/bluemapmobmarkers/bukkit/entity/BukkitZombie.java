package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Zombie;

public class BukkitZombie extends BukkitAgeable<org.bukkit.entity.Zombie> implements Zombie {
    public BukkitZombie(org.bukkit.entity.Zombie wrapped) {
        super(wrapped);
    }
}
