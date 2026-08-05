package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Cod;

public class BukkitCod extends BukkitMob<org.bukkit.entity.Cod> implements Cod {
    public BukkitCod(org.bukkit.entity.Cod wrapped) {
        super(wrapped);
    }
}
