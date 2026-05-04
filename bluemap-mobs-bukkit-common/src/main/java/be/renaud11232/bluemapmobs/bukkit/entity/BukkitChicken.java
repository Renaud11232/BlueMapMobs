package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Chicken;

public class BukkitChicken extends BukkitAgeable<org.bukkit.entity.Chicken> implements Chicken {
    public BukkitChicken(org.bukkit.entity.Chicken wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        var variant = wrapped.getVariant();
        if (variant.equals(org.bukkit.entity.Chicken.Variant.TEMPERATE)) {
            return Variant.TEMPERATE;
        } else if (variant.equals(org.bukkit.entity.Chicken.Variant.WARM)) {
            return Variant.WARM;
        } else if (variant.equals(org.bukkit.entity.Chicken.Variant.COLD)) {
            return Variant.COLD;
        } else {
            return null;
        }
    }
}
