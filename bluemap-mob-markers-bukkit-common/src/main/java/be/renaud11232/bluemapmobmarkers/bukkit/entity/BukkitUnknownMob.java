package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;

public class BukkitUnknownMob extends BukkitMob<org.bukkit.entity.Mob> implements UnknownEntity {
    public BukkitUnknownMob(org.bukkit.entity.Mob wrapped) {
        super(wrapped);
    }
}
