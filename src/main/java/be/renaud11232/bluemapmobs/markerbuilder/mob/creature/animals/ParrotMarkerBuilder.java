package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Parrot;

public class ParrotMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PARROT, Parrot::getVariant);
        registerIcon(Parrot.Variant.RED, BlueMapMobsIcon.Mob.RED_PARROT);
        registerIcon(Parrot.Variant.BLUE, BlueMapMobsIcon.Mob.BLUE_PARROT);
        registerIcon(Parrot.Variant.GREEN, BlueMapMobsIcon.Mob.GREEN_PARROT);
        registerIcon(Parrot.Variant.CYAN, BlueMapMobsIcon.Mob.CYAN_PARROT);
        registerIcon(Parrot.Variant.GRAY, BlueMapMobsIcon.Mob.GRAY_PARROT);
    }
}
