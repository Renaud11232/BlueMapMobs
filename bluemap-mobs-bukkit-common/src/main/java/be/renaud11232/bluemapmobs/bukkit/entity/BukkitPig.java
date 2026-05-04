package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Pig;

public class BukkitPig extends BukkitAgeable<org.bukkit.entity.Pig> implements Pig {
    public BukkitPig(org.bukkit.entity.Pig wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        var variant = wrapped.getVariant();
        if (variant.equals(org.bukkit.entity.Pig.Variant.TEMPERATE)) {
            return Pig.Variant.TEMPERATE;
        } else if (variant.equals(org.bukkit.entity.Pig.Variant.WARM)) {
            return Pig.Variant.WARM;
        } else if (variant.equals(org.bukkit.entity.Pig.Variant.COLD)) {
            return Pig.Variant.COLD;
        } else {
            return null;
        }
    }
}
