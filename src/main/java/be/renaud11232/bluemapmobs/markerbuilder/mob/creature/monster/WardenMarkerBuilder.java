package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Warden;

public class WardenMarkerBuilder extends MobEntityMarkerBuilder<Warden> {
    public WardenMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.WARDEN, MobIcon.WARDEN);
    }
}
