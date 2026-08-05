package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Parched;

public class BukkitParched extends BukkitMob<org.bukkit.entity.Parched> implements Parched {
    public BukkitParched(org.bukkit.entity.Parched wrapped) {
        super(wrapped);
    }
}
