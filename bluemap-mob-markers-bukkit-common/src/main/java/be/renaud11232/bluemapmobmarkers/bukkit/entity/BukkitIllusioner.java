package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Illusioner;

public class BukkitIllusioner extends BukkitMob<org.bukkit.entity.Illusioner> implements Illusioner {
    public BukkitIllusioner(org.bukkit.entity.Illusioner wrapped) {
        super(wrapped);
    }
}
