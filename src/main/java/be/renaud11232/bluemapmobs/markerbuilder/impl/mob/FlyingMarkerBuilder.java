package be.renaud11232.bluemapmobs.markerbuilder.impl.mob;

import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.flying.GhastMarkerBuilder;
import be.renaud11232.bluemapmobs.markerbuilder.impl.mob.flying.PhantomMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.MarkerBuilderRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Flying;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Phantom;

public class FlyingMarkerBuilder extends MobEntityMarkerBuilder<Flying> {
    public FlyingMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public void registerMarkerBuilders(MarkerBuilderRegistry<Flying> registry) {
        registry.register(Ghast.class, new GhastMarkerBuilder(getConfig(), getDefaultConfig()));
        registry.register(Phantom.class, new PhantomMarkerBuilder(getConfig(), getDefaultConfig()));
    }
}
