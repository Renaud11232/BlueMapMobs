package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Cow;

public class BukkitCow extends BukkitAgeable<org.bukkit.entity.Cow> implements Cow {
    public BukkitCow(org.bukkit.entity.Cow wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        var variant = wrapped.getVariant();
        if (variant.equals(org.bukkit.entity.Cow.Variant.TEMPERATE)) {
            return Cow.Variant.TEMPERATE;
        } else if (variant.equals(org.bukkit.entity.Cow.Variant.WARM)) {
            return Cow.Variant.WARM;
        } else if (variant.equals(org.bukkit.entity.Cow.Variant.COLD)) {
            return Cow.Variant.COLD;
        } else {
            return null;
        }
    }
}
