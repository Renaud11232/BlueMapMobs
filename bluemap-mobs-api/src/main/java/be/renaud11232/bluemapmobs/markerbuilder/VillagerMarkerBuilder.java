package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Villager;

public class VillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Villager.Type.SNOW, MobsIcon.VILLAGER_SNOWY);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobsIcon.VILLAGER_SWAMP);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobsIcon.VILLAGER_TAIGA);
        registerVariantAdultIcon(Villager.Type.DESERT, MobsIcon.VILLAGER_DESERT);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobsIcon.VILLAGER_JUNGLE);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobsIcon.VILLAGER_PLAINS);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobsIcon.VILLAGER_SAVANNA);
        //TODO: add baby variants
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        //TODO: add default adult icon, if any
        return super.getDefaultAdultIcon();
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO: add default baby icon
        return super.getDefaultBabyIcon();
    }

    @Override
    protected Villager.Type getVariant(Villager villager) {
        return villager.getType();
    }
}
