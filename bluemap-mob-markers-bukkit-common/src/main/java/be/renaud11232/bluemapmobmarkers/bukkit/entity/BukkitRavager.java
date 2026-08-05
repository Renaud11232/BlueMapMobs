package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Ravager;

public class BukkitRavager extends BukkitMob<org.bukkit.entity.Ravager> implements Ravager {
    public BukkitRavager(org.bukkit.entity.Ravager wrapped) {
        super(wrapped);
    }
}
