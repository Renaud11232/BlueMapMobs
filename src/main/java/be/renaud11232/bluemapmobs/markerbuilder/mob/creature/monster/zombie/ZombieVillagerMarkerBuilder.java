package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
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
    public Optional<POIMarker> buildDefault(ZombieVillager zombieVillager) {
        return super.buildDefault(zombieVillager).map(marker -> {
            Icon icon = switch (zombieVillager.getVillagerType()) {
                case SNOW -> Icon.SNOWY_ZOMBIE_VILLAGER;
                case SWAMP -> Icon.SWAMP_ZOMBIE_VILLAGER;
                case TAIGA -> Icon.TAIGA_ZOMBIE_VILLAGER;
                case DESERT -> Icon.DESERT_ZOMBIE_VILLAGER;
                case JUNGLE -> Icon.JUNGLE_ZOMBIE_VILLAGER;
                case PLAINS -> Icon.PLAINS_ZOMBIE_VILLAGER;
                case SAVANNA -> Icon.SAVANNA_ZOMBIE_VILLAGER;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.zombie_villager", true);
    }
}
