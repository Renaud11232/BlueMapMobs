package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Pig;

import java.util.HashMap;
import java.util.Map;

public class BukkitPig extends BukkitAgeable<org.bukkit.entity.Pig> implements Pig {
    private static final Map<org.bukkit.entity.Pig.Variant, Variant> VARIANT_MAP = new HashMap<>();

    static {
        VARIANT_MAP.put(org.bukkit.entity.Pig.Variant.TEMPERATE, Variant.TEMPERATE);
        VARIANT_MAP.put(org.bukkit.entity.Pig.Variant.WARM, Variant.WARM);
        VARIANT_MAP.put(org.bukkit.entity.Pig.Variant.COLD, Variant.COLD);
    }

    public BukkitPig(org.bukkit.entity.Pig wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return VARIANT_MAP.get(wrapped.getVariant());
    }
}
