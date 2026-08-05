package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Donkey;

public class BukkitDonkey extends BukkitAgeable<org.bukkit.entity.Donkey> implements Donkey {
    public BukkitDonkey(org.bukkit.entity.Donkey wrapped) {
        super(wrapped);
    }
}
