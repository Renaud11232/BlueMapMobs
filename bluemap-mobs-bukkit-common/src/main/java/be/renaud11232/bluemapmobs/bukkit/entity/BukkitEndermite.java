package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Endermite;

public class BukkitEndermite extends BukkitMob<org.bukkit.entity.Endermite> implements Endermite {
    public BukkitEndermite(org.bukkit.entity.Endermite wrapped) {
        super(wrapped);
    }
}
