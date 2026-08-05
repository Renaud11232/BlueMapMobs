package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Villager;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;

public class VillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Villager.Type.SNOW, MobIcon.VILLAGER_SNOW);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobIcon.VILLAGER_SWAMP);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobIcon.VILLAGER_TAIGA);
        registerVariantAdultIcon(Villager.Type.DESERT, MobIcon.VILLAGER_DESERT);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobIcon.VILLAGER_JUNGLE);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobIcon.VILLAGER_PLAINS);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobIcon.VILLAGER_SAVANNA);
        registerVariantBabyIcon(Villager.Type.SNOW, MobIcon.VILLAGER_SNOW_BABY);
        registerVariantBabyIcon(Villager.Type.SWAMP, MobIcon.VILLAGER_SWAMP_BABY);
        registerVariantBabyIcon(Villager.Type.TAIGA, MobIcon.VILLAGER_TAIGA_BABY);
        registerVariantBabyIcon(Villager.Type.DESERT, MobIcon.VILLAGER_DESERT_BABY);
        registerVariantBabyIcon(Villager.Type.JUNGLE, MobIcon.VILLAGER_JUNGLE_BABY);
        registerVariantBabyIcon(Villager.Type.PLAINS, MobIcon.VILLAGER_PLAINS_BABY);
        registerVariantBabyIcon(Villager.Type.SAVANNA, MobIcon.VILLAGER_SAVANNA_BABY);
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobStyleClass.VILLAGER);
    }

    @Override
    protected Collection<String> getDefaultBabyStyleClasses() {
        return List.of(MobStyleClass.VILLAGER_BABY);
    }

    @Override
    protected Villager.Type getVariant(Villager villager) {
        return villager.getType();
    }
}
