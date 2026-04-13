package be.renaud11232.bluemapothers.plugin.entity;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.entity.UnknownEntity;

public class UnknownBukkitEntity extends BukkitEntity<org.bukkit.entity.Entity> implements Entity, UnknownEntity {
    public UnknownBukkitEntity(org.bukkit.entity.Entity wrapped) {
        super(wrapped);
    }
}
