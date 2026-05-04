package be.renaud11232.bluemapothers.bukkit.entity;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapentities.entity.UnknownEntity;

public class BukkitUnknownEntity extends BukkitEntity<org.bukkit.entity.Entity> implements Entity, UnknownEntity {
    public BukkitUnknownEntity(org.bukkit.entity.Entity wrapped) {
        super(wrapped);
    }
}
