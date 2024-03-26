package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.GlowSquid;

import java.util.Optional;

public class GlowSquidMarkerBuilder extends MobEntityMarkerBuilder<GlowSquid> {

    public GlowSquidMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(GlowSquid mob) {
        //TODO
        return super.buildDefault(mob);
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.glow_squid", true);
    }
}
