package be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle.minecart;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.minecart.ExplosiveMinecart;

public class ExplosiveMinecartMarkerBuilder extends AbstractVehicleMarkerBuilder<ExplosiveMinecart> {
    public ExplosiveMinecartMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Vehicle.TNT_MINECART;
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.EXPLOSIVE_MINECART;
    }
}
