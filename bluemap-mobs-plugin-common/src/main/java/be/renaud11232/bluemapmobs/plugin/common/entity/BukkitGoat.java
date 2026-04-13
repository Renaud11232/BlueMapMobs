package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Goat;

public class BukkitGoat extends BukkitAgeable<org.bukkit.entity.Goat> implements Goat {
    public BukkitGoat(org.bukkit.entity.Goat wrapped) {
        super(wrapped);
    }
}
