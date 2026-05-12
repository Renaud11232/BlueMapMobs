package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Pig;

public class FabricPig extends FabricAgeable<net.minecraft.world.entity.animal.pig.Pig> implements Pig {
    public FabricPig(net.minecraft.world.entity.animal.pig.Pig wrapped) {
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
