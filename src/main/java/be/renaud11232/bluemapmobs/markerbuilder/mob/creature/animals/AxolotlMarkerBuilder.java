package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Axolotl;

import java.util.Optional;

public class AxolotlMarkerBuilder extends MobEntityMarkerBuilder<Axolotl> {

    public AxolotlMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Axolotl axolotl) {
        return super.buildDefault(axolotl).map(marker -> {
            Icon icon = switch (axolotl.getVariant()) {
                case LUCY -> Icon.LUCY_AXOLOTL;
                case WILD -> Icon.WILD_AXOLOTL;
                case GOLD -> Icon.GOLD_AXOLOTL;
                case CYAN -> Icon.CYAN_AXOLOTL;
                case BLUE -> Icon.BLUE_AXOLOTL;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.axolotl", true);
    }
}
