package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.AbstractVillagerMarkerBuilder;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.NPC;

public class NPCMarkerBuilder extends MobEntityMarkerBuilder<NPC> {
    public NPCMarkerBuilder() {
        registerMarkerBuilder(AbstractVillager.class, new AbstractVillagerMarkerBuilder());
    }
}
