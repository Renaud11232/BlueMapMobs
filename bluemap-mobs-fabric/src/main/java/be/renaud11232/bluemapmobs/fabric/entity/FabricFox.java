package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Fox;

public class FabricFox extends FabricAgeable<net.minecraft.world.entity.animal.fox.Fox> implements Fox {
    public FabricFox(net.minecraft.world.entity.animal.fox.Fox wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped.getVariant()) {
            case RED -> Type.RED;
            case SNOW -> Type.SNOW;
        };
    }

    @Override
    public boolean isSleeping() {
        return wrapped.isSleeping();
    }
}
