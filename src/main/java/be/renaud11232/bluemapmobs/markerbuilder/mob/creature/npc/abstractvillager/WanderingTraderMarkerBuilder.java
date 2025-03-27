package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WanderingTrader;

public class WanderingTraderMarkerBuilder extends MobEntityMarkerBuilder<WanderingTrader> {
    public WanderingTraderMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.WANDERING_TRADER, MobIcon.WANDERING_TRADER);
    }
}
