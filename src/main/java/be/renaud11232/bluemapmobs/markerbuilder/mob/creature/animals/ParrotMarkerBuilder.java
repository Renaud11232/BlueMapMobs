package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Parrot;

public class ParrotMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.parrot", Parrot::getVariant);
        registerIcon(Parrot.Variant.RED, Icon.RED_PARROT);
        registerIcon(Parrot.Variant.BLUE, Icon.BLUE_PARROT);
        registerIcon(Parrot.Variant.GREEN, Icon.GREEN_PARROT);
        registerIcon(Parrot.Variant.CYAN, Icon.CYAN_PARROT);
        registerIcon(Parrot.Variant.GRAY, Icon.GRAY_PARROT);
    }
}
