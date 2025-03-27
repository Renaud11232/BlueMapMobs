package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pig;

public class PigMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PIG, Pig::getVariant);
        registerIcon(Pig.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_PIG);
        registerIcon(Pig.Variant.COLD, BlueMapMobsIcon.Mob.COLD_PIG);
        registerIcon(Pig.Variant.WARM, BlueMapMobsIcon.Mob.WARM_PIG);
    }
}
