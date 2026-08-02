package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Wolf;

import java.util.HashMap;
import java.util.Map;

public class BukkitWolf extends BukkitAgeable<org.bukkit.entity.Wolf> implements Wolf {
    private static final Map<org.bukkit.entity.Wolf.Variant, Variant> VARIANT_MAP = new HashMap<>();

    static {
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.PALE, Variant.PALE);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.SPOTTED, Variant.SPOTTED);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.SNOWY, Variant.SNOWY);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.BLACK, Variant.BLACK);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.ASHEN, Variant.ASHEN);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.RUSTY, Variant.RUSTY);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.WOODS, Variant.WOODS);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.CHESTNUT, Variant.CHESTNUT);
        VARIANT_MAP.put(org.bukkit.entity.Wolf.Variant.STRIPED, Variant.STRIPED);
    }

    public BukkitWolf(org.bukkit.entity.Wolf wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isAngry() {
        return wrapped.isAngry();
    }

    @Override
    public boolean isTamed() {
        return wrapped.isTamed();
    }

    @Override
    public Variant getVariant() {
        return VARIANT_MAP.get(wrapped.getVariant());
    }
}
