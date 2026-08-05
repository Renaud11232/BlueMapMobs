package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.MushroomCow;

public class FabricMushroomCow extends FabricAgeable<net.minecraft.world.entity.animal.cow.MushroomCow> implements MushroomCow {
    public FabricMushroomCow(net.minecraft.world.entity.animal.cow.MushroomCow wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant()) {
            case RED -> Variant.RED;
            case BROWN -> Variant.BROWN;
        };
    }
}
