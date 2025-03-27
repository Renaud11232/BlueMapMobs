package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

public class VillagerMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.VILLAGER, Villager::getVillagerType);
        registerIcon(Villager.Type.SNOW, BlueMapMobsIcon.Mob.SNOWY_VILLAGER);
        registerIcon(Villager.Type.SWAMP, BlueMapMobsIcon.Mob.SWAMP_VILLAGER);
        registerIcon(Villager.Type.TAIGA, BlueMapMobsIcon.Mob.TAIGA_VILLAGER);
        registerIcon(Villager.Type.DESERT, BlueMapMobsIcon.Mob.DESERT_VILLAGER);
        registerIcon(Villager.Type.JUNGLE, BlueMapMobsIcon.Mob.JUNGLE_VILLAGER);
        registerIcon(Villager.Type.PLAINS, BlueMapMobsIcon.Mob.PLAINS_VILLAGER);
        registerIcon(Villager.Type.SAVANNA, BlueMapMobsIcon.Mob.SAVANNA_VILLAGER);
    }
}
