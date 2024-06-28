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
            Icon icon;
            if(wolf.isAngry()) {
                if (wolf.getVariant().equals(Wolf.Variant.ASHEN)) {
                    icon = Icon.ANGRY_ASHEN_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.BLACK)) {
                    icon = Icon.ANGRY_BLACK_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.CHESTNUT)) {
                    icon = Icon.ANGRY_CHESTNUT_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.PALE)) {
                    icon = Icon.ANGRY_PALE_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.RUSTY)) {
                    icon = Icon.ANGRY_RUSTY_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.SNOWY)) {
                    icon = Icon.ANGRY_SNOWY_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.SPOTTED)) {
                    icon = Icon.ANGRY_SPOTTED_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.STRIPED)) {
                    icon = Icon.ANGRY_STRIPED_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.WOODS)) {
                    icon = Icon.ANGRY_WOODS_WOLF;
                } else {
                    icon = Icon.TAMED_WOLF;
                }
            } else if (wolf.isTamed()) {
                if (wolf.getVariant().equals(Wolf.Variant.ASHEN)) {
                    icon = Icon.TAMED_ASHEN_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.BLACK)) {
                    icon = Icon.TAMED_BLACK_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.CHESTNUT)) {
                    icon = Icon.TAMED_CHESTNUT_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.PALE)) {
                    icon = Icon.TAMED_PALE_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.RUSTY)) {
                    icon = Icon.TAMED_RUSTY_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.SNOWY)) {
                    icon = Icon.TAMED_SNOWY_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.SPOTTED)) {
                    icon = Icon.TAMED_SPOTTED_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.STRIPED)) {
                    icon = Icon.TAMED_STRIPED_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.WOODS)) {
                    icon = Icon.TAMED_WOODS_WOLF;
                } else {
                    icon = Icon.TAMED_WOLF;
                }
            } else {
                if (wolf.getVariant().equals(Wolf.Variant.ASHEN)) {
                    icon = Icon.UNTAMED_ASHEN_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.BLACK)) {
                    icon = Icon.UNTAMED_BLACK_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.CHESTNUT)) {
                    icon = Icon.UNTAMED_CHESTNUT_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.PALE)) {
                    icon = Icon.UNTAMED_PALE_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.RUSTY)) {
                    icon = Icon.UNTAMED_RUSTY_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.SNOWY)) {
                    icon = Icon.UNTAMED_SNOWY_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.SPOTTED)) {
                    icon = Icon.UNTAMED_SPOTTED_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.STRIPED)) {
                    icon = Icon.UNTAMED_STRIPED_WOLF;
                } else if (wolf.getVariant().equals(Wolf.Variant.WOODS)) {
                    icon = Icon.UNTAMED_WOODS_WOLF;
                } else {
                    icon = Icon.UNTAMED_WOLF;
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
