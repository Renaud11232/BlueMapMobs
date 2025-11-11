package be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.vehicle.boat.*;
import be.renaud11232.bluemapmobs.registry.impl.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Boat;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class BoatMarkerBuilder extends AbstractVehicleMarkerBuilder<Boat> {

    public BoatMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.BOAT;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Boat> registry) {
        registry.register(ChestBoat.class, new ChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(AcaciaBoat.class, new AcaciaBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(BambooRaft.class, new BambooRaftMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(BirchBoat.class, new BirchBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(CherryBoat.class, new CherryBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(DarkOakBoat.class, new DarkOakBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(JungleBoat.class, new JungleBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(MangroveBoat.class, new MangroveBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(OakBoat.class, new OakBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PaleOakBoat.class, new PaleOakBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(SpruceBoat.class, new SpruceBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
