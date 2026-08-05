package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Sheep;

public class BukkitSheep extends BukkitAgeable<org.bukkit.entity.Sheep> implements Sheep {
    public BukkitSheep(org.bukkit.entity.Sheep wrapped) {
        super(wrapped);
    }

    @Override
    public Color getColor() {
        return switch (wrapped.getColor()) {
            case null -> null;
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
