package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.npc;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.npc.abstractvillager.VillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.npc.abstractvillager.WanderingTraderMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.Villager;
import org.bukkit.entity.WanderingTrader;

public class AbstractVillagerMarkerBuilder extends AbstractMobMarkerBuilder<AbstractVillager> {
    public AbstractVillagerMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractVillager> registry) {
        registry.register(Villager.class, new VillagerMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(WanderingTrader.class, new WanderingTraderMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
