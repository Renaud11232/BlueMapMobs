package be.renaud11232.bluemapmobs.updater.impl;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.impl.MobMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.impl.MobMarkerSetBuilder;
import be.renaud11232.bluemapmobs.updater.AbstractWorldEntityMarkerUpdater;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.Mob;

import java.util.Collection;

public class WorldMobMarkerUpdater extends AbstractWorldEntityMarkerUpdater<Mob> {

    public WorldMobMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new MobMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new MobMarkerBuilder(plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public Collection<Mob> getElements(World world) {
        return world.getEntitiesByClass(Mob.class);
    }
}
