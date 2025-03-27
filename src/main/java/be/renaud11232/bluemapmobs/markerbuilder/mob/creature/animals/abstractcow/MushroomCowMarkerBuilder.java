package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends MappedIconMobEntityMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.MUSHROOM_COW, MushroomCow::getVariant);
        registerIcon(MushroomCow.Variant.RED, MobIcon.RED_MOOSHROOM);
        registerIcon(MushroomCow.Variant.BROWN, MobIcon.BROWN_MOOSHROOM);
    }
}
