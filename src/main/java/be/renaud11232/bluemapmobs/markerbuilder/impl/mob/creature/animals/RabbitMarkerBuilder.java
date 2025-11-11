package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Rabbit;

public class RabbitMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Rabbit, Rabbit.Type> {
    public RabbitMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.RABBIT;
    }

    @Override
    public Rabbit.Type getVariant(Rabbit rabbit) {
        return rabbit.getRabbitType();
    }

    @Override
    public void registerVariantIcons(Registry<Rabbit.Type, Icon> registry) {
        registry.register(Rabbit.Type.GOLD, BlueMapMobsIcon.Mob.GOLD_RABBIT);
        registry.register(Rabbit.Type.WHITE, BlueMapMobsIcon.Mob.WHITE_RABBIT);
        registry.register(Rabbit.Type.BLACK_AND_WHITE, BlueMapMobsIcon.Mob.WHITE_SPLOTCHED_RABBIT);
        registry.register(Rabbit.Type.BLACK, BlueMapMobsIcon.Mob.BLACK_RABBIT);
        registry.register(Rabbit.Type.BROWN, BlueMapMobsIcon.Mob.BROWN_RABBIT);
        registry.register(Rabbit.Type.SALT_AND_PEPPER, BlueMapMobsIcon.Mob.SALT_RABBIT);
        registry.register(Rabbit.Type.THE_KILLER_BUNNY, BlueMapMobsIcon.Mob.CAERBANNOG_RABBIT);
    }

    @Override
    public Icon getIcon(Rabbit rabbit) {
        if (rabbit.getName().equals("Toast")) {
            return BlueMapMobsIcon.Mob.TOAST_RABBIT;
        }
        return super.getIcon(rabbit);
    }
}
