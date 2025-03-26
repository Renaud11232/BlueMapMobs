package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Panda;

public class PandaMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.panda", PandaMarkerBuilder::getCombinedGene);
        registerIcon(Panda.Gene.NORMAL, Icon.NORMAL_PANDA);
        registerIcon(Panda.Gene.LAZY, Icon.LAZY_PANDA);
        registerIcon(Panda.Gene.WORRIED, Icon.WORRIED_PANDA);
        registerIcon(Panda.Gene.PLAYFUL, Icon.PLAYFUL_PANDA);
        registerIcon(Panda.Gene.AGGRESSIVE, Icon.AGGRESSIVE_PANDA);
        registerIcon(Panda.Gene.WEAK, Icon.WEAK_PANDA);
        registerIcon(Panda.Gene.BROWN, Icon.BROWN_PANDA);
    }

    private static Panda.Gene getCombinedGene(Panda panda) {
        Panda.Gene main = panda.getMainGene();
        if (main.isRecessive()) {
            if (main.equals(panda.getHiddenGene())) {
                return main;
            }
            return Panda.Gene.NORMAL;
        }
        return panda.getMainGene();
    }
}
