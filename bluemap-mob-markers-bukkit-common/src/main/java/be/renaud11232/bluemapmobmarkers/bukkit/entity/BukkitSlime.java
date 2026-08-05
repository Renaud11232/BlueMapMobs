package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Slime;

public class BukkitSlime extends BukkitMob<org.bukkit.entity.Slime> implements Slime {
    public BukkitSlime(org.bukkit.entity.Slime wrapped) {
        super(wrapped);
    }
}
