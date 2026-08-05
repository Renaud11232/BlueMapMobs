package be.renaud11232.bluemapothermarkers.bukkit.entity;

import be.renaud11232.bluemapentitymarkers.bukkit.entity.BukkitEntity;
import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;

public class BukkitUnknownEntity extends BukkitEntity<org.bukkit.entity.Entity> implements UnknownEntity {
    public BukkitUnknownEntity(org.bukkit.entity.Entity wrapped) {
        super(wrapped);
    }
}
