package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Llama;
import org.bukkit.inventory.ItemStack;

public class AbstractBukkitLlama<T extends org.bukkit.entity.Llama> extends BukkitAgeable<T> implements Llama {
    public AbstractBukkitLlama(T wrapped) {
        super(wrapped);
    }

    @Override
    public Carpet getCarpet() {
        ItemStack decor = wrapped.getInventory().getDecor();
        if (decor == null) {
            return null;
        }
        return switch (decor.getType()) {
            case WHITE_CARPET -> Carpet.WHITE;
            case LIGHT_GRAY_CARPET -> Carpet.LIGHT_GRAY;
            case GRAY_CARPET -> Carpet.GRAY;
            case BLACK_CARPET -> Carpet.BLACK;
            case BROWN_CARPET -> Carpet.BROWN;
            case RED_CARPET -> Carpet.RED;
            case ORANGE_CARPET -> Carpet.ORANGE;
            case YELLOW_CARPET -> Carpet.YELLOW;
            case LIME_CARPET -> Carpet.LIME;
            case GREEN_CARPET -> Carpet.GREEN;
            case CYAN_CARPET -> Carpet.CYAN;
            case LIGHT_BLUE_CARPET -> Carpet.LIGHT_BLUE;
            case BLUE_CARPET -> Carpet.BLUE;
            case PURPLE_CARPET -> Carpet.PURPLE;
            case MAGENTA_CARPET -> Carpet.MAGENTA;
            case PINK_CARPET -> Carpet.PINK;
            default -> null;
        };
    }

    @Override
    public Color getColor() {
        return switch (wrapped.getColor()) {
            case CREAMY -> Color.CREAMY;
            case WHITE -> Color.WHITE;
            case BROWN -> Color.BROWN;
            case GRAY -> Color.GRAY;
        };
    }
}
