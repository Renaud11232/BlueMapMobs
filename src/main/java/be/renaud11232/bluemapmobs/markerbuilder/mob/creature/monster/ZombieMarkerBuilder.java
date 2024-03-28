package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.DrownedMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.HuskMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.PigZombieMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie.ZombieVillagerMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.*;

import java.util.Optional;

public class ZombieMarkerBuilder extends MobEntityMarkerBuilder<Zombie> {
    public ZombieMarkerBuilder(FileConfiguration config) {
        super(config);
        registerMarkerBuilder(Drowned.class, new DrownedMarkerBuilder(config));
        registerMarkerBuilder(Husk.class, new HuskMarkerBuilder(config));
        registerMarkerBuilder(PigZombie.class, new PigZombieMarkerBuilder(config));
        registerMarkerBuilder(ZombieVillager.class, new ZombieVillagerMarkerBuilder(config));
    }

    @Override
    public Optional<POIMarker> buildDefault(Zombie mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.ZOMBIE.getPath(), Icon.ZOMBIE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.zombie", true);
    }
}
