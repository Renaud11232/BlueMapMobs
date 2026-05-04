package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Slime;

public class BukkitSlime extends BukkitMob<org.bukkit.entity.Slime> implements Slime {
    public BukkitSlime(org.bukkit.entity.Slime wrapped) {
        super(wrapped);
    }
}
