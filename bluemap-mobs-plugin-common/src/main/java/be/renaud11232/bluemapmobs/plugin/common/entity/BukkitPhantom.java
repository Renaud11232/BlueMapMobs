package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Phantom;

public class BukkitPhantom extends BukkitMob<org.bukkit.entity.Phantom> implements Phantom {
    public BukkitPhantom(org.bukkit.entity.Phantom wrapped) {
        super(wrapped);
    }
}
