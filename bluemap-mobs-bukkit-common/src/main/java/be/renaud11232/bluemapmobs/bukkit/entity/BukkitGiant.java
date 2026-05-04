package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Giant;

public class BukkitGiant extends BukkitMob<org.bukkit.entity.Giant> implements Giant {
    public BukkitGiant(org.bukkit.entity.Giant wrapped) {
        super(wrapped);
    }
}
