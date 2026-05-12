package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Parrot;

public class FabricParrot extends FabricAgeable<net.minecraft.world.entity.animal.parrot.Parrot> implements Parrot {
    public FabricParrot(net.minecraft.world.entity.animal.parrot.Parrot wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant()) {
            case RED_BLUE -> Variant.RED;
            case BLUE -> Variant.BLUE;
            case GREEN -> Variant.GREEN;
            case YELLOW_BLUE -> Variant.CYAN;
            case GRAY -> Variant.GRAY;
        };
    }
}
