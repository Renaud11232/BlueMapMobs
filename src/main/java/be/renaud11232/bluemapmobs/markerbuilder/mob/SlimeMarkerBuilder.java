package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.slime.MagmaCubeMarkerBuilder;
import be.renaud11232.bluemapmobs.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Slime;

public class SlimeMarkerBuilder extends MobEntityMarkerBuilder<Slime> {
    public SlimeMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.SLIME, MobIcon.SLIME);
        registerMarkerBuilder(MagmaCube.class, new MagmaCubeMarkerBuilder(config));
    }
}
