package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;

import java.util.Optional;

public class EvokerMarkerBuilder extends MobEntityMarkerBuilder<Evoker> {

    public EvokerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Evoker mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
