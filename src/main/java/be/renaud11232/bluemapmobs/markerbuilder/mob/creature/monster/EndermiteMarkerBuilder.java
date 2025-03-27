package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Endermite;

public class EndermiteMarkerBuilder extends MobEntityMarkerBuilder<Endermite> {
    public EndermiteMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ENDERMITE, MobIcon.ENDERMITE);
    }
}
