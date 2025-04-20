package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.markerbuilder.SingleVariantMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.VariantIconRegistry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

public class CatMarkerBuilder extends SingleVariantMobEntityMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CAT;
    }

    @Override
    public Cat.Type getVariant(Cat cat) {
        return cat.getCatType();
    }

    @Override
    public void registerVariantIcons(VariantIconRegistry<Cat.Type> registry) {
        registry.register(Cat.Type.RED, BlueMapMobsIcon.Mob.RED_CAT);
        registry.register(Cat.Type.BLACK, BlueMapMobsIcon.Mob.RED_CAT);
        registry.register(Cat.Type.TABBY, BlueMapMobsIcon.Mob.TABBY_CAT);
        registry.register(Cat.Type.WHITE, BlueMapMobsIcon.Mob.WHITE_CAT);
        registry.register(Cat.Type.CALICO, BlueMapMobsIcon.Mob.CALICO_CAT);
        registry.register(Cat.Type.JELLIE, BlueMapMobsIcon.Mob.JELLIE_CAT);
        registry.register(Cat.Type.PERSIAN, BlueMapMobsIcon.Mob.PERSIAN_CAT);
        registry.register(Cat.Type.RAGDOLL, BlueMapMobsIcon.Mob.RAGDOLL_CAT);
        registry.register(Cat.Type.SIAMESE, BlueMapMobsIcon.Mob.SIAMESE_CAT);
        registry.register(Cat.Type.ALL_BLACK, BlueMapMobsIcon.Mob.ALL_BLACK_CAT);
        registry.register(Cat.Type.BRITISH_SHORTHAIR, BlueMapMobsIcon.Mob.BRITISH_SHORTHAIR_CAT);
    }
}
