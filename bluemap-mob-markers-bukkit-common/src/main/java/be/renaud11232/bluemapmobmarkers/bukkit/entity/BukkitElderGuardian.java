package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.ElderGuardian;

public class BukkitElderGuardian extends BukkitMob<org.bukkit.entity.ElderGuardian> implements ElderGuardian {
    public BukkitElderGuardian(org.bukkit.entity.ElderGuardian wrapped) {
        super(wrapped);
    }
}
