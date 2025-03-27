package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.DonkeyMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.LlamaMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals.abstracthorse.chestedhorse.MuleMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestedHorse;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Mule;

public class ChestedHorseMarkerBuilder extends MobEntityMarkerBuilder<ChestedHorse> {
    public ChestedHorseMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Donkey.class, new DonkeyMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Llama.class, new LlamaMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Mule.class, new MuleMarkerBuilder(config, defaultConfig));
    }
}
