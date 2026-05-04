package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Donkey;

public class BukkitDonkey extends BukkitAgeable<org.bukkit.entity.Donkey> implements Donkey {
    public BukkitDonkey(org.bukkit.entity.Donkey wrapped) {
        super(wrapped);
    }
}
