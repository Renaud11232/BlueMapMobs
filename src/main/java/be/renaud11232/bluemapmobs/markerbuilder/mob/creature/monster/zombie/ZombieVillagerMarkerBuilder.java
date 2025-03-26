package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends MappedIconMobEntityMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.zombie_villager", ZombieVillager::getVillagerType);
        registerIcon(Villager.Type.SNOW, Icon.SNOWY_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.SWAMP, Icon.SWAMP_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.TAIGA, Icon.TAIGA_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.DESERT, Icon.DESERT_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.JUNGLE, Icon.JUNGLE_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.PLAINS, Icon.PLAINS_ZOMBIE_VILLAGER);
        registerIcon(Villager.Type.SAVANNA, Icon.SAVANNA_ZOMBIE_VILLAGER);
    }
}
