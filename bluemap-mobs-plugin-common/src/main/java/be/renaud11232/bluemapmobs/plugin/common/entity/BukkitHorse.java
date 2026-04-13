package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Horse;

public class BukkitHorse extends BukkitAgeable<org.bukkit.entity.Horse> implements Horse {
    public BukkitHorse(org.bukkit.entity.Horse wrapped) {
        super(wrapped);
    }

    @Override
    public Color getColor() {
        return switch (wrapped.getColor()) {
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
        return switch (wrapped.getStyle()) {
            case NONE -> Style.NONE;
            case WHITE -> Style.WHITE;
            case WHITEFIELD -> Style.WHITEFIELD;
            case WHITE_DOTS -> Style.WHITE_DOTS;
            case BLACK_DOTS -> Style.BLACK_DOTS;
        };
    }
}
