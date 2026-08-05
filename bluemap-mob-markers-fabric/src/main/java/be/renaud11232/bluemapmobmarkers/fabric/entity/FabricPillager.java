package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Pillager;

public class FabricPillager extends FabricMob<net.minecraft.world.entity.monster.illager.Pillager> implements Pillager {
    public FabricPillager(net.minecraft.world.entity.monster.illager.Pillager wrapped) {
        super(wrapped);
    }
}
