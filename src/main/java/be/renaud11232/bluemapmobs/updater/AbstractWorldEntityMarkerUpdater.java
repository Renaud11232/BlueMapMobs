package be.renaud11232.bluemapmobs.updater;

import be.renaud11232.bluemapmobs.BlueMapMobs;
import be.renaud11232.bluemapmobs.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.MarkerSetBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.entity.Entity;

import java.util.UUID;

public abstract class AbstractWorldEntityMarkerUpdater<T extends Entity> extends AbstractWorldMarkerUpdater<T> {
    protected AbstractWorldEntityMarkerUpdater(BlueMapMobs plugin, BlueMapAPI api, MarkerSetBuilder<T> markerSetBuilder, MarkerBuilder<T> markerBuilder) {
        super(plugin, api, markerSetBuilder, markerBuilder);
    }
    @Override
    public UUID getUniqueId(T entity) {
        return entity.getUniqueId();
    }
}
