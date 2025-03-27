package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Panda;

public class PandaMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.PANDA, PandaMarkerBuilder::getCombinedGene);
        registerIcon(Panda.Gene.NORMAL, MobIcon.NORMAL_PANDA);
        registerIcon(Panda.Gene.LAZY, MobIcon.LAZY_PANDA);
        registerIcon(Panda.Gene.WORRIED, MobIcon.WORRIED_PANDA);
        registerIcon(Panda.Gene.PLAYFUL, MobIcon.PLAYFUL_PANDA);
        registerIcon(Panda.Gene.AGGRESSIVE, MobIcon.AGGRESSIVE_PANDA);
        registerIcon(Panda.Gene.WEAK, MobIcon.WEAK_PANDA);
        registerIcon(Panda.Gene.BROWN, MobIcon.BROWN_PANDA);
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
