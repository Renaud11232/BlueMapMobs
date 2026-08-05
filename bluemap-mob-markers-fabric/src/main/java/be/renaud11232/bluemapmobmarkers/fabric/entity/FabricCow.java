package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Cow;

public class FabricCow extends FabricAgeable<net.minecraft.world.entity.animal.cow.Cow> implements Cow {
    public FabricCow(net.minecraft.world.entity.animal.cow.Cow wrapped) {
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
