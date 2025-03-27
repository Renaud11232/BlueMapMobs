package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Parrot;

public class ParrotMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.PARROT, Parrot::getVariant);
        registerIcon(Parrot.Variant.RED, MobIcon.RED_PARROT);
        registerIcon(Parrot.Variant.BLUE, MobIcon.BLUE_PARROT);
        registerIcon(Parrot.Variant.GREEN, MobIcon.GREEN_PARROT);
        registerIcon(Parrot.Variant.CYAN, MobIcon.CYAN_PARROT);
        registerIcon(Parrot.Variant.GRAY, MobIcon.GRAY_PARROT);
    }
}
