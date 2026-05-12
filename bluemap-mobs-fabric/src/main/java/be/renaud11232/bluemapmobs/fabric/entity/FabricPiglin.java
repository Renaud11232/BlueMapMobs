package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Piglin;

public class FabricPiglin extends AbstractFabricPiglin<net.minecraft.world.entity.monster.piglin.Piglin> implements Piglin {
    public FabricPiglin(net.minecraft.world.entity.monster.piglin.Piglin wrapped) {
        super(wrapped);
    }
}
