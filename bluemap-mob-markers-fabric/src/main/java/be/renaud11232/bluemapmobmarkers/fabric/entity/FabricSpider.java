package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Spider;

public class FabricSpider extends FabricMob<net.minecraft.world.entity.monster.spider.Spider> implements Spider {
    public FabricSpider(net.minecraft.world.entity.monster.spider.Spider wrapped) {
        super(wrapped);
    }
}
