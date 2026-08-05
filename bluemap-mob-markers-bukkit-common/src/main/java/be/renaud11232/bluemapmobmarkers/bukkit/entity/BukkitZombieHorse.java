package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.ZombieHorse;

public class BukkitZombieHorse extends BukkitAgeable<org.bukkit.entity.ZombieHorse> implements ZombieHorse {
    public BukkitZombieHorse(org.bukkit.entity.ZombieHorse wrapped) {
        super(wrapped);
    }
}
