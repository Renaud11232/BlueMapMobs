package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Dolphin;

public class BukkitDolphin extends BukkitMob<org.bukkit.entity.Dolphin> implements Dolphin {
    public BukkitDolphin(org.bukkit.entity.Dolphin wrapped) {
        super(wrapped);
    }
}
