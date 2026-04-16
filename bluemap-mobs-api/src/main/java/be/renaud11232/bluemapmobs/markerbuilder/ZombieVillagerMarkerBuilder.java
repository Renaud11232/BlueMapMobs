package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Villager;
import be.renaud11232.bluemapmobs.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends AgeableSingleVariantMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        registerVariantAdultIcon(Villager.Type.SNOW, MobsIcon.ZOMBIE_VILLAGER_SNOWY);
        registerVariantAdultIcon(Villager.Type.SWAMP, MobsIcon.ZOMBIE_VILLAGER_SWAMP);
        registerVariantAdultIcon(Villager.Type.TAIGA, MobsIcon.ZOMBIE_VILLAGER_TAIGA);
        registerVariantAdultIcon(Villager.Type.DESERT, MobsIcon.ZOMBIE_VILLAGER_DESERT);
        registerVariantAdultIcon(Villager.Type.JUNGLE, MobsIcon.ZOMBIE_VILLAGER_JUNGLE);
        registerVariantAdultIcon(Villager.Type.PLAINS, MobsIcon.ZOMBIE_VILLAGER_PLAINS);
        registerVariantAdultIcon(Villager.Type.SAVANNA, MobsIcon.ZOMBIE_VILLAGER_SAVANNA);
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
