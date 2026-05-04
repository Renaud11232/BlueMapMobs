package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Allay;

public class BukkitAllay extends BukkitMob<org.bukkit.entity.Allay> implements Allay {
    public BukkitAllay(org.bukkit.entity.Allay wrapped) {
        super(wrapped);
    }
}
