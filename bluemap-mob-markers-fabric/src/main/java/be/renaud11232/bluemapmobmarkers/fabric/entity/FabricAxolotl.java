package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Axolotl;

public class FabricAxolotl extends FabricAgeable<net.minecraft.world.entity.animal.axolotl.Axolotl> implements Axolotl {
    public FabricAxolotl(net.minecraft.world.entity.animal.axolotl.Axolotl wrapped) {
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
