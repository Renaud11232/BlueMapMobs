package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Sheep;

public class FabricSheep extends FabricAgeable<net.minecraft.world.entity.animal.sheep.Sheep> implements Sheep {
    public FabricSheep(net.minecraft.world.entity.animal.sheep.Sheep wrapped) {
        super(wrapped);
    }

    @Override
    public Color getColor() {
        return switch (wrapped.getColor()) {
            case WHITE -> Color.WHITE;
            case ORANGE -> Color.ORANGE;
            case MAGENTA -> Color.MAGENTA;
            case LIGHT_BLUE -> Color.LIGHT_BLUE;
            case YELLOW -> Color.YELLOW;
            case LIME -> Color.LIME;
            case PINK -> Color.PINK;
            case GRAY -> Color.GRAY;
            case LIGHT_GRAY -> Color.LIGHT_GRAY;
            case CYAN -> Color.CYAN;
            case PURPLE -> Color.PURPLE;
            case BLUE -> Color.BLUE;
            case BROWN -> Color.BROWN;
            case GREEN -> Color.GREEN;
            case RED -> Color.RED;
            case BLACK -> Color.BLACK;
        };
    }
}
