package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Nautilus;

public class BukkitNautilus extends BukkitAgeable<org.bukkit.entity.Nautilus> implements Nautilus {
    public BukkitNautilus(org.bukkit.entity.Nautilus wrapped) {
        super(wrapped);
    }
}
