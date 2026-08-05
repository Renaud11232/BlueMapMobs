package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.ZombieNautilus;

public class FabricZombieNautilus extends FabricAgeable<net.minecraft.world.entity.animal.nautilus.ZombieNautilus> implements ZombieNautilus {
    public FabricZombieNautilus(net.minecraft.world.entity.animal.nautilus.ZombieNautilus wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant().getRegisteredName()) {
            case "minecraft:temperate" -> Variant.TEMPERATE;
            case "minecraft:warm" -> Variant.WARM;
            default -> null;
        };
    }
}
