package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pig;

public class PigMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Pig, Pig.Variant> {
    public PigMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PIG;
    }

    @Override
    public Pig.Variant getVariant(Pig pig) {
        return pig.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<Pig.Variant, Icon> registry) {
        registry.register(Pig.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_PIG);
        registry.register(Pig.Variant.COLD, BlueMapMobsIcon.Mob.COLD_PIG);
        registry.register(Pig.Variant.WARM, BlueMapMobsIcon.Mob.WARM_PIG);
    }
}
