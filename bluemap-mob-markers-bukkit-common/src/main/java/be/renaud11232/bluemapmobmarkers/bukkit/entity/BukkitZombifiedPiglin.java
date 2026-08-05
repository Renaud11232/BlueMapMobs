package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.ZombifiedPiglin;

public class BukkitZombifiedPiglin extends BukkitAgeable<org.bukkit.entity.PigZombie> implements ZombifiedPiglin {
    public BukkitZombifiedPiglin(org.bukkit.entity.PigZombie wrapped) {
        super(wrapped);
    }
}
