package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.HappyGhast;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.HashMap;
import java.util.Map;

public class FabricHappyGhast extends FabricAgeable<net.minecraft.world.entity.animal.happyghast.HappyGhast> implements HappyGhast {
    private static final Map<Item, Harness> HARNESS_MAP = new HashMap<>();

    static {
        HARNESS_MAP.put(Items.HARNESS.white(), Harness.WHITE);
        HARNESS_MAP.put(Items.HARNESS.lightGray(), Harness.LIGHT_GRAY);
        HARNESS_MAP.put(Items.HARNESS.gray(), Harness.GRAY);
        HARNESS_MAP.put(Items.HARNESS.black(), Harness.BLACK);
        HARNESS_MAP.put(Items.HARNESS.brown(), Harness.BROWN);
        HARNESS_MAP.put(Items.HARNESS.red(), Harness.RED);
        HARNESS_MAP.put(Items.HARNESS.orange(), Harness.ORANGE);
        HARNESS_MAP.put(Items.HARNESS.yellow(), Harness.YELLOW);
        HARNESS_MAP.put(Items.HARNESS.lime(), Harness.LIME);
        HARNESS_MAP.put(Items.HARNESS.green(), Harness.GREEN);
        HARNESS_MAP.put(Items.HARNESS.cyan(), Harness.CYAN);
        HARNESS_MAP.put(Items.HARNESS.lightBlue(), Harness.LIGHT_BLUE);
        HARNESS_MAP.put(Items.HARNESS.blue(), Harness.BLUE);
        HARNESS_MAP.put(Items.HARNESS.purple(), Harness.PURPLE);
        HARNESS_MAP.put(Items.HARNESS.magenta(), Harness.MAGENTA);
        HARNESS_MAP.put(Items.HARNESS.pink(), Harness.PINK);
    }

    public FabricHappyGhast(net.minecraft.world.entity.animal.happyghast.HappyGhast wrapped) {
        super(wrapped);
    }

    @Override
    public Harness getHarness() {
        return HARNESS_MAP.get(wrapped.getItemBySlot(EquipmentSlot.BODY).getItem());
    }
}
