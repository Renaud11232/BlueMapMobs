package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public BooleanConfiguration getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE_VILLAGER;
    }

    @Override
    public Villager.Type getVariant(ZombieVillager zombieVillager) {
        return zombieVillager.getVillagerType();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Villager.Type> registry) {
        registry.register(Villager.Type.SNOW, BlueMapMobsIcon.Mob.SNOWY_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.SWAMP, BlueMapMobsIcon.Mob.SWAMP_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.TAIGA, BlueMapMobsIcon.Mob.TAIGA_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.DESERT, BlueMapMobsIcon.Mob.DESERT_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.JUNGLE, BlueMapMobsIcon.Mob.JUNGLE_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.PLAINS, BlueMapMobsIcon.Mob.PLAINS_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.SAVANNA, BlueMapMobsIcon.Mob.SAVANNA_ZOMBIE_VILLAGER);
    }
}
