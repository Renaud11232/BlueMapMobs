package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Fox;

public class FoxMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Fox, Fox.Type> {
    public FoxMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.FOX;
    }

    @Override
    public Fox.Type getVariant(Fox fox) {
        return fox.getFoxType();
    }

    @Override
    public void registerVariantIcons(Registry<Fox.Type, Icon> registry) {
        registry.register(Fox.Type.RED, BlueMapMobsIcon.Mob.RED_FOX);
        registry.register(Fox.Type.SNOW, BlueMapMobsIcon.Mob.SNOW_FOX);
    }
}
