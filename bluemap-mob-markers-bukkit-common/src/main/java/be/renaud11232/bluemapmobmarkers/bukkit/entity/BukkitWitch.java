package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Witch;

public class BukkitWitch extends BukkitMob<org.bukkit.entity.Witch> implements Witch {
    public BukkitWitch(org.bukkit.entity.Witch wrapped) {
        super(wrapped);
    }
}
