package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleSingleVariantMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Villager;

public class VillagerMarkerBuilder extends SimpleSingleVariantMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected Villager.Type getVariant(Villager villager) {
        return villager.getType();
    }

    @Override
    protected void registerVariantIcons() {
        registerVariantIcon(Villager.Type.SNOW, MobsIcon.SNOWY_VILLAGER);
        registerVariantIcon(Villager.Type.SWAMP, MobsIcon.SWAMP_VILLAGER);
        registerVariantIcon(Villager.Type.TAIGA, MobsIcon.TAIGA_VILLAGER);
        registerVariantIcon(Villager.Type.DESERT, MobsIcon.DESERT_VILLAGER);
        registerVariantIcon(Villager.Type.JUNGLE, MobsIcon.JUNGLE_VILLAGER);
        registerVariantIcon(Villager.Type.PLAINS, MobsIcon.PLAINS_VILLAGER);
        registerVariantIcon(Villager.Type.SAVANNA, MobsIcon.SAVANNA_VILLAGER);
    }
}
