package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Panda;

public class PandaMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PANDA, PandaMarkerBuilder::getCombinedGene);
        registerIcon(Panda.Gene.NORMAL, BlueMapMobsIcon.Mob.NORMAL_PANDA);
        registerIcon(Panda.Gene.LAZY, BlueMapMobsIcon.Mob.LAZY_PANDA);
        registerIcon(Panda.Gene.WORRIED, BlueMapMobsIcon.Mob.WORRIED_PANDA);
        registerIcon(Panda.Gene.PLAYFUL, BlueMapMobsIcon.Mob.PLAYFUL_PANDA);
        registerIcon(Panda.Gene.AGGRESSIVE, BlueMapMobsIcon.Mob.AGGRESSIVE_PANDA);
        registerIcon(Panda.Gene.WEAK, BlueMapMobsIcon.Mob.WEAK_PANDA);
        registerIcon(Panda.Gene.BROWN, BlueMapMobsIcon.Mob.BROWN_PANDA);
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
