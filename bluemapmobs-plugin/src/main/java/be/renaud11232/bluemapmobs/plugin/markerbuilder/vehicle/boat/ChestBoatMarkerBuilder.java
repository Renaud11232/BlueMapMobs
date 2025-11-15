package be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVehicleMarkerBuilder;
import be.renaud11232.bluemapmobs.plugin.markerbuilder.vehicle.boat.chestboat.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class ChestBoatMarkerBuilder extends AbstractVehicleMarkerBuilder<ChestBoat> {
    public ChestBoatMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.CHEST_BOAT;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<ChestBoat> registry) {
        registry.register(AcaciaChestBoat.class, new AcaciaChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(BambooChestRaft.class, new BambooChestRaftMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(BirchChestBoat.class, new BirchChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(CherryChestBoat.class, new CherryChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(DarkOakChestBoat.class, new DarkOakChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(JungleChestBoat.class, new JungleChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(MangroveChestBoat.class, new MangroveChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(OakChestBoat.class, new OakChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(PaleOakChestBoat.class, new PaleOakChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
        registry.register(SpruceChestBoat.class, new SpruceChestBoatMarkerBuilder(getAPI(), getConfig(), getDefaultConfig()));
    }
}
