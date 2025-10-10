package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Parrot;

public class ParrotMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Parrot, Parrot.Variant> {
    public ParrotMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PARROT;
    }

    @Override
    public Parrot.Variant getVariant(Parrot parrot) {
        return parrot.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<Parrot.Variant, Icon> registry) {
        registry.register(Parrot.Variant.RED, BlueMapMobsIcon.Mob.RED_PARROT);
        registry.register(Parrot.Variant.BLUE, BlueMapMobsIcon.Mob.BLUE_PARROT);
        registry.register(Parrot.Variant.GREEN, BlueMapMobsIcon.Mob.GREEN_PARROT);
        registry.register(Parrot.Variant.CYAN, BlueMapMobsIcon.Mob.CYAN_PARROT);
        registry.register(Parrot.Variant.GRAY, BlueMapMobsIcon.Mob.GRAY_PARROT);
    }
}
