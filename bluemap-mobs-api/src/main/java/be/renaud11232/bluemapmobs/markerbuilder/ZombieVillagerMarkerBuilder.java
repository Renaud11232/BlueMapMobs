package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Villager;
import be.renaud11232.bluemapmobs.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends SimpleSingleVariantMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Villager.Type getVariant(ZombieVillager zombieVillager) {
        return zombieVillager.getType();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Villager.Type.SNOW, MobsIcon.SNOWY_ZOMBIE_VILLAGER);
        registerVariantIcon(Villager.Type.SWAMP, MobsIcon.SWAMP_ZOMBIE_VILLAGER);
        registerVariantIcon(Villager.Type.TAIGA, MobsIcon.TAIGA_ZOMBIE_VILLAGER);
        registerVariantIcon(Villager.Type.DESERT, MobsIcon.DESERT_ZOMBIE_VILLAGER);
        registerVariantIcon(Villager.Type.JUNGLE, MobsIcon.JUNGLE_ZOMBIE_VILLAGER);
        registerVariantIcon(Villager.Type.PLAINS, MobsIcon.PLAINS_ZOMBIE_VILLAGER);
        registerVariantIcon(Villager.Type.SAVANNA, MobsIcon.SAVANNA_ZOMBIE_VILLAGER);
    }
}
