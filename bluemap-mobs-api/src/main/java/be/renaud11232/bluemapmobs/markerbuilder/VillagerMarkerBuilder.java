package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Villager;

import java.util.Collection;
import java.util.List;

public class VillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Villager.Type.SNOW, MobsIcon.VILLAGER_SNOW);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobsIcon.VILLAGER_SWAMP);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobsIcon.VILLAGER_TAIGA);
        registerVariantAdultIcon(Villager.Type.DESERT, MobsIcon.VILLAGER_DESERT);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobsIcon.VILLAGER_JUNGLE);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobsIcon.VILLAGER_PLAINS);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobsIcon.VILLAGER_SAVANNA);
        registerVariantBabyIcon(Villager.Type.SNOW, MobsIcon.VILLAGER_SNOW_BABY);
        registerVariantBabyIcon(Villager.Type.SWAMP, MobsIcon.VILLAGER_SWAMP_BABY);
        registerVariantBabyIcon(Villager.Type.TAIGA, MobsIcon.VILLAGER_TAIGA_BABY);
        registerVariantBabyIcon(Villager.Type.DESERT, MobsIcon.VILLAGER_DESERT_BABY);
        registerVariantBabyIcon(Villager.Type.JUNGLE, MobsIcon.VILLAGER_JUNGLE_BABY);
        registerVariantBabyIcon(Villager.Type.PLAINS, MobsIcon.VILLAGER_PLAINS_BABY);
        registerVariantBabyIcon(Villager.Type.SAVANNA, MobsIcon.VILLAGER_SAVANNA_BABY);
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobsStyleClass.VILLAGER);
    }

    @Override
    protected Collection<String> getDefaultBabyStyleClasses() {
        return List.of(MobsStyleClass.VILLAGER_BABY);
    }

    @Override
    protected Villager.Type getVariant(Villager villager) {
        return villager.getType();
    }
}
