package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WanderingTrader;

public class WanderingTraderMarkerBuilder extends MobEntityMarkerBuilder<WanderingTrader> {
    public WanderingTraderMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.WANDERING_TRADER, BlueMapMobsIcon.Mob.WANDERING_TRADER);
    }
}
