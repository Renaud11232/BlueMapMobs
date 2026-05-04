package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Ravager;

public class BukkitRavager extends BukkitMob<org.bukkit.entity.Ravager> implements Ravager {
    public BukkitRavager(org.bukkit.entity.Ravager wrapped) {
        super(wrapped);
    }
}
