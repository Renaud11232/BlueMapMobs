package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.slime.MagmaCubeMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Slime;

public class SlimeMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Slime> {
    public SlimeMarkerBuilder(FileConfiguration config) {
        super(config, Icon.SLIME);
        registerMarkerBuilder(MagmaCube.class, new MagmaCubeMarkerBuilder(config));
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.slime", true);
    }
}
