package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Enderman;

public class BukkitEnderman extends BukkitMob<org.bukkit.entity.Enderman> implements Enderman {
    public BukkitEnderman(org.bukkit.entity.Enderman wrapped) {
        super(wrapped);
    }
}
