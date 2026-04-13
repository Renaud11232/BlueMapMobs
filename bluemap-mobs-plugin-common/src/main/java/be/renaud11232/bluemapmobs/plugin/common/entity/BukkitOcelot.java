package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Ocelot;

public class BukkitOcelot extends BukkitAgeable<org.bukkit.entity.Ocelot> implements Ocelot {
    public BukkitOcelot(org.bukkit.entity.Ocelot wrapped) {
        super(wrapped);
    }
}
