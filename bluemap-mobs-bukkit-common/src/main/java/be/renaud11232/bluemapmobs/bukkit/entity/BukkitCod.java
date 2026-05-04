package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Cod;

public class BukkitCod extends BukkitMob<org.bukkit.entity.Cod> implements Cod {
    public BukkitCod(org.bukkit.entity.Cod wrapped) {
        super(wrapped);
    }
}
