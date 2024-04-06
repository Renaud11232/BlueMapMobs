package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

import java.util.Optional;

public class CatMarkerBuilder extends MobEntityMarkerBuilder<Cat> {

    public CatMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Cat cat) {
        return super.buildDefault(cat).map(marker -> {
            Icon icon = switch (cat.getCatType()) {
                case RED -> Icon.RED_CAT;
                case BLACK -> Icon.BLACK_CAT;
                case TABBY -> Icon.TABBY_CAT;
                case WHITE -> Icon.WHITE_CAT;
                case CALICO -> Icon.CALICO_CAT;
                case JELLIE -> Icon.JELLIE_CAT;
                case PERSIAN -> Icon.PERSIAN_CAT;
                case RAGDOLL -> Icon.RAGDOLL_CAT;
                case SIAMESE -> Icon.SIAMESE_CAT;
                case ALL_BLACK -> Icon.ALL_BLACK_CAT;
                case BRITISH_SHORTHAIR -> Icon.BRITISH_SHORTHAIR_CAT;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cat", true);
    }
}
