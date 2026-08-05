package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Wolf;
import net.minecraft.core.component.DataComponents;

public class FabricWolf extends FabricAgeable<net.minecraft.world.entity.animal.wolf.Wolf> implements Wolf {
    public FabricWolf(net.minecraft.world.entity.animal.wolf.Wolf wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAngry() {
        return wrapped.isAngry();
    }

    @Override
    public boolean isTamed() {
        return wrapped.isTame();
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.get(DataComponents.WOLF_VARIANT).getRegisteredName()) {
            case "minecraft:pale" -> Variant.PALE;
            case "minecraft:spotted" -> Variant.SPOTTED;
            case "minecraft:snowy" -> Variant.SNOWY;
            case "minecraft:black" -> Variant.BLACK;
            case "minecraft:ashen" -> Variant.ASHEN;
            case "minecraft:rusty" -> Variant.RUSTY;
            case "minecraft:woods" -> Variant.WOODS;
            case "minecraft:chestnut" -> Variant.CHESTNUT;
            case "minecraft:striped" -> Variant.STRIPED;
            default -> null;
        };
    }
}
