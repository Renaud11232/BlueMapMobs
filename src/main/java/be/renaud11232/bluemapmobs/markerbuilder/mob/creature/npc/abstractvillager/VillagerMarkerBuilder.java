package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Villager;

import java.util.Optional;

public class VillagerMarkerBuilder extends MobEntityMarkerBuilder<Villager> {
    @Override
    public Optional<POIMarker> buildDefault(Villager mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
