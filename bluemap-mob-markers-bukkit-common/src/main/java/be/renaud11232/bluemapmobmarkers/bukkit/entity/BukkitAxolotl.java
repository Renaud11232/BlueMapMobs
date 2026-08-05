package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Axolotl;

public class BukkitAxolotl extends BukkitAgeable<org.bukkit.entity.Axolotl> implements Axolotl {
    public BukkitAxolotl(org.bukkit.entity.Axolotl wrapped) {
        super(wrapped);
    }

    @Override
    public Variant getVariant() {
        return switch (wrapped.getVariant()) {
            case LUCY -> Variant.LUCY;
            case WILD -> Variant.WILD;
            case GOLD -> Variant.GOLD;
            case CYAN -> Variant.CYAN;
            case BLUE -> Variant.BLUE;
        };
    }
}
