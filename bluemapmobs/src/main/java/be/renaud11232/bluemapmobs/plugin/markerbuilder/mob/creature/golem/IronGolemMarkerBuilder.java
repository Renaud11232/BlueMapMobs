package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.golem;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.IronGolem;

public class IronGolemMarkerBuilder extends AbstractMobMarkerBuilder<IronGolem> {
    public IronGolemMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.IRON_GOLEM;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.IRON_GOLEM;
    }
}
