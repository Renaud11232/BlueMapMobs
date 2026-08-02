package be.renaud11232.bluemapmobs.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.fabric.FabricBlueMapEntitiesMod;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;

public class FabricBlueMapMobs extends FabricBlueMapEntitiesMod<Mob> {
    @Override
    public Module<ServerLevel, Mob> provideModule(BlueMapAPI api, Configuration configuration) {
        return new FabricMobsModule(api, configuration);
    }
}
