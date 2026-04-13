package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapmobs.entity.Mob;

public class UnknownBukkitMob extends BukkitMob<org.bukkit.entity.Mob> implements Mob, UnknownEntity {
    public UnknownBukkitMob(org.bukkit.entity.Mob wrapped) {
        super(wrapped);
    }
}
