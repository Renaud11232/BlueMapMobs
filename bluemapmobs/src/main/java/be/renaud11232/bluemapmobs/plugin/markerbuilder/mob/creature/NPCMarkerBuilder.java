package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.npc.AbstractVillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.NPC;

public class NPCMarkerBuilder extends AbstractMobMarkerBuilder<NPC> {
    public NPCMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<NPC> registry) {
        registry.register(AbstractVillager.class, new AbstractVillagerMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
