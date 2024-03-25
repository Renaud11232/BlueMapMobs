package be.renaud11232.bluemapmobs.markerbuilder.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.ambient.BatMarkerBuilder;
import org.bukkit.entity.Ambient;
import org.bukkit.entity.Bat;

public class AmbientMarkerBuilder extends MobEntityMarkerBuilder<Ambient> {
    public AmbientMarkerBuilder() {
        registerMarkerBuilder(Bat.class, new BatMarkerBuilder());
    }
}
