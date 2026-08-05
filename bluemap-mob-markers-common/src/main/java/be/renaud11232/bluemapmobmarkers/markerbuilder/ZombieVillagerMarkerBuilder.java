package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.MobStyleClass;
import be.renaud11232.bluemapmobmarkers.entity.Villager;
import be.renaud11232.bluemapmobmarkers.entity.ZombieVillager;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;

public class ZombieVillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        registerVariantAdultIcon(Villager.Type.SNOW, MobIcon.ZOMBIE_VILLAGER_SNOW);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobIcon.ZOMBIE_VILLAGER_SWAMP);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobIcon.ZOMBIE_VILLAGER_TAIGA);
        registerVariantAdultIcon(Villager.Type.DESERT, MobIcon.ZOMBIE_VILLAGER_DESERT);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobIcon.ZOMBIE_VILLAGER_JUNGLE);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobIcon.ZOMBIE_VILLAGER_PLAINS);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobIcon.ZOMBIE_VILLAGER_SAVANNA);
        registerVariantBabyIcon(Villager.Type.SNOW, MobIcon.ZOMBIE_VILLAGER_SNOW_BABY);
        registerVariantBabyIcon(Villager.Type.SWAMP, MobIcon.ZOMBIE_VILLAGER_SWAMP_BABY);
        registerVariantBabyIcon(Villager.Type.TAIGA, MobIcon.ZOMBIE_VILLAGER_TAIGA_BABY);
        registerVariantBabyIcon(Villager.Type.DESERT, MobIcon.ZOMBIE_VILLAGER_DESERT_BABY);
        registerVariantBabyIcon(Villager.Type.JUNGLE, MobIcon.ZOMBIE_VILLAGER_JUNGLE_BABY);
        registerVariantBabyIcon(Villager.Type.PLAINS, MobIcon.ZOMBIE_VILLAGER_PLAINS_BABY);
        registerVariantBabyIcon(Villager.Type.SAVANNA, MobIcon.ZOMBIE_VILLAGER_SAVANNA_BABY);
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobStyleClass.ZOMBIE_VILLAGER);
    }

    @Override
    protected Collection<String> getDefaultBabyStyleClasses() {
        return List.of(MobStyleClass.ZOMBIE_VILLAGER_BABY);
    }

    @Override
    protected Villager.Type getVariant(ZombieVillager zombieVillager) {
        return zombieVillager.getType();
    }
}
