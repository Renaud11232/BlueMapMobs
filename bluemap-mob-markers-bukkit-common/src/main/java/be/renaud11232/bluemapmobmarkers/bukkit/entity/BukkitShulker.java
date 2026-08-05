package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Shulker;

public class BukkitShulker extends BukkitMob<org.bukkit.entity.Shulker> implements Shulker {
    public BukkitShulker(org.bukkit.entity.Shulker wrapped) {
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
