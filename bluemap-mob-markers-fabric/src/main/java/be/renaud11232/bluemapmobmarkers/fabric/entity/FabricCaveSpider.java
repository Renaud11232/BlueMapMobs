package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.CaveSpider;

public class FabricCaveSpider extends FabricMob<net.minecraft.world.entity.monster.spider.CaveSpider> implements CaveSpider {
    public FabricCaveSpider(net.minecraft.world.entity.monster.spider.CaveSpider wrapped) {
        super(wrapped);
    }
}
