package be.renaud11232.bluemapmobs.markerbuilder.v2;

import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Mob;

import java.util.Map;
import java.util.Optional;

public abstract class VariantMobEntityMarkerBuilder<T extends Mob, V> extends MobEntityMarkerBuilder<T> implements VariantMarkerBuilder<T, V> {
    private final Map<V, Icon> icons;

    public VariantMobEntityMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        VariantIconRegistry<V> registry = new VariantIconRegistry<>();
        registerVariantIcons(registry);
        icons = registry.getItems();
    }

    @Override
    public Optional<POIMarker> build(T mob) {
        return super.build(mob).map(marker -> {
            Icon icon = icons.get(getVariant(mob));
            if (icon != null) {
                marker.setIcon(icon.getPath(), icon.getAnchor());
            }
            return marker;
        });
    }
}
