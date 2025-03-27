package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Dolphin;

public class DolphinMarkerBuilder extends MobEntityMarkerBuilder<Dolphin> {
    public DolphinMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.DOLPHIN, MobIcon.DOLPHIN);
    }
}
