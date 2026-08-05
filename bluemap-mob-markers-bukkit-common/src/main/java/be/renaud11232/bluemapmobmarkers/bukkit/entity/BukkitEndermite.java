package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Endermite;

public class BukkitEndermite extends BukkitMob<org.bukkit.entity.Endermite> implements Endermite {
    public BukkitEndermite(org.bukkit.entity.Endermite wrapped) {
        super(wrapped);
    }
}
