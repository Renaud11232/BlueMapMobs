package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Horse;

public class FabricHorse extends FabricAgeable<net.minecraft.world.entity.animal.equine.Horse> implements Horse {
    public FabricHorse(net.minecraft.world.entity.animal.equine.Horse wrapped) {
        super(wrapped);
    }

    @Override
    public Color getColor() {
        return switch (wrapped.getVariant()) {
            case WHITE -> Color.WHITE;
            case CREAMY -> Color.CREAMY;
            case CHESTNUT -> Color.CHESTNUT;
            case BROWN -> Color.BROWN;
            case BLACK -> Color.BLACK;
            case GRAY -> Color.GRAY;
            case DARK_BROWN -> Color.DARK_BROWN;
        };
    }

    @Override
    public Style getStyle() {
        return switch (wrapped.getMarkings()) {
            case NONE -> Style.NONE;
            case WHITE -> Style.WHITE;
            case WHITE_FIELD -> Style.WHITEFIELD;
            case WHITE_DOTS -> Style.WHITE_DOTS;
            case BLACK_DOTS -> Style.BLACK_DOTS;
        };
    }
}
