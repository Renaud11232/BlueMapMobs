package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.HappyGhast;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;

public class BukkitHappyGhast extends BukkitAgeable<org.bukkit.entity.HappyGhast> implements HappyGhast {
    public BukkitHappyGhast(org.bukkit.entity.HappyGhast wrapped) {
        super(wrapped);
    }

    @Override
    public Harness getHarness() {
        EntityEquipment equipment = wrapped.getEquipment();
        if (equipment == null) {
            return null;
        }
        return switch (equipment.getItem(EquipmentSlot.BODY).getType()) {
            case WHITE_HARNESS -> Harness.WHITE;
            case LIGHT_GRAY_HARNESS -> Harness.LIGHT_GRAY;
            case GRAY_HARNESS -> Harness.GRAY;
            case BLACK_HARNESS -> Harness.BLACK;
            case BROWN_HARNESS -> Harness.BROWN;
            case RED_HARNESS -> Harness.RED;
            case ORANGE_HARNESS -> Harness.ORANGE;
            case YELLOW_HARNESS -> Harness.YELLOW;
            case LIME_HARNESS -> Harness.LIME;
            case GREEN_HARNESS -> Harness.GREEN;
            case CYAN_HARNESS -> Harness.CYAN;
            case LIGHT_BLUE_HARNESS -> Harness.LIGHT_BLUE;
            case BLUE_HARNESS -> Harness.BLUE;
            case PURPLE_HARNESS -> Harness.PURPLE;
            case MAGENTA_HARNESS -> Harness.MAGENTA;
            case PINK_HARNESS -> Harness.PINK;
            default -> null;
        };
    }
}
