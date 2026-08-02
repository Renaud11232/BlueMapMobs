package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Panda;

public class FabricPanda extends FabricAgeable<net.minecraft.world.entity.animal.panda.Panda> implements Panda {
    public FabricPanda(net.minecraft.world.entity.animal.panda.Panda wrapped) {
        super(wrapped);
    }

    private static Gene mapGene(net.minecraft.world.entity.animal.panda.Panda.Gene gene) {
        return switch (gene) {
            case NORMAL -> Gene.NORMAL;
            case LAZY -> Gene.LAZY;
            case WORRIED -> Gene.WORRIED;
            case PLAYFUL -> Gene.PLAYFUL;
            case BROWN -> Gene.BROWN;
            case WEAK -> Gene.WEAK;
            case AGGRESSIVE -> Gene.AGGRESSIVE;
        };
    }

    @Override
    public Gene getMainGene() {
        return mapGene(wrapped.getMainGene());
    }

    @Override
    public Gene getHiddenGene() {
        return mapGene(wrapped.getHiddenGene());
    }
}
