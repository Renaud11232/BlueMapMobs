package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Panda;

public class PandaMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Panda, Panda.Gene> {
    public PandaMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PANDA;
    }

    @Override
    public Panda.Gene getVariant(Panda panda) {
        Panda.Gene main = panda.getMainGene();
        if (main.isRecessive()) {
            if (main.equals(panda.getHiddenGene())) {
                return main;
            }
            return Panda.Gene.NORMAL;
        }
        return panda.getMainGene();
    }

    @Override
    public void registerVariantIcons(Registry<Panda.Gene, Icon> registry) {
        registry.register(Panda.Gene.NORMAL, BlueMapMobsIcon.Mob.NORMAL_PANDA);
        registry.register(Panda.Gene.LAZY, BlueMapMobsIcon.Mob.LAZY_PANDA);
        registry.register(Panda.Gene.WORRIED, BlueMapMobsIcon.Mob.WORRIED_PANDA);
        registry.register(Panda.Gene.PLAYFUL, BlueMapMobsIcon.Mob.PLAYFUL_PANDA);
        registry.register(Panda.Gene.AGGRESSIVE, BlueMapMobsIcon.Mob.AGGRESSIVE_PANDA);
        registry.register(Panda.Gene.WEAK, BlueMapMobsIcon.Mob.WEAK_PANDA);
        registry.register(Panda.Gene.BROWN, BlueMapMobsIcon.Mob.BROWN_PANDA);
    }
}
