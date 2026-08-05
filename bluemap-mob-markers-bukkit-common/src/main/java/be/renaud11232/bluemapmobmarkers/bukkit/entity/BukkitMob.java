package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapentitymarkers.bukkit.entity.BukkitEntity;
import be.renaud11232.bluemapmobmarkers.entity.Mob;

public abstract class BukkitMob<T extends org.bukkit.entity.Mob> extends BukkitEntity<T> implements Mob {
    public BukkitMob(T wrapped) {
        super(wrapped);
    }
}
