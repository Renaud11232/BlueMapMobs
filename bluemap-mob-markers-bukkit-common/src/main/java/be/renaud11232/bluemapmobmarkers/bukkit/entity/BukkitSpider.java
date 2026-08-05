package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Spider;

public class BukkitSpider extends BukkitMob<org.bukkit.entity.Spider> implements Spider {
    public BukkitSpider(org.bukkit.entity.Spider wrapped) {
        super(wrapped);
    }
}
