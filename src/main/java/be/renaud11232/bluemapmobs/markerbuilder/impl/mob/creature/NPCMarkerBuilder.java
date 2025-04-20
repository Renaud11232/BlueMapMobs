package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.npc.AbstractVillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.NPC;

public class NPCMarkerBuilder extends MobEntityMarkerBuilder<NPC> {
    public NPCMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<NPC> registry) {
        registry.register(AbstractVillager.class, new AbstractVillagerMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
