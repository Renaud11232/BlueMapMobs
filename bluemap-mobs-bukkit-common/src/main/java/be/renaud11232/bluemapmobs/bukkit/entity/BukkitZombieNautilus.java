package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.ZombieNautilus;

import java.util.HashMap;
import java.util.Map;

public class BukkitZombieNautilus extends BukkitAgeable<org.bukkit.entity.ZombieNautilus> implements ZombieNautilus {
    private static final Map<org.bukkit.entity.ZombieNautilus.Variant, Variant> VARIANT_MAP = new HashMap<>();

    public BukkitZombieNautilus(org.bukkit.entity.ZombieNautilus wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return  VARIANT_MAP.get(wrapped.getVariant());
    }

    static {
        VARIANT_MAP.put(org.bukkit.entity.ZombieNautilus.Variant.TEMPERATE, Variant.TEMPERATE);
        VARIANT_MAP.put(org.bukkit.entity.ZombieNautilus.Variant.WARM, Variant.WARM);
    }
}
