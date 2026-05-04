package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Zombie;

public class BukkitZombie extends BukkitAgeable<org.bukkit.entity.Zombie> implements Zombie {
    public BukkitZombie(org.bukkit.entity.Zombie wrapped) {
        super(wrapped);
    }
}
