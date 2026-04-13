package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Wolf;

public class BukkitWolf extends BukkitAgeable<org.bukkit.entity.Wolf> implements Wolf {
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
        var variant = wrapped.getVariant();
        if (variant.equals(org.bukkit.entity.Wolf.Variant.PALE)) {
            return Variant.PALE;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.SPOTTED)) {
            return Variant.SPOTTED;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.SNOWY)) {
            return Variant.SNOWY;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.BLACK)) {
            return Variant.BLACK;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.ASHEN)) {
            return Variant.ASHEN;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.RUSTY)) {
            return Variant.RUSTY;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.WOODS)) {
            return Variant.WOODS;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.CHESTNUT)) {
            return Variant.CHESTNUT;
        } else if (variant.equals(org.bukkit.entity.Wolf.Variant.STRIPED)) {
            return Variant.STRIPED;
        } else {
            return null;
        }
    }
}
