package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapentities.entity.UnknownEntity;
import be.renaud11232.bluemapmobs.entity.Mob;

public class BukkitUnknownMob extends BukkitMob<org.bukkit.entity.Mob> implements Mob, UnknownEntity {
    public BukkitUnknownMob(org.bukkit.entity.Mob wrapped) {
        super(wrapped);
    }
}
