package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.entity.ZombieVillager;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ZombieVillagerMarkerBuilder extends MobEntityMarkerBuilder<ZombieVillager> {

    private final Map<Villager.Type, Icon> icons = new HashMap<>();

    public ZombieVillagerMarkerBuilder(FileConfiguration config) {
        super(config);
        icons.put(Villager.Type.SNOW, Icon.SNOWY_ZOMBIE_VILLAGER);
        icons.put(Villager.Type.SWAMP, Icon.SWAMP_ZOMBIE_VILLAGER);
        icons.put(Villager.Type.TAIGA, Icon.TAIGA_ZOMBIE_VILLAGER);
        icons.put(Villager.Type.DESERT, Icon.DESERT_ZOMBIE_VILLAGER);
        icons.put(Villager.Type.JUNGLE, Icon.JUNGLE_ZOMBIE_VILLAGER);
        icons.put(Villager.Type.PLAINS, Icon.PLAINS_ZOMBIE_VILLAGER);
        icons.put(Villager.Type.SAVANNA, Icon.SAVANNA_ZOMBIE_VILLAGER);
    }

    @Override
    public Optional<POIMarker> buildDefault(ZombieVillager zombieVillager) {
        return super.buildDefault(zombieVillager).map(marker -> {
            Icon icon = icons.getOrDefault(zombieVillager.getVillagerType(), Icon.UNKNOWN);
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.zombie_villager", true);
    }
}
