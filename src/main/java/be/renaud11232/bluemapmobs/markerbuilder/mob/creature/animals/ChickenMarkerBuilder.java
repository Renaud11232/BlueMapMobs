package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Chicken;

public class ChickenMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Chicken, Chicken.Variant> {
    public ChickenMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CHICKEN, Chicken::getVariant);
        registerIcon(Chicken.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_CHICKEN);
        registerIcon(Chicken.Variant.COLD, BlueMapMobsIcon.Mob.COLD_CHICKEN);
        registerIcon(Chicken.Variant.WARM, BlueMapMobsIcon.Mob.WARM_CHICKEN);
    }
}
