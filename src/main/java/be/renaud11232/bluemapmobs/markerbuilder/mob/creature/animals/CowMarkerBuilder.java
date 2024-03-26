package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.cow.MushroomCowMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.Cow;
import org.bukkit.entity.MushroomCow;

import java.util.Optional;

public class CowMarkerBuilder extends MobEntityMarkerBuilder<Cow> {
    public CowMarkerBuilder() {
        registerMarkerBuilder(MushroomCow.class, new MushroomCowMarkerBuilder());
    }

    @Override
    public Optional<POIMarker> buildDefault(Cow mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
