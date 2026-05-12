package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Evoker;

public class FabricEvoker extends FabricMob<net.minecraft.world.entity.monster.illager.Evoker> implements Evoker {
    public FabricEvoker(net.minecraft.world.entity.monster.illager.Evoker wrapped) {
        super(wrapped);
    }
}
