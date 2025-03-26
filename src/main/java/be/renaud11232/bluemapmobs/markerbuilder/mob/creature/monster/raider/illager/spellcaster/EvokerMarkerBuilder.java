package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;

public class EvokerMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Evoker> {
    public EvokerMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.evoker", Icon.EVOKER);
    }
}
