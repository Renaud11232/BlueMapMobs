package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Frog;

public class FrogMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Frog, Frog.Variant> {
    public FrogMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.FROG, Frog::getVariant);
        registerIcon(Frog.Variant.COLD, BlueMapMobsIcon.Mob.COLD_FROG);
        registerIcon(Frog.Variant.WARM, BlueMapMobsIcon.Mob.TROPICAL_FROG);
        registerIcon(Frog.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_FROG);
    }
}
