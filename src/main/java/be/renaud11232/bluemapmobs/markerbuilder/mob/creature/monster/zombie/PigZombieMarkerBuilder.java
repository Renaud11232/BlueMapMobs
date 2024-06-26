package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.PigZombie;

import java.util.Optional;

public class PigZombieMarkerBuilder extends MobEntityMarkerBuilder<PigZombie> {

    public PigZombieMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(PigZombie mob) {
        return super.buildDefault(mob).map(marker -> {
            marker.setIcon(Icon.PIG_ZOMBIE.getPath(), Icon.PIG_ZOMBIE.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.pig_zombie", true);
    }
}
