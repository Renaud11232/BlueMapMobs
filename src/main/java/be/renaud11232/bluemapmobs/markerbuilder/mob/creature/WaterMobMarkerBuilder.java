package be.renaud11232.bluemapmobs.markerbuilder.mob.creature;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.DolphinMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.FishMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.watermob.SquidMarkerBuilder;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Squid;
import org.bukkit.entity.WaterMob;

public class WaterMobMarkerBuilder extends MobEntityMarkerBuilder<WaterMob> {
    public WaterMobMarkerBuilder() {
        registerMarkerBuilder(Dolphin.class, new DolphinMarkerBuilder());
        registerMarkerBuilder(Fish.class, new FishMarkerBuilder());
        registerMarkerBuilder(Squid.class, new SquidMarkerBuilder());
    }
}
