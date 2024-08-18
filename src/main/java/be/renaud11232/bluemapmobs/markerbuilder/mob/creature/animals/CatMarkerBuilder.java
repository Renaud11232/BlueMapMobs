package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CatMarkerBuilder extends MobEntityMarkerBuilder<Cat> {

    private final Map<Cat.Type, Icon> icons = new HashMap<>();

    public CatMarkerBuilder(FileConfiguration config) {
        super(config);
        icons.put(Cat.Type.RED, Icon.RED_CAT);
        icons.put(Cat.Type.BLACK, Icon.RED_CAT);
        icons.put(Cat.Type.TABBY, Icon.TABBY_CAT);
        icons.put(Cat.Type.WHITE, Icon.WHITE_CAT);
        icons.put(Cat.Type.CALICO, Icon.CALICO_CAT);
        icons.put(Cat.Type.JELLIE, Icon.JELLIE_CAT);
        icons.put(Cat.Type.PERSIAN, Icon.PERSIAN_CAT);
        icons.put(Cat.Type.RAGDOLL, Icon.RAGDOLL_CAT);
        icons.put(Cat.Type.SIAMESE, Icon.SIAMESE_CAT);
        icons.put(Cat.Type.ALL_BLACK, Icon.ALL_BLACK_CAT);
        icons.put(Cat.Type.BRITISH_SHORTHAIR, Icon.BRITISH_SHORTHAIR_CAT);
    }

    @Override
    public Optional<POIMarker> buildDefault(Cat cat) {
        return super.buildDefault(cat).map(marker -> {
            Icon icon = icons.getOrDefault(cat.getCatType(), Icon.UNKNOWN);
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.cat", true);
    }
}
