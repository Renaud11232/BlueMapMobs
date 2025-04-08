package be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.markerbuilder.VehicleEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.vehicle.boat.chestboat.*;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.ChestBoat;
import org.bukkit.entity.boat.*;

public class ChestBoatMarkerBuilder extends VehicleEntityMarkerBuilder<ChestBoat> {
    public ChestBoatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Vehicles.Markers.Types.CHEST_BOAT;
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<ChestBoat> registry) {
        registry.register(AcaciaChestBoat.class, new AcaciaChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(BambooChestRaft.class, new BambooChestRaftMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(BirchChestBoat.class, new BirchChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(CherryChestBoat.class, new CherryChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(DarkOakChestBoat.class, new DarkOakChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(JungleChestBoat.class, new JungleChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(MangroveChestBoat.class, new MangroveChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(OakChestBoat.class, new OakChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(PaleOakChestBoat.class, new PaleOakChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(SpruceChestBoat.class, new SpruceChestBoatMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
