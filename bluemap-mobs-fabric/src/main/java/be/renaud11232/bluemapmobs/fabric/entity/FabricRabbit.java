package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Rabbit;

public class FabricRabbit extends FabricAgeable<net.minecraft.world.entity.animal.rabbit.Rabbit> implements Rabbit {
    public FabricRabbit(net.minecraft.world.entity.animal.rabbit.Rabbit wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped.getVariant()) {
            case BROWN -> Type.BROWN;
            case WHITE -> Type.WHITE;
            case BLACK -> Type.BLACK;
            case WHITE_SPLOTCHED -> Type.BLACK_AND_WHITE;
            case GOLD -> Type.GOLD;
            case SALT -> Type.SALT_AND_PEPPER;
            case EVIL -> Type.THE_KILLER_BUNNY;
        };
    }
}
