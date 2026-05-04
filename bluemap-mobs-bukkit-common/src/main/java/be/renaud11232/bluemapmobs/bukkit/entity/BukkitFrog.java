package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Frog;

public class BukkitFrog extends BukkitAgeable<org.bukkit.entity.Frog> implements Frog {
    public BukkitFrog(org.bukkit.entity.Frog wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        var variant = wrapped.getVariant();
        if (variant.equals(org.bukkit.entity.Frog.Variant.TEMPERATE)) {
            return Frog.Variant.TEMPERATE;
        } else if (variant.equals(org.bukkit.entity.Frog.Variant.WARM)) {
            return Frog.Variant.WARM;
        } else if (variant.equals(org.bukkit.entity.Frog.Variant.COLD)) {
            return Frog.Variant.COLD;
        } else {
            return null;
        }
    }
}
