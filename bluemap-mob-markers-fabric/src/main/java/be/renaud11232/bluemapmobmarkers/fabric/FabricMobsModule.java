package be.renaud11232.bluemapmobmarkers.fabric;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.fabric.module.FabricModule;
import be.renaud11232.bluemapmobmarkers.MobsModule;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.entity.EntityTypeTest;

import java.util.Collection;

public class FabricMobsModule extends MobsModule<ServerLevel, Mob> implements FabricModule<Mob> {
    protected FabricMobsModule(BlueMapAPI api, Configuration configuration) {
        super(api, configuration, new FabricMobConverter());
    }

    @Override
    public Collection<? extends Mob> getEntities(ServerLevel world) {
        return world.getEntities(EntityTypeTest.forClass(Mob.class), _ -> true);
    }
}
