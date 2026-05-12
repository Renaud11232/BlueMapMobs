package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Chicken;

import java.util.HashMap;
import java.util.Map;

public class BukkitChicken extends BukkitAgeable<org.bukkit.entity.Chicken> implements Chicken {
    private static final Map<org.bukkit.entity.Chicken.Variant, Variant> VARIANT_MAP = new HashMap<>();

    public BukkitChicken(org.bukkit.entity.Chicken wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return VARIANT_MAP.get(wrapped.getVariant());
    }

    static {
        VARIANT_MAP.put(org.bukkit.entity.Chicken.Variant.TEMPERATE, Variant.TEMPERATE);
        VARIANT_MAP.put(org.bukkit.entity.Chicken.Variant.WARM, Variant.WARM);
        VARIANT_MAP.put(org.bukkit.entity.Chicken.Variant.COLD, Variant.COLD);
    }
}
