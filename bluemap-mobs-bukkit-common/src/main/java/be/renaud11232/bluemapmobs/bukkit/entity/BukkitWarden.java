package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Warden;

public class BukkitWarden extends BukkitMob<org.bukkit.entity.Warden> implements Warden {
    public BukkitWarden(org.bukkit.entity.Warden wrapped) {
        super(wrapped);
    }
}
