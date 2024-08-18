package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VillagerMarkerBuilder extends MobEntityMarkerBuilder<Villager> {

    private final Map<Villager.Type, Icon> icons = new HashMap<>();

    public VillagerMarkerBuilder(FileConfiguration config) {
        super(config);
        icons.put(Villager.Type.SNOW, Icon.SNOWY_VILLAGER);
        icons.put(Villager.Type.SWAMP, Icon.SWAMP_VILLAGER);
        icons.put(Villager.Type.TAIGA, Icon.TAIGA_VILLAGER);
        icons.put(Villager.Type.DESERT, Icon.DESERT_VILLAGER);
        icons.put(Villager.Type.JUNGLE, Icon.JUNGLE_VILLAGER);
        icons.put(Villager.Type.PLAINS, Icon.PLAINS_VILLAGER);
        icons.put(Villager.Type.SAVANNA, Icon.SAVANNA_VILLAGER);
    }

    @Override
    public Optional<POIMarker> buildDefault(Villager villager) {
        return super.buildDefault(villager).map(marker -> {
            Icon icon = icons.getOrDefault(villager.getVillagerType(), Icon.UNKNOWN);
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.villager", true);
    }
}
