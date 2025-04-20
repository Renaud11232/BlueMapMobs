package be.renaud11232.bluemapmobs.updater;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.impl.MobMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.MobMarkerSetBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;

import java.util.Collection;

public class WorldMobMarkerUpdater extends WorldEntityMarkerUpdater<Mob> {

    public WorldMobMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new MobMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new MobMarkerBuilder(plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public Collection<Mob> getEntities(World world) {
        return world.getEntitiesByClass(Mob.class);
    }
}
