package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Frog;

import java.util.HashMap;
import java.util.Map;

public class BukkitFrog extends BukkitAgeable<org.bukkit.entity.Frog> implements Frog {
    private static final Map<org.bukkit.entity.Frog.Variant, Variant> VARIANT_MAP = new HashMap<>();

    public BukkitFrog(org.bukkit.entity.Frog wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return VARIANT_MAP.get(wrapped.getVariant());
    }

    static {
        VARIANT_MAP.put(org.bukkit.entity.Frog.Variant.TEMPERATE, Variant.TEMPERATE);
        VARIANT_MAP.put(org.bukkit.entity.Frog.Variant.WARM, Variant.WARM);
        VARIANT_MAP.put(org.bukkit.entity.Frog.Variant.COLD, Variant.COLD);
    }
}
