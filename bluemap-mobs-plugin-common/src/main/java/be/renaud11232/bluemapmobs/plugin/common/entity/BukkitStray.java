package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Stray;

public class BukkitStray extends BukkitMob<org.bukkit.entity.Stray> implements Stray {
    public BukkitStray(org.bukkit.entity.Stray wrapped) {
        super(wrapped);
    }
}
