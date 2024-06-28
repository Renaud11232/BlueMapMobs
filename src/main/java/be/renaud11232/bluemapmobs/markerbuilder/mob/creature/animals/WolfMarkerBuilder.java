package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class WolfMarkerBuilder extends MobEntityMarkerBuilder<Wolf> {

    private final Map<Wolf.Variant, Icon> angryWolfIcons;
    private final Map<Wolf.Variant, Icon> tamedWolfIcons;
    private final Map<Wolf.Variant, Icon> untamedWolfIcons;

    public WolfMarkerBuilder(FileConfiguration config) {
        super(config);
        angryWolfIcons = new HashMap<>();
        angryWolfIcons.put(Wolf.Variant.ASHEN, Icon.ANGRY_ASHEN_WOLF);
        angryWolfIcons.put(Wolf.Variant.BLACK, Icon.ANGRY_BLACK_WOLF);
        angryWolfIcons.put(Wolf.Variant.CHESTNUT, Icon.ANGRY_CHESTNUT_WOLF);
        angryWolfIcons.put(Wolf.Variant.PALE, Icon.ANGRY_PALE_WOLF);
        angryWolfIcons.put(Wolf.Variant.RUSTY, Icon.ANGRY_RUSTY_WOLF);
        angryWolfIcons.put(Wolf.Variant.SNOWY, Icon.ANGRY_SNOWY_WOLF);
        angryWolfIcons.put(Wolf.Variant.SPOTTED, Icon.ANGRY_SPOTTED_WOLF);
        angryWolfIcons.put(Wolf.Variant.STRIPED, Icon.ANGRY_STRIPED_WOLF);
        angryWolfIcons.put(Wolf.Variant.WOODS, Icon.ANGRY_WOODS_WOLF);
        tamedWolfIcons = new HashMap<>();
        tamedWolfIcons.put(Wolf.Variant.ASHEN, Icon.TAMED_ASHEN_WOLF);
        tamedWolfIcons.put(Wolf.Variant.BLACK, Icon.TAMED_BLACK_WOLF);
        tamedWolfIcons.put(Wolf.Variant.CHESTNUT, Icon.TAMED_CHESTNUT_WOLF);
        tamedWolfIcons.put(Wolf.Variant.PALE, Icon.TAMED_PALE_WOLF);
        tamedWolfIcons.put(Wolf.Variant.RUSTY, Icon.TAMED_RUSTY_WOLF);
        tamedWolfIcons.put(Wolf.Variant.SNOWY, Icon.TAMED_SNOWY_WOLF);
        tamedWolfIcons.put(Wolf.Variant.SPOTTED, Icon.TAMED_SPOTTED_WOLF);
        tamedWolfIcons.put(Wolf.Variant.STRIPED, Icon.TAMED_STRIPED_WOLF);
        tamedWolfIcons.put(Wolf.Variant.WOODS, Icon.TAMED_WOODS_WOLF);
        untamedWolfIcons = new HashMap<>();
        untamedWolfIcons.put(Wolf.Variant.ASHEN, Icon.UNTAMED_ASHEN_WOLF);
        untamedWolfIcons.put(Wolf.Variant.BLACK, Icon.UNTAMED_BLACK_WOLF);
        untamedWolfIcons.put(Wolf.Variant.CHESTNUT, Icon.UNTAMED_CHESTNUT_WOLF);
        untamedWolfIcons.put(Wolf.Variant.PALE, Icon.UNTAMED_PALE_WOLF);
        untamedWolfIcons.put(Wolf.Variant.RUSTY, Icon.UNTAMED_RUSTY_WOLF);
        untamedWolfIcons.put(Wolf.Variant.SNOWY, Icon.UNTAMED_SNOWY_WOLF);
        untamedWolfIcons.put(Wolf.Variant.SPOTTED, Icon.UNTAMED_SPOTTED_WOLF);
        untamedWolfIcons.put(Wolf.Variant.STRIPED, Icon.UNTAMED_STRIPED_WOLF);
        untamedWolfIcons.put(Wolf.Variant.WOODS, Icon.UNTAMED_WOODS_WOLF);
    }

    @Override
    public Optional<POIMarker> buildDefault(Wolf wolf) {
        return super.buildDefault(wolf).map(marker -> {
            Icon icon;
            if(wolf.isAngry()) {
                icon = angryWolfIcons.get(wolf.getVariant());
            } else if (wolf.isTamed()) {
                icon = tamedWolfIcons.get(wolf.getVariant());
            } else {
                icon = untamedWolfIcons.get(wolf.getVariant());
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
