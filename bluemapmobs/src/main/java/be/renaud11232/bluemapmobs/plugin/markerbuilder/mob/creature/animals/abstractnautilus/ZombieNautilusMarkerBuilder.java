package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractnautilus;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ZombieNautilus;

public class ZombieNautilusMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<ZombieNautilus, ZombieNautilus.Variant> {
    public ZombieNautilusMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE_NAUTILUS;
    }

    @Override
    public ZombieNautilus.Variant getVariant(ZombieNautilus zombieNautilus) {
        return zombieNautilus.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<ZombieNautilus.Variant, Icon> registry) {
        registry.register(ZombieNautilus.Variant.TEMPERATE, BlueMapMobsIcon.Mob.TEMPERATE_ZOMBIE_NAUTILUS);
        registry.register(ZombieNautilus.Variant.WARM, BlueMapMobsIcon.Mob.WARM_ZOMBIE_NAUTILUS);
    }
}
