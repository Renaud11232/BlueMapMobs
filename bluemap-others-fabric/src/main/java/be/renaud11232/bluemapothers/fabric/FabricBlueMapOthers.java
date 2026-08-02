package be.renaud11232.bluemapothers.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.fabric.FabricBlueMapEntitiesMod;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

public class FabricBlueMapOthers extends FabricBlueMapEntitiesMod<Entity> {
    @Override
    public Module<ServerLevel, Entity> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricOthersModule(api, configuration);
    }
}
