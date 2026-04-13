package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.MushroomCow;

public class BukkitMushroomCow extends BukkitAgeable<org.bukkit.entity.MushroomCow> implements MushroomCow {
    public BukkitMushroomCow(org.bukkit.entity.MushroomCow wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant()) {
            case RED -> Variant.RED;
            case BROWN -> Variant.BROWN;
        };
    }
}
