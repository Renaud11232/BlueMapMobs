package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Axolotl;
import de.bluecolored.bluemap.api.BlueMapAPI;

public class AxolotlMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Axolotl.Variant.LUCY, MobIcon.AXOLOTL_LUCY);
        registerVariantAdultIcon(Axolotl.Variant.WILD, MobIcon.AXOLOTL_WILD);
        registerVariantAdultIcon(Axolotl.Variant.GOLD, MobIcon.AXOLOTL_GOLD);
        registerVariantAdultIcon(Axolotl.Variant.CYAN, MobIcon.AXOLOTL_CYAN);
        registerVariantAdultIcon(Axolotl.Variant.BLUE, MobIcon.AXOLOTL_BLUE);
        registerVariantBabyIcon(Axolotl.Variant.LUCY, MobIcon.AXOLOTL_LUCY_BABY);
        registerVariantBabyIcon(Axolotl.Variant.WILD, MobIcon.AXOLOTL_WILD_BABY);
        registerVariantBabyIcon(Axolotl.Variant.GOLD, MobIcon.AXOLOTL_GOLD_BABY);
        registerVariantBabyIcon(Axolotl.Variant.CYAN, MobIcon.AXOLOTL_CYAN_BABY);
        registerVariantBabyIcon(Axolotl.Variant.BLUE, MobIcon.AXOLOTL_BLUE_BABY);
    }

    @Override
    protected Axolotl.Variant getVariant(Axolotl axolotl) {
        return axolotl.getVariant();
    }
}
