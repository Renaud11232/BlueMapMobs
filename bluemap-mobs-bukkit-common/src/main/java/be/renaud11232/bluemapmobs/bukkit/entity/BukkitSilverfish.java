package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Silverfish;

public class BukkitSilverfish extends BukkitMob<org.bukkit.entity.Silverfish> implements Silverfish {
    public BukkitSilverfish(org.bukkit.entity.Silverfish wrapped) {
        super(wrapped);
    }
}
