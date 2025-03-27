package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;

public class CowMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.COW, Cow::getVariant);
        registerIcon(Cow.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_COW);
        registerIcon(Cow.Variant.COLD, BlueMapMobsIcon.Mob.COLD_COW);
        registerIcon(Cow.Variant.WARM, BlueMapMobsIcon.Mob.WARM_COW);
    }
}
