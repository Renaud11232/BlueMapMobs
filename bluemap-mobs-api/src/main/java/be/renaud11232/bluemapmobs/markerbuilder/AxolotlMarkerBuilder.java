package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Axolotl;

public class AxolotlMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Axolotl.Variant getVariant(Axolotl axolotl) {
        return axolotl.getVariant();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Axolotl.Variant.LUCY, MobsIcon.LUCY_AXOLOTL);
        registerVariantIcon(Axolotl.Variant.WILD, MobsIcon.WILD_AXOLOTL);
        registerVariantIcon(Axolotl.Variant.GOLD, MobsIcon.GOLD_AXOLOTL);
        registerVariantIcon(Axolotl.Variant.CYAN, MobsIcon.CYAN_AXOLOTL);
        registerVariantIcon(Axolotl.Variant.BLUE, MobsIcon.BLUE_AXOLOTL);
    }
}
