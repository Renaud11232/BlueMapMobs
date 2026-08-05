package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.CaveSpider;

public class BukkitCaveSpider extends BukkitMob<org.bukkit.entity.CaveSpider> implements CaveSpider {
    public BukkitCaveSpider(org.bukkit.entity.CaveSpider wrapped) {
        super(wrapped);
    }
}
