package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Wither;

public class BukkitWither extends BukkitMob<org.bukkit.entity.Wither> implements Wither {
    public BukkitWither(org.bukkit.entity.Wither wrapped) {
        super(wrapped);
    }
}
