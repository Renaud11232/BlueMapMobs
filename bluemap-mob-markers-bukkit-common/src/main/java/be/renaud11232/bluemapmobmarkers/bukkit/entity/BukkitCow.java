package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Cow;

import java.util.HashMap;
import java.util.Map;

public class BukkitCow extends BukkitAgeable<org.bukkit.entity.Cow> implements Cow {
    private static final Map<org.bukkit.entity.Cow.Variant, Variant> VARIANT_MAP = new HashMap<>();

    static {
        VARIANT_MAP.put(org.bukkit.entity.Cow.Variant.TEMPERATE, Variant.TEMPERATE);
        VARIANT_MAP.put(org.bukkit.entity.Cow.Variant.WARM, Variant.WARM);
        VARIANT_MAP.put(org.bukkit.entity.Cow.Variant.COLD, Variant.COLD);
    }

    public BukkitCow(org.bukkit.entity.Cow wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return VARIANT_MAP.get(wrapped.getVariant());
    }
}
