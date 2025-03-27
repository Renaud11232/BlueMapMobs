package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends MappedIconMobEntityMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE_VILLAGER, ZombieVillager::getVillagerType);
        registerIcon(Villager.Type.SNOW, BlueMapMobsIcon.Mob.SNOWY_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.SWAMP, BlueMapMobsIcon.Mob.SWAMP_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.TAIGA, BlueMapMobsIcon.Mob.TAIGA_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.DESERT, BlueMapMobsIcon.Mob.DESERT_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.JUNGLE, BlueMapMobsIcon.Mob.JUNGLE_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.PLAINS, BlueMapMobsIcon.Mob.PLAINS_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.SAVANNA, BlueMapMobsIcon.Mob.SAVANNA_ZOMBIE_VILLAGER);
    }
}
