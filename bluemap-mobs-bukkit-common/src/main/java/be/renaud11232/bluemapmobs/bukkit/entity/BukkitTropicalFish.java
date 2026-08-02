package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.TropicalFish;
import org.bukkit.DyeColor;

public class BukkitTropicalFish extends BukkitMob<org.bukkit.entity.TropicalFish> implements TropicalFish {
    public BukkitTropicalFish(org.bukkit.entity.TropicalFish wrapped) {
        super(wrapped);
    }

    private static Color mapColor(DyeColor color) {
        return switch (color) {
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

    @Override
    public Pattern getPattern() {
        return switch (wrapped.getPattern()) {
            case KOB -> Pattern.KOB;
            case SUNSTREAK -> Pattern.SUNSTREAK;
            case SNOOPER -> Pattern.SNOOPER;
            case DASHER -> Pattern.DASHER;
            case BRINELY -> Pattern.BRINELY;
            case SPOTTY -> Pattern.SPOTTY;
            case FLOPPER -> Pattern.FLOPPER;
            case STRIPEY -> Pattern.STRIPEY;
            case GLITTER -> Pattern.GLITTER;
            case BLOCKFISH -> Pattern.BLOCKFISH;
            case BETTY -> Pattern.BETTY;
            case CLAYFISH -> Pattern.CLAYFISH;
        };
    }

    @Override
    public Color getBodyColor() {
        return mapColor(wrapped.getBodyColor());
    }

    @Override
    public Color getPatternColor() {
        return mapColor(wrapped.getPatternColor());
    }
}
