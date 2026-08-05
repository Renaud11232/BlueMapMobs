package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Chicken;

public class FabricChicken extends FabricAgeable<net.minecraft.world.entity.animal.chicken.Chicken> implements Chicken {
    public FabricChicken(net.minecraft.world.entity.animal.chicken.Chicken wrapped) {
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
