package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.npc;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.npc.abstractvillager.VillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.npc.abstractvillager.WanderingTraderMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.Villager;
import org.bukkit.entity.WanderingTrader;

public class AbstractVillagerMarkerBuilder extends MobEntityMarkerBuilder<AbstractVillager> {
    public AbstractVillagerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<AbstractVillager> registry) {
        registry.register(Villager.class, new VillagerMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(WanderingTrader.class, new WanderingTraderMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
