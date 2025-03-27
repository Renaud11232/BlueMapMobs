package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.IllagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.RavagerMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.WitchMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Raider;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Witch;

public class RaiderMarkerBuilder extends MobEntityMarkerBuilder<Raider> {
    public RaiderMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        registerMarkerBuilder(Illager.class, new IllagerMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Ravager.class, new RavagerMarkerBuilder(config, defaultConfig));
        registerMarkerBuilder(Witch.class, new WitchMarkerBuilder(config, defaultConfig));
    }
}
