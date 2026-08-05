package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Armadillo;

public class FabricArmadillo extends FabricAgeable<net.minecraft.world.entity.animal.armadillo.Armadillo> implements Armadillo {
    public FabricArmadillo(net.minecraft.world.entity.animal.armadillo.Armadillo wrapped) {
        super(wrapped);
    }
}
