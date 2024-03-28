package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.Icon;
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
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.WANDERING_TRADER.getPath(), Icon.WANDERING_TRADER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.wandering_trader", true);
    }
}
