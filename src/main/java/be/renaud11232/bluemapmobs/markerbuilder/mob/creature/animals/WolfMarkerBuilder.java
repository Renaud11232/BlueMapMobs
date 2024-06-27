package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.Optional;

public class WolfMarkerBuilder extends MobEntityMarkerBuilder<Wolf> {

    public WolfMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Wolf wolf) {
        return super.buildDefault(wolf).map(marker -> {
            Icon icon = Icon.UNKNOWN;
            if(wolf.isTamed()) {
                if (wolf.getVariant().equals(Wolf.Variant.ASHEN)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.BLACK)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.CHESTNUT)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.PALE)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.RUSTY)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.SNOWY)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.SPOTTED)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.STRIPED)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.WOODS)) {

                }
            } else {
                if (wolf.getVariant().equals(Wolf.Variant.ASHEN)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.BLACK)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.CHESTNUT)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.PALE)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.RUSTY)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.SNOWY)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.SPOTTED)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.STRIPED)) {

                } else if (wolf.getVariant().equals(Wolf.Variant.WOODS)) {

                }
            }
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.wolf", true);
    }
}
