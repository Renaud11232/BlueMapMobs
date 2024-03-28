package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;

import java.util.Optional;

public class EvokerMarkerBuilder extends MobEntityMarkerBuilder<Evoker> {

    public EvokerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Evoker mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.EVOKER.getPath(), Icon.EVOKER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.evoker", true);
    }
}
