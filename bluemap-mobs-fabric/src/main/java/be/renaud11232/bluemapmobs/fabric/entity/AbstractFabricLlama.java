package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Llama;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.Map;

public class AbstractFabricLlama<T extends net.minecraft.world.entity.animal.equine.Llama> extends FabricAgeable<T> implements Llama {
    private static final Map<Item, Carpet> CARPET_MAP = new HashMap<>();

    public AbstractFabricLlama(T wrapped) {
        super(wrapped);
    }

    @Override
    public Carpet getCarpet() {
        return CARPET_MAP.get(wrapped.getItemBySlot(EquipmentSlot.BODY).getItem());
    }

    @Override
    public Color getColor() {
        return switch (wrapped.getVariant()) {
            case CREAMY -> Color.CREAMY;
            case WHITE -> Color.WHITE;
            case BROWN -> Color.BROWN;
            case GRAY -> Color.GRAY;
        };
    }

    static {
        CARPET_MAP.put(Items.WHITE_CARPET, Carpet.WHITE);
        CARPET_MAP.put(Items.LIGHT_GRAY_CARPET, Carpet.LIGHT_GRAY);
        CARPET_MAP.put(Items.GRAY_CARPET, Carpet.GRAY);
        CARPET_MAP.put(Items.BLACK_CARPET, Carpet.BLACK);
        CARPET_MAP.put(Items.BROWN_CARPET, Carpet.BROWN);
        CARPET_MAP.put(Items.RED_CARPET, Carpet.RED);
        CARPET_MAP.put(Items.ORANGE_CARPET, Carpet.ORANGE);
        CARPET_MAP.put(Items.YELLOW_CARPET, Carpet.YELLOW);
        CARPET_MAP.put(Items.LIME_CARPET, Carpet.LIME);
        CARPET_MAP.put(Items.GREEN_CARPET, Carpet.GREEN);
        CARPET_MAP.put(Items.CYAN_CARPET, Carpet.CYAN);
        CARPET_MAP.put(Items.LIGHT_BLUE_CARPET, Carpet.LIGHT_BLUE);
        CARPET_MAP.put(Items.BLUE_CARPET, Carpet.BLUE);
        CARPET_MAP.put(Items.PURPLE_CARPET, Carpet.PURPLE);
        CARPET_MAP.put(Items.MAGENTA_CARPET, Carpet.MAGENTA);
        CARPET_MAP.put(Items.PINK_CARPET, Carpet.PINK);
    }
}
