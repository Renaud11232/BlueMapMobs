package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Cat;

public class FabricCat extends FabricAgeable<net.minecraft.world.entity.animal.feline.Cat> implements Cat {
    public FabricCat(net.minecraft.world.entity.animal.feline.Cat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped.getVariant().getRegisteredName()) {
            case "minecraft:tabby" -> Type.TABBY;
            case "minecraft:black" -> Type.BLACK;
            case "minecraft:red" -> Type.RED;
            case "minecraft:siamese" -> Type.SIAMESE;
            case "minecraft:british_shorthair" -> Type.BRITISH_SHORTHAIR;
            case "minecraft:calico" -> Type.CALICO;
            case "minecraft:persian" -> Type.PERSIAN;
            case "minecraft:ragdoll" -> Type.RAGDOLL;
            case "minecraft:white" -> Type.WHITE;
            case "minecraft:jellie" -> Type.JELLIE;
            case "minecraft:all_black" -> Type.ALL_BLACK;
            default -> null;
        };
    }
}
