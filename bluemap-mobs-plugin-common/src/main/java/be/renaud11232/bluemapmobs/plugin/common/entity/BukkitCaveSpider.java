package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.CaveSpider;

public class BukkitCaveSpider extends BukkitMob<org.bukkit.entity.CaveSpider> implements CaveSpider {
    public BukkitCaveSpider(org.bukkit.entity.CaveSpider wrapped) {
        super(wrapped);
    }
}
