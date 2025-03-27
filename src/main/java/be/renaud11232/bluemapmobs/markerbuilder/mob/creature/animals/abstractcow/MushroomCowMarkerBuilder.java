package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MushroomCow;

public class MushroomCowMarkerBuilder extends MappedIconMobEntityMarkerBuilder<MushroomCow, MushroomCow.Variant> {
    public MushroomCowMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.MUSHROOM_COW, MushroomCow::getVariant);
        registerIcon(MushroomCow.Variant.RED, BlueMapMobsIcon.Mob.RED_MOOSHROOM);
        registerIcon(MushroomCow.Variant.BROWN, BlueMapMobsIcon.Mob.BROWN_MOOSHROOM);
    }
}
