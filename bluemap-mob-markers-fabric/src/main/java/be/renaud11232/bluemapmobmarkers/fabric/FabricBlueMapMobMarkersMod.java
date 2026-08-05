package be.renaud11232.bluemapmobmarkers.fabric;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.fabric.FabricBlueMapEntityMarkersMod;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;

public class FabricBlueMapMobMarkersMod extends FabricBlueMapEntityMarkersMod<Mob> {
    @Override
    public Module<ServerLevel, Mob> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricMobsModule(api, configuration);
    }
}
