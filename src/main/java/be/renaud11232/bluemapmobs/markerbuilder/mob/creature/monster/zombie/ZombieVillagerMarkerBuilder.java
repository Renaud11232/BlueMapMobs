package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends MappedIconMobEntityMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.ZOMBIE_VILLAGER, ZombieVillager::getVillagerType);
        registerIcon(Villager.Type.SNOW, MobIcon.SNOWY_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.SWAMP, MobIcon.SWAMP_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.TAIGA, MobIcon.TAIGA_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.DESERT, MobIcon.DESERT_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.JUNGLE, MobIcon.JUNGLE_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.PLAINS, MobIcon.PLAINS_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.SAVANNA, MobIcon.SAVANNA_ZOMBIE_VILLAGER);
    }
}
