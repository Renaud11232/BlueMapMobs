package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Piglin;

public class FabricPiglin extends AbstractFabricPiglin<net.minecraft.world.entity.monster.piglin.Piglin> implements Piglin {
    public FabricPiglin(net.minecraft.world.entity.monster.piglin.Piglin wrapped) {
        super(wrapped);
    }
}
