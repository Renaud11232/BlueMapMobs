package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illusioner;

import java.util.Optional;

public class IllusionerMarkerBuilder extends MobEntityMarkerBuilder<Illusioner> {

    public IllusionerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Illusioner mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
