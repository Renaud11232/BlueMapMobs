package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Spider;

public class FabricSpider extends FabricMob<net.minecraft.world.entity.monster.spider.Spider> implements Spider {
    public FabricSpider(net.minecraft.world.entity.monster.spider.Spider wrapped) {
        super(wrapped);
    }
}
