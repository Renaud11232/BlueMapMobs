package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Tadpole;

public class BukkitTadpole extends BukkitMob<org.bukkit.entity.Tadpole> implements Tadpole {
    public BukkitTadpole(org.bukkit.entity.Tadpole wrapped) {
        super(wrapped);
    }
}
