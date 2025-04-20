package be.renaud11232.bluemapmobs.updater;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.impl.OtherMarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.OtherMarkerSetBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;

import java.util.Collection;

public class WorldOtherMarkerUpdater extends WorldEntityMarkerUpdater<Entity> {
    public WorldOtherMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api) {
        super(plugin, api, new OtherMarkerSetBuilder(plugin.getConfig(), plugin.getDefaultConfig()), new OtherMarkerBuilder(plugin.getConfig(), plugin.getDefaultConfig()));
    }

    @Override
    public Collection<Entity> getEntities(World world) {
        return world.getEntitiesByClasses(ArmorStand.class);
    }
}
