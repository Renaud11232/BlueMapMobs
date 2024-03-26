package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ZombieVillager;

import java.util.Optional;

public class ZombieVillagerMarkerBuilder extends MobEntityMarkerBuilder<ZombieVillager> {

    public ZombieVillagerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(ZombieVillager mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
