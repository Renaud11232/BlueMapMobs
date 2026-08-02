package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.fabric.FabricBlueMapEntitiesMod;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.VehicleEntity;

public class FabricBlueMapVehicles extends FabricBlueMapEntitiesMod<VehicleEntity> {
    @Override
    public Module<ServerLevel, VehicleEntity> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricVehiclesModule(api, configuration);
    }
}
