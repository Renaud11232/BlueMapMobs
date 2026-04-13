package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.IronGolem;

public class BukkitIronGolem extends BukkitMob<org.bukkit.entity.IronGolem> implements IronGolem {
    public BukkitIronGolem(org.bukkit.entity.IronGolem wrapped) {
        super(wrapped);
    }
}
