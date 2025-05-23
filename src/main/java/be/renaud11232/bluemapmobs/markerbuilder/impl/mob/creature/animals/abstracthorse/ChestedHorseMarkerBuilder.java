package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.DonkeyMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.LlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.MuleMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestedHorse;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Mule;

public class ChestedHorseMarkerBuilder extends AbstractMobMarkerBuilder<ChestedHorse> {
    public ChestedHorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<ChestedHorse> registry) {
        registry.register(Donkey.class, new DonkeyMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Llama.class, new LlamaMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Mule.class, new MuleMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
