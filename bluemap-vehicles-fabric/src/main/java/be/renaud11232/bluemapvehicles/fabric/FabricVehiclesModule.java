package be.renaud11232.bluemapvehicles.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.configuration.ModuleConfiguration;
import be.renaud11232.bluemapvehicles.VehiclesModule;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.level.entity.EntityTypeTest;

import java.util.Collection;

public class FabricVehiclesModule extends VehiclesModule<ServerLevel, VehicleEntity> {
    protected FabricVehiclesModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, ServerLevel.class, new FabricVehiclesConverter());
    }

    @Override
    protected Collection<? extends VehicleEntity> getEntities(ServerLevel world) {
        return world.getEntities(EntityTypeTest.forClass(VehicleEntity.class), _ -> true);
    }
}
