package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.slime.MagmaCubeMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Slime;

import java.util.Optional;

public class SlimeMarkerBuilder extends MobEntityMarkerBuilder<Slime> {
    public SlimeMarkerBuilder() {
        registerMarkerBuilder(MagmaCube.class, new MagmaCubeMarkerBuilder());
    }

    @Override
    public Optional<POIMarker> buildDefault(Slime mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
