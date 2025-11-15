package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractcow;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cow;

public class CowMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Cow, Cow.Variant> {
    public CowMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.COW;
    }

    @Override
    public Cow.Variant getVariant(Cow cow) {
        return cow.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<Cow.Variant, Icon> registry) {
        registry.register(Cow.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_COW);
        registry.register(Cow.Variant.COLD, BlueMapMobsIcon.Mob.COLD_COW);
        registry.register(Cow.Variant.WARM, BlueMapMobsIcon.Mob.WARM_COW);
    }
}
