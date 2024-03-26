package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.WanderingTrader;

import java.util.Optional;

public class WanderingTraderMarkerBuilder extends MobEntityMarkerBuilder<WanderingTrader> {

    public WanderingTraderMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(WanderingTrader mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
