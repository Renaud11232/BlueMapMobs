package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Donkey;

public class DonkeyMarkerBuilder extends MobEntityMarkerBuilder<Donkey> {
    public DonkeyMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.DONKEY, MobIcon.DONKEY);
    }
}
