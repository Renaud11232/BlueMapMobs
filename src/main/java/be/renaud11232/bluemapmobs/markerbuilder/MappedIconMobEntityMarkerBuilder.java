package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapmobs.Icon;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public abstract class MappedIconMobEntityMarkerBuilder<T extends Mob, K> extends MobEntityMarkerBuilder<T> {
    private final Function<T, K> keyGetter;
    private final Map<K, Icon> icons;

    public MappedIconMobEntityMarkerBuilder(FileConfiguration config, String displayedConfigKey, Function<T, K> keyGetter) {
        super(config, displayedConfigKey);
        this.keyGetter = keyGetter;
        this.icons = new HashMap<>();
    }

    public MappedIconMobEntityMarkerBuilder(FileConfiguration config, Function<T, K> keyGetter) {
        this(config, null, keyGetter);
    }

    protected void registerIcon(K key, Icon icon) {
        icons.put(key, icon);
    }

    @Override
    public Optional<POIMarker> buildDefault(T mob) {
        return super.buildDefault(mob).map(marker -> {
            Icon icon = icons.getOrDefault(keyGetter.apply(mob), Icon.UNKNOWN);
            marker.setIcon(icon.getPath(), icon.getAnchor());
            return marker;
        });
    }
}
