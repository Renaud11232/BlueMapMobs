package be.renaud11232.bluemapvehiclemarkers.fabric;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.fabric.FabricBlueMapEntityMarkersMod;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.VehicleEntity;

public class FabricBlueMapVehicleMarkersMod extends FabricBlueMapEntityMarkersMod<VehicleEntity> {
    @Override
    public Module<ServerLevel, VehicleEntity> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricVehiclesModule(api, configuration);
    }
}
