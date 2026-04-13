package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Guardian;

public class BukkitGuardian extends BukkitMob<org.bukkit.entity.Guardian> implements Guardian {
    public BukkitGuardian(org.bukkit.entity.Guardian wrapped) {
        super(wrapped);
    }
}
