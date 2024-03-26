package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.flying.GhastMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.flying.PhantomMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Flying;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Phantom;

public class FlyingMarkerBuilder extends MobEntityMarkerBuilder<Flying> {
    public FlyingMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Ghast.class, new GhastMarkerBuilder(config));
        registerMarkerBuilder(Phantom.class, new PhantomMarkerBuilder(config));
    }
}
