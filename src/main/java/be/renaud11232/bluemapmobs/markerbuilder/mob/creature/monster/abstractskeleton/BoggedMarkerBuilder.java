package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bogged;

import java.util.Optional;

public class BoggedMarkerBuilder extends MobEntityMarkerBuilder<Bogged> {

    public BoggedMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Bogged bogged) {
        return super.buildDefault(bogged).map(marker -> {
            marker.setIcon(Icon.BOGGED.getPath(), Icon.BOGGED.getAnchor());
            return marker;
        });
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.bogged", true);
    }
}
