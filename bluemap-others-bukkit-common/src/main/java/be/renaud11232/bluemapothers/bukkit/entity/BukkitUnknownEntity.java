package be.renaud11232.bluemapothers.bukkit.entity;

import be.renaud11232.bluemapentities.bukkit.entity.BukkitEntity;
import be.renaud11232.bluemapentities.entity.UnknownEntity;

public class BukkitUnknownEntity extends BukkitEntity<org.bukkit.entity.Entity> implements UnknownEntity {
    public BukkitUnknownEntity(org.bukkit.entity.Entity wrapped) {
        super(wrapped);
    }
}
