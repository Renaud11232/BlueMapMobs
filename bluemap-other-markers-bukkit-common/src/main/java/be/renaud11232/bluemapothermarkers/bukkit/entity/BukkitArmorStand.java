package be.renaud11232.bluemapothermarkers.bukkit.entity;

import be.renaud11232.bluemapothermarkers.entity.ArmorStand;

public class BukkitArmorStand extends BukkitLivingEntity<org.bukkit.entity.ArmorStand> implements ArmorStand {
    public BukkitArmorStand(org.bukkit.entity.ArmorStand wrapped) {
        super(wrapped);
    }
}
