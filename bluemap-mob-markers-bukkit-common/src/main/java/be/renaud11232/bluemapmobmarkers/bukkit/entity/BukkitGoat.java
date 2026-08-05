package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Goat;

public class BukkitGoat extends BukkitAgeable<org.bukkit.entity.Goat> implements Goat {
    public BukkitGoat(org.bukkit.entity.Goat wrapped) {
        super(wrapped);
    }
}
