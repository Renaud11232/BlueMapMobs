package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Evoker;

public class FabricEvoker extends FabricMob<net.minecraft.world.entity.monster.illager.Evoker> implements Evoker {
    public FabricEvoker(net.minecraft.world.entity.monster.illager.Evoker wrapped) {
        super(wrapped);
    }
}
