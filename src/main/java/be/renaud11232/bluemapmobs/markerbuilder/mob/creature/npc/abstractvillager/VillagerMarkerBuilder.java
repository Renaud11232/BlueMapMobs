package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

import java.util.Optional;

public class VillagerMarkerBuilder extends MobEntityMarkerBuilder<Villager> {

    public VillagerMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Villager villager) {
        return super.buildDefault(villager).map(marker -> {
            Icon icon = switch (villager.getVillagerType()) {
                case SNOW -> Icon.SNOWY_VILLAGER;
                case SWAMP -> Icon.SWAMP_VILLAGER;
                case TAIGA -> Icon.TAIGA_VILLAGER;
                case DESERT -> Icon.DESERT_VILLAGER;
                case JUNGLE -> Icon.JUNGLE_VILLAGER;
                case PLAINS -> Icon.PLAINS_VILLAGER;
                case SAVANNA -> Icon.SAVANNA_VILLAGER;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.villager", true);
    }
}
