package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.squid.GlowSquidMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.GlowSquid;
import org.bukkit.entity.Squid;

import java.util.Optional;

public class SquidMarkerBuilder extends MobEntityMarkerBuilder<Squid> {
    public SquidMarkerBuilder() {
        registerMarkerBuilder(GlowSquid.class, new GlowSquidMarkerBuilder());
    }

    @Override
    public Optional<POIMarker> buildDefault(Squid mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
