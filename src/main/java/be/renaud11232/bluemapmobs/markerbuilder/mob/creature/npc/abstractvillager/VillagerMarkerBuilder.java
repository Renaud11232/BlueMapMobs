package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

public class VillagerMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.villager", Villager::getVillagerType);
        registerIcon(Villager.Type.SNOW, Icon.SNOWY_VILLAGER);
        registerIcon(Villager.Type.SWAMP, Icon.SWAMP_VILLAGER);
        registerIcon(Villager.Type.TAIGA, Icon.TAIGA_VILLAGER);
        registerIcon(Villager.Type.DESERT, Icon.DESERT_VILLAGER);
        registerIcon(Villager.Type.JUNGLE, Icon.JUNGLE_VILLAGER);
        registerIcon(Villager.Type.PLAINS, Icon.PLAINS_VILLAGER);
        registerIcon(Villager.Type.SAVANNA, Icon.SAVANNA_VILLAGER);
    }
}
