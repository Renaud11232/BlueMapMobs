package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.DrownedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.HuskMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.PigZombieMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.ZombieVillagerMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.*;

import java.util.Optional;

public class ZombieMarkerBuilder extends MobEntityMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder() {
        registerMarkerBuilder(Drowned.class, new DrownedMarkerBuilder());
        registerMarkerBuilder(Husk.class, new HuskMarkerBuilder());
        registerMarkerBuilder(PigZombie.class, new PigZombieMarkerBuilder());
        registerMarkerBuilder(ZombieVillager.class, new ZombieVillagerMarkerBuilder());
    }

    @Override
    public Optional<POIMarker> buildDefault(Zombie mob) {
        //TODO
        return super.buildDefault(mob);
    }
}
