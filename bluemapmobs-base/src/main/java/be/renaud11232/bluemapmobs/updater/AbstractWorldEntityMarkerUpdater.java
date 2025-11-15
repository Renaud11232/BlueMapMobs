package be.renaud11232.bluemapmobs.updater;

import be.renaud11232.bluemapmobs.markerbuilder.MarkerBuilder;
import be.renaud11232.bluemapmobs.markersetbuilder.MarkerSetBuilder;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

import java.util.UUID;

public abstract class AbstractWorldEntityMarkerUpdater<T extends Entity> extends AbstractWorldMarkerUpdater<T> {
    protected AbstractWorldEntityMarkerUpdater(Plugin plugin, BlueMapAPI api, MarkerSetBuilder<T> markerSetBuilder, MarkerBuilder<T> markerBuilder) {
        super(plugin, api, markerSetBuilder, markerBuilder);
    }
    @Override
    public UUID getUniqueId(T entity) {
        return entity.getUniqueId();
    }
}
