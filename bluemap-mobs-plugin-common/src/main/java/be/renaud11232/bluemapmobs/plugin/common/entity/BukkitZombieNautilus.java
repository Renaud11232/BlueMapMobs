package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.ZombieNautilus;

public class BukkitZombieNautilus extends BukkitAgeable<org.bukkit.entity.ZombieNautilus> implements ZombieNautilus {
    public BukkitZombieNautilus(org.bukkit.entity.ZombieNautilus wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        var variant = wrapped.getVariant();
        if (variant.equals(org.bukkit.entity.ZombieNautilus.Variant.TEMPERATE)) {
            return Variant.TEMPERATE;
        } else if (variant.equals(org.bukkit.entity.ZombieNautilus.Variant.WARM)) {
            return Variant.WARM;
        } else {
            return null;
        }
    }
}
