package be.renaud11232.bluemapcitizens.markerbuilder;

import be.renaud11232.bluemapcitizens.CitizensIcon;
import be.renaud11232.bluemapcitizens.entity.CitizensNPC;
import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import net.citizensnpcs.trait.SkinTrait;

import java.io.IOException;

public class CitizensMarkerBuilder extends SimpleSingleVariantMarkerBuilder<CitizensNPC, Integer> {
    public CitizensMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Integer getVariant(CitizensNPC entity) {
        return Math.floorMod(entity.getUUID().hashCode(), 9);
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(0, CitizensIcon.ALEX);
        registerVariantIcon(1, CitizensIcon.ARI);
        registerVariantIcon(2, CitizensIcon.EFE);
        registerVariantIcon(3, CitizensIcon.KAI);
        registerVariantIcon(4, CitizensIcon.MAKENA);
        registerVariantIcon(5, CitizensIcon.NOOR);
        registerVariantIcon(6, CitizensIcon.STEVE);
        registerVariantIcon(7, CitizensIcon.SUNNY);
        registerVariantIcon(8, CitizensIcon.ZURI);
    }

    @Override
    protected Icon getIcon(CitizensNPC entity) {
        SkinTrait skinTrait = entity.getSkinTrait();
        if (skinTrait == null || skinTrait.getTexture() == null) {
            return super.getIcon(entity);
        } else {
            try {
                return CitizensIcon.head(getAPI().getBlueMap().getWebApp().getWebRoot(), skinTrait.getTexture());
            } catch (IOException e) {
                return super.getIcon(entity);
            }
        }
    }
}
