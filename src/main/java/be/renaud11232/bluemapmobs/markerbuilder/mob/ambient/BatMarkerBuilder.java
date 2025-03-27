package be.renaud11232.bluemapmobs.markerbuilder.mob.ambient;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bat;

public class BatMarkerBuilder extends MobEntityMarkerBuilder<Bat> {
    public BatMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.BAT, MobIcon.BAT);
    }
}
