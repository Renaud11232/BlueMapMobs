package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Panda;

import java.util.Optional;

public class PandaMarkerBuilder extends MobEntityMarkerBuilder<Panda> {

    public PandaMarkerBuilder(FileConfiguration config) {
        super(config);
    }

    @Override
    public Optional<POIMarker> buildDefault(Panda panda) {
        return super.buildDefault(panda).map(marker -> {
            Icon icon =  switch (getCombinedGene(panda)) {
                case NORMAL -> Icon.NORMAL_PANDA;
                case LAZY -> Icon.LAZY_PANDA;
                case WORRIED -> Icon.WORRIED_PANDA;
                case PLAYFUL -> Icon.PLAYFUL_PANDA;
                case AGGRESSIVE -> Icon.AGGRESSIVE_PANDA;
                case WEAK -> Icon.WEAK_PANDA;
                case BROWN -> Icon.BROWN_PANDA;
            };
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }

    public Panda.Gene getCombinedGene(Panda panda) {
        Panda.Gene main = panda.getMainGene();
        if (main.isRecessive()) {
            if (panda.getHiddenGene() == main) {
                return main;
            }
            return Panda.Gene.NORMAL;
        }
        return panda.getMainGene();
    }

    @Override
    protected boolean isDisplayed() {
        return getConfig().getBoolean("marker_sets.mobs.markers.types.panda", true);
    }
}
