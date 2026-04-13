package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Illusioner;

public class BukkitIllusioner extends BukkitMob<org.bukkit.entity.Illusioner> implements Illusioner {
    public BukkitIllusioner(org.bukkit.entity.Illusioner wrapped) {
        super(wrapped);
    }
}
