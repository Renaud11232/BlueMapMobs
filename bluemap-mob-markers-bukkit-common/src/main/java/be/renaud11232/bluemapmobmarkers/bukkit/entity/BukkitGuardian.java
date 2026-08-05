package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Guardian;

public class BukkitGuardian extends BukkitMob<org.bukkit.entity.Guardian> implements Guardian {
    public BukkitGuardian(org.bukkit.entity.Guardian wrapped) {
        super(wrapped);
    }
}
