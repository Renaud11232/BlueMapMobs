package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.MobsStyleClass;
import be.renaud11232.bluemapmobs.entity.Villager;
import be.renaud11232.bluemapmobs.entity.ZombieVillager;

import java.util.Collection;
import java.util.List;

public class ZombieVillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Villager.Type.SNOW, MobsIcon.ZOMBIE_VILLAGER_SNOW);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobsIcon.ZOMBIE_VILLAGER_SWAMP);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobsIcon.ZOMBIE_VILLAGER_TAIGA);
        registerVariantAdultIcon(Villager.Type.DESERT, MobsIcon.ZOMBIE_VILLAGER_DESERT);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobsIcon.ZOMBIE_VILLAGER_JUNGLE);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobsIcon.ZOMBIE_VILLAGER_PLAINS);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobsIcon.ZOMBIE_VILLAGER_SAVANNA);
        registerVariantBabyIcon(Villager.Type.SNOW, MobsIcon.ZOMBIE_VILLAGER_SNOW_BABY);
        registerVariantBabyIcon(Villager.Type.SWAMP, MobsIcon.ZOMBIE_VILLAGER_SWAMP_BABY);
        registerVariantBabyIcon(Villager.Type.TAIGA, MobsIcon.ZOMBIE_VILLAGER_TAIGA_BABY);
        registerVariantBabyIcon(Villager.Type.DESERT, MobsIcon.ZOMBIE_VILLAGER_DESERT_BABY);
        registerVariantBabyIcon(Villager.Type.JUNGLE, MobsIcon.ZOMBIE_VILLAGER_JUNGLE_BABY);
        registerVariantBabyIcon(Villager.Type.PLAINS, MobsIcon.ZOMBIE_VILLAGER_PLAINS_BABY);
        registerVariantBabyIcon(Villager.Type.SAVANNA, MobsIcon.ZOMBIE_VILLAGER_SAVANNA_BABY);
    }

    @Override
    protected Collection<String> getDefaultAdultStyleClasses() {
        return List.of(MobsStyleClass.ZOMBIE_VILLAGER);
    }

    @Override
    protected Collection<String> getDefaultBabyStyleClasses() {
        return List.of(MobsStyleClass.ZOMBIE_VILLAGER_BABY);
    }

    @Override
    protected Villager.Type getVariant(ZombieVillager zombieVillager) {
        return zombieVillager.getType();
    }
}
