package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Witch;

public class BukkitWitch extends BukkitMob<org.bukkit.entity.Witch> implements Witch {
    public BukkitWitch(org.bukkit.entity.Witch wrapped) {
        super(wrapped);
    }
}
