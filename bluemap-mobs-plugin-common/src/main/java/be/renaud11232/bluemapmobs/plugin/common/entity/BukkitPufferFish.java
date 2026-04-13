package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.PufferFish;

public class BukkitPufferFish extends BukkitMob<org.bukkit.entity.PufferFish> implements PufferFish {
    public BukkitPufferFish(org.bukkit.entity.PufferFish wrapped) {
        super(wrapped);
    }
}
