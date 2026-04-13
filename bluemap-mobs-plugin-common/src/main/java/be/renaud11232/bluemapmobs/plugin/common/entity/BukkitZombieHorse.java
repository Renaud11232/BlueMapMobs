package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.ZombieHorse;

public class BukkitZombieHorse extends BukkitAgeable<org.bukkit.entity.ZombieHorse> implements ZombieHorse {
    public BukkitZombieHorse(org.bukkit.entity.ZombieHorse wrapped) {
        super(wrapped);
    }
}
