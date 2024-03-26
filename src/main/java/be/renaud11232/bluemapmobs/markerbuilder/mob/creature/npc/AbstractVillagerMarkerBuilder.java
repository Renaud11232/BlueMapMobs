package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager.VillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager.WanderingTraderMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.AbstractVillager;
import org.bukkit.entity.Villager;
import org.bukkit.entity.WanderingTrader;

public class AbstractVillagerMarkerBuilder extends MobEntityMarkerBuilder<AbstractVillager> {
    public AbstractVillagerMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Villager.class, new VillagerMarkerBuilder(config));
        registerMarkerBuilder(WanderingTrader.class, new WanderingTraderMarkerBuilder(config));
    }
}
