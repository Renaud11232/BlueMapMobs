package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Axolotl;

public class AxolotlMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Axolotl.Variant.LUCY, MobsIcon.AXOLOTL_LUCY);
        registerVariantAdultIcon(Axolotl.Variant.WILD, MobsIcon.AXOLOTL_WILD);
        registerVariantAdultIcon(Axolotl.Variant.GOLD, MobsIcon.AXOLOTL_GOLD);
        registerVariantAdultIcon(Axolotl.Variant.CYAN, MobsIcon.AXOLOTL_CYAN);
        registerVariantAdultIcon(Axolotl.Variant.BLUE, MobsIcon.AXOLOTL_BLUE);
        registerVariantBabyIcon(Axolotl.Variant.LUCY, MobsIcon.AXOLOTL_LUCY_BABY);
        registerVariantBabyIcon(Axolotl.Variant.WILD, MobsIcon.AXOLOTL_WILD_BABY);
        registerVariantBabyIcon(Axolotl.Variant.GOLD, MobsIcon.AXOLOTL_GOLD_BABY);
        registerVariantBabyIcon(Axolotl.Variant.CYAN, MobsIcon.AXOLOTL_CYAN_BABY);
        registerVariantBabyIcon(Axolotl.Variant.BLUE, MobsIcon.AXOLOTL_BLUE_BABY);
    }

    @Override
    protected Axolotl.Variant getVariant(Axolotl axolotl) {
        return axolotl.getVariant();
    }
}
