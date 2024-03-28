package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illusioner;

import java.util.Optional;

public class IllusionerMarkerBuilder extends MobEntityMarkerBuilder<Illusioner> {

    public IllusionerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Illusioner mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ILLUSIONER.getPath(), Icon.ILLUSIONER.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.illusioner", true);
    }
}
