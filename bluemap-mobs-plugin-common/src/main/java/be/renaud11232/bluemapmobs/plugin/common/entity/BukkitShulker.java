package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Shulker;

public class BukkitShulker extends BukkitMob<org.bukkit.entity.Shulker> implements Shulker {
    public BukkitShulker(org.bukkit.entity.Shulker wrapped) {
        super(wrapped);
    }
}
