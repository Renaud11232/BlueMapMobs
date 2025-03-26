package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends MappedIconMobEntityMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.mushroom_cow", MushroomCow::getVariant);
        registerIcon(MushroomCow.Variant.RED, Icon.RED_MOOSHROOM);
        registerIcon(MushroomCow.Variant.BROWN, Icon.BROWN_MOOSHROOM);
    }
}
