package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Salmon;

public class BukkitSalmon extends BukkitMob<org.bukkit.entity.Salmon> implements Salmon {
    public BukkitSalmon(org.bukkit.entity.Salmon wrapped) {
        super(wrapped);
    }
}
