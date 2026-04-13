package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Evoker;

public class BukkitEvoker extends BukkitMob<org.bukkit.entity.Evoker> implements Evoker {
    public BukkitEvoker(org.bukkit.entity.Evoker wrapped) {
        super(wrapped);
    }
}
