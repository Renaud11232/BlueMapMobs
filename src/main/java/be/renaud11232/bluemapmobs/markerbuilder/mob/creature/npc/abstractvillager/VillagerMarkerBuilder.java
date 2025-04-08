package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

public class VillagerMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.VILLAGER;
    }

    @Override
    public Villager.Type getVariant(Villager villager) {
        return villager.getVillagerType();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Villager.Type> registry) {
        registry.register(Villager.Type.SNOW, BlueMapMobsIcon.Mob.SNOWY_VILLAGER);
        registry.register(Villager.Type.SWAMP, BlueMapMobsIcon.Mob.SWAMP_VILLAGER);
        registry.register(Villager.Type.TAIGA, BlueMapMobsIcon.Mob.TAIGA_VILLAGER);
        registry.register(Villager.Type.DESERT, BlueMapMobsIcon.Mob.DESERT_VILLAGER);
        registry.register(Villager.Type.JUNGLE, BlueMapMobsIcon.Mob.JUNGLE_VILLAGER);
        registry.register(Villager.Type.PLAINS, BlueMapMobsIcon.Mob.PLAINS_VILLAGER);
        registry.register(Villager.Type.SAVANNA, BlueMapMobsIcon.Mob.SAVANNA_VILLAGER);
    }
}
