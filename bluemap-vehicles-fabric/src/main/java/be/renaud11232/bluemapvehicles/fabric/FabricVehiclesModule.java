package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.fabric.module.FabricModule;
import be.renaud11232.bluemapvehicles.VehiclesModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.level.entity.EntityTypeTest;

import java.util.Collection;

public class FabricVehiclesModule extends VehiclesModule<ServerLevel, VehicleEntity> implements FabricModule<VehicleEntity> {
    protected FabricVehiclesModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new FabricVehiclesConverter());
    }

    @Override
    public Collection<? extends VehicleEntity> getEntities(ServerLevel world) {
        return world.getEntities(EntityTypeTest.forClass(VehicleEntity.class), _ -> true);
    }
}
