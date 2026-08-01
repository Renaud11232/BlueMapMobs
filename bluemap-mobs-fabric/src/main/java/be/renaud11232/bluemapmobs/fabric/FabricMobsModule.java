package be.renaud11232.bluemapmobs.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.configuration.ModuleConfiguration;
import be.renaud11232.bluemapmobs.MobsModule;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.entity.EntityTypeTest;

import java.util.Collection;

public class FabricMobsModule extends MobsModule<ServerLevel, Mob> {
    protected FabricMobsModule(BlueMapEntitiesAPI api, ModuleConfiguration configuration) {
        super(api, configuration, ServerLevel.class, new FabricMobConverter());
    }

    @Override
    protected Collection<? extends Mob> getEntities(ServerLevel world) {
        return world.getEntities(EntityTypeTest.forClass(Mob.class), _ -> true);
    }
}
