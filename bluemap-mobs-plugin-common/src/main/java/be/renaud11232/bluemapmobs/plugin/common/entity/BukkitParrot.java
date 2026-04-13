package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Parrot;

public class BukkitParrot extends BukkitAgeable<org.bukkit.entity.Parrot> implements Parrot {
    public BukkitParrot(org.bukkit.entity.Parrot wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant()) {
            case RED -> Variant.RED;
            case BLUE -> Variant.BLUE;
            case GREEN -> Variant.GREEN;
            case CYAN -> Variant.CYAN;
            case GRAY -> Variant.GRAY;
        };
    }
}
