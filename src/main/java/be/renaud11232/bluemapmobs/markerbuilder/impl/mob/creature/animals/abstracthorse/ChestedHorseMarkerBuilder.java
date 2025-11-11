package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.DonkeyMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.LlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals.abstracthorse.chestedhorse.MuleMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestedHorse;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Mule;

public class ChestedHorseMarkerBuilder extends AbstractMobMarkerBuilder<ChestedHorse> {
    public ChestedHorseMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<ChestedHorse> registry) {
        registry.register(Donkey.class, new DonkeyMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Llama.class, new LlamaMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Mule.class, new MuleMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
