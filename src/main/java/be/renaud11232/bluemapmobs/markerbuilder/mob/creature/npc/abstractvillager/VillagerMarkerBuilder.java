package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

public class VillagerMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.VILLAGER, Villager::getVillagerType);
        registerIcon(Villager.Type.SNOW, MobIcon.SNOWY_VILLAGER);
        registerIcon(Villager.Type.SWAMP, MobIcon.SWAMP_VILLAGER);
        registerIcon(Villager.Type.TAIGA, MobIcon.TAIGA_VILLAGER);
        registerIcon(Villager.Type.DESERT, MobIcon.DESERT_VILLAGER);
        registerIcon(Villager.Type.JUNGLE, MobIcon.JUNGLE_VILLAGER);
        registerIcon(Villager.Type.PLAINS, MobIcon.PLAINS_VILLAGER);
        registerIcon(Villager.Type.SAVANNA, MobIcon.SAVANNA_VILLAGER);
    }
}
