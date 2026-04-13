package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Mule;

public class BukkitMule extends BukkitAgeable<org.bukkit.entity.Mule> implements Mule {
    public BukkitMule(org.bukkit.entity.Mule wrapped) {
        super(wrapped);
    }
}
