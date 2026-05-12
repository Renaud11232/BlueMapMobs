package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Frog;

public class FabricFrog extends FabricAgeable<net.minecraft.world.entity.animal.frog.Frog> implements Frog {
    public FabricFrog(net.minecraft.world.entity.animal.frog.Frog wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant().getRegisteredName()) {
            case "minecraft:temperate" -> Variant.TEMPERATE;
            case "minecraft:warm" -> Variant.WARM;
            case "minecraft:cold" -> Variant.COLD;
            default -> null;
        };
    }
}
