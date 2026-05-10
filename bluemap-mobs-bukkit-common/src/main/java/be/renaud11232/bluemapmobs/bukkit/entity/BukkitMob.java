package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapentities.bukkit.entity.BukkitEntity;
import be.renaud11232.bluemapmobs.entity.Mob;

public abstract class BukkitMob<T extends org.bukkit.entity.Mob> extends BukkitEntity<T> implements Mob {
    public BukkitMob(T wrapped) {
        super(wrapped);
    }
}
