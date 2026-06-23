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
        CARPET_MAP.put(Items.CARPET.white(), Carpet.WHITE);
        CARPET_MAP.put(Items.CARPET.lightGray(), Carpet.LIGHT_GRAY);
        CARPET_MAP.put(Items.CARPET.gray(), Carpet.GRAY);
        CARPET_MAP.put(Items.CARPET.black(), Carpet.BLACK);
        CARPET_MAP.put(Items.CARPET.brown(), Carpet.BROWN);
        CARPET_MAP.put(Items.CARPET.red(), Carpet.RED);
        CARPET_MAP.put(Items.CARPET.orange(), Carpet.ORANGE);
        CARPET_MAP.put(Items.CARPET.yellow(), Carpet.YELLOW);
        CARPET_MAP.put(Items.CARPET.lime(), Carpet.LIME);
        CARPET_MAP.put(Items.CARPET.green(), Carpet.GREEN);
        CARPET_MAP.put(Items.CARPET.cyan(), Carpet.CYAN);
        CARPET_MAP.put(Items.CARPET.lightBlue(), Carpet.LIGHT_BLUE);
        CARPET_MAP.put(Items.CARPET.blue(), Carpet.BLUE);
        CARPET_MAP.put(Items.CARPET.purple(), Carpet.PURPLE);
        CARPET_MAP.put(Items.CARPET.magenta(), Carpet.MAGENTA);
        CARPET_MAP.put(Items.CARPET.pink(), Carpet.PINK);
    }
}
