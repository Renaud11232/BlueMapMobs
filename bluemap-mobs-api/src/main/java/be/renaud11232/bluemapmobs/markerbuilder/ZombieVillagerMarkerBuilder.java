package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Villager;
import be.renaud11232.bluemapmobs.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Villager.Type.SNOW, MobsIcon.SNOWY_ZOMBIE_VILLAGER);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobsIcon.SWAMP_ZOMBIE_VILLAGER);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobsIcon.TAIGA_ZOMBIE_VILLAGER);
        registerVariantAdultIcon(Villager.Type.DESERT, MobsIcon.DESERT_ZOMBIE_VILLAGER);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobsIcon.JUNGLE_ZOMBIE_VILLAGER);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobsIcon.PLAINS_ZOMBIE_VILLAGER);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobsIcon.SAVANNA_ZOMBIE_VILLAGER);
        //TODO: add baby variants
    }

    @Override
    protected Icon getDefaultAdultIcon() {
        //TODO: add default adult icon
        return super.getDefaultAdultIcon();
    }

    @Override
    protected Icon getDefaultBabyIcon() {
        //TODO: add default baby icon
        return super.getDefaultBabyIcon();
    }

    @Override
    protected Villager.Type getVariant(ZombieVillager zombieVillager) {
        return zombieVillager.getType();
    }
}
