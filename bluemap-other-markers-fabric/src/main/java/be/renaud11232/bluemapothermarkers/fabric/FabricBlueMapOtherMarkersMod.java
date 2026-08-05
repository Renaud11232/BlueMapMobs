package be.renaud11232.bluemapothermarkers.fabric;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.fabric.FabricBlueMapEntityMarkersMod;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;

public class FabricBlueMapOtherMarkersMod extends FabricBlueMapEntityMarkersMod<Entity> {
    @Override
    public Module<ServerLevel, Entity> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricOthersModule(api, configuration);
    }
}
