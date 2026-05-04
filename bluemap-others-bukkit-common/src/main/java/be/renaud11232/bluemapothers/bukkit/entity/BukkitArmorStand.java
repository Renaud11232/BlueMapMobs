package be.renaud11232.bluemapothers.bukkit.entity;

import be.renaud11232.bluemapothers.entity.ArmorStand;

public class BukkitArmorStand extends BukkitLivingEntity<org.bukkit.entity.ArmorStand> implements ArmorStand {
    public BukkitArmorStand(org.bukkit.entity.ArmorStand wrapped) {
        super(wrapped);
    }
}
