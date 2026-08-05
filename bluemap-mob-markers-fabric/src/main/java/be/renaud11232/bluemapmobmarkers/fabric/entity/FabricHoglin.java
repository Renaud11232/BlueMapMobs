package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Hoglin;

public class FabricHoglin extends FabricAgeable<net.minecraft.world.entity.monster.hoglin.Hoglin> implements Hoglin {
    public FabricHoglin(net.minecraft.world.entity.monster.hoglin.Hoglin wrapped) {
        super(wrapped);
    }
}
