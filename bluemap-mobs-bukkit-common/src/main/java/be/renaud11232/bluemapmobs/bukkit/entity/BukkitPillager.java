package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Pillager;

public class BukkitPillager extends BukkitMob<org.bukkit.entity.Pillager> implements Pillager {
    public BukkitPillager(org.bukkit.entity.Pillager wrapped) {
        super(wrapped);
    }
}
