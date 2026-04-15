package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Drowned;

public class BukkitDrowned extends BukkitAgeable<org.bukkit.entity.Drowned> implements Drowned {
    public BukkitDrowned(org.bukkit.entity.Drowned wrapped) {
        super(wrapped);
    }
}
