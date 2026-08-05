package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Tadpole;

public class BukkitTadpole extends BukkitMob<org.bukkit.entity.Tadpole> implements Tadpole {
    public BukkitTadpole(org.bukkit.entity.Tadpole wrapped) {
        super(wrapped);
    }
}
