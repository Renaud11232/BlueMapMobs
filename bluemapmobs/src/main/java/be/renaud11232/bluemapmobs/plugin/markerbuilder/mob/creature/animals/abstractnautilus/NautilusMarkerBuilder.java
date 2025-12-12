package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.animals.abstractnautilus;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Nautilus;

public class NautilusMarkerBuilder extends AbstractMobMarkerBuilder<Nautilus> {
    public NautilusMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.NAUTILUS;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.NAUTILUS;
    }
}
