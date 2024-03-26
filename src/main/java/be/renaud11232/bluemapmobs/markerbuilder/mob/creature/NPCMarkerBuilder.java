package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.AbstractVillagerMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.NPC;

public class NPCMarkerBuilder extends MobEntityMarkerBuilder<NPC> {
    public NPCMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(AbstractVillager.class, new AbstractVillagerMarkerBuilder(config));
    }
}
