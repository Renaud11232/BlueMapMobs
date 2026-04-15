package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.PigZombie;

public class BukkitPigZombie extends BukkitAgeable<org.bukkit.entity.PigZombie> implements PigZombie {
    public BukkitPigZombie(org.bukkit.entity.PigZombie wrapped) {
        super(wrapped);
    }
}
