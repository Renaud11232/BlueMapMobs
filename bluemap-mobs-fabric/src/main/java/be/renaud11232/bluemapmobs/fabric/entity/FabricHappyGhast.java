package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.HappyGhast;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.Map;

public class FabricHappyGhast extends FabricAgeable<net.minecraft.world.entity.animal.happyghast.HappyGhast> implements HappyGhast {
    private static final Map<Item, Harness> HARNESS_MAP = new HashMap<>();
    
    public FabricHappyGhast(net.minecraft.world.entity.animal.happyghast.HappyGhast wrapped) {
        super(wrapped);
    }

    @Override
    public Harness getHarness() {
        return HARNESS_MAP.get(wrapped.getItemBySlot(EquipmentSlot.BODY).getItem());
    }
    
    static {
        HARNESS_MAP.put(Items.WHITE_HARNESS, Harness.WHITE);
        HARNESS_MAP.put(Items.LIGHT_GRAY_HARNESS, Harness.LIGHT_GRAY);
        HARNESS_MAP.put(Items.GRAY_HARNESS, Harness.GRAY);
        HARNESS_MAP.put(Items.BLACK_HARNESS, Harness.BLACK);
        HARNESS_MAP.put(Items.BROWN_HARNESS, Harness.BROWN);
        HARNESS_MAP.put(Items.RED_HARNESS, Harness.RED);
        HARNESS_MAP.put(Items.ORANGE_HARNESS, Harness.ORANGE);
        HARNESS_MAP.put(Items.YELLOW_HARNESS, Harness.YELLOW);
        HARNESS_MAP.put(Items.LIME_HARNESS, Harness.LIME);
        HARNESS_MAP.put(Items.GREEN_HARNESS, Harness.GREEN);
        HARNESS_MAP.put(Items.CYAN_HARNESS, Harness.CYAN);
        HARNESS_MAP.put(Items.LIGHT_BLUE_HARNESS, Harness.LIGHT_BLUE);
        HARNESS_MAP.put(Items.BLUE_HARNESS, Harness.BLUE);
        HARNESS_MAP.put(Items.PURPLE_HARNESS, Harness.PURPLE);
        HARNESS_MAP.put(Items.MAGENTA_HARNESS, Harness.MAGENTA);
        HARNESS_MAP.put(Items.PINK_HARNESS, Harness.PINK);
    }
}
