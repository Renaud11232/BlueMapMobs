package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.ZombieNautilus;

import java.util.HashMap;
import java.util.Map;

public class BukkitZombieNautilus extends BukkitAgeable<org.bukkit.entity.ZombieNautilus> implements ZombieNautilus {
    private static final Map<org.bukkit.entity.ZombieNautilus.Variant, Variant> VARIANT_MAP = new HashMap<>();

    static {
        VARIANT_MAP.put(org.bukkit.entity.ZombieNautilus.Variant.TEMPERATE, Variant.TEMPERATE);
        VARIANT_MAP.put(org.bukkit.entity.ZombieNautilus.Variant.WARM, Variant.WARM);
    }

    public BukkitZombieNautilus(org.bukkit.entity.ZombieNautilus wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return VARIANT_MAP.get(wrapped.getVariant());
    }
}
