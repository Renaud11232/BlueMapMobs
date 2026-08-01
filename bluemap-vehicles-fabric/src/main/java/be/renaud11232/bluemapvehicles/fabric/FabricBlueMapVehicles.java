package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.fabric.FabricBlueMapEntitiesMod;
import be.renaud11232.bluemapentities.module.Module;
import be.renaud11232.bluemapvehicles.entity.Vehicle;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.VehicleEntity;

public class FabricBlueMapVehicles extends FabricBlueMapEntitiesMod<VehicleEntity, Vehicle> {
    @Override
    public Module<ServerLevel, VehicleEntity, Vehicle> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricVehiclesModule(api, configuration);
    }
}
