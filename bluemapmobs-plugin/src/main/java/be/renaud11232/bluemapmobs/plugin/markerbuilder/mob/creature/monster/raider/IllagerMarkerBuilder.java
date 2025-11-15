package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.raider;

import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.raider.illager.PillagerMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.raider.illager.SpellcasterMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.monster.raider.illager.VindicatorMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illager;
import org.bukkit.entity.Pillager;
import org.bukkit.entity.Spellcaster;
import org.bukkit.entity.Vindicator;

public class IllagerMarkerBuilder extends AbstractMobMarkerBuilder<Illager> {
    public IllagerMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Illager> registry) {
        registry.register(Pillager.class, new PillagerMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Spellcaster.class, new SpellcasterMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(Vindicator.class, new VindicatorMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
