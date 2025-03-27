package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

public class CatMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.CAT, Cat::getCatType);
        registerIcon(Cat.Type.RED, MobIcon.RED_CAT);
        registerIcon(Cat.Type.BLACK, MobIcon.RED_CAT);
        registerIcon(Cat.Type.TABBY, MobIcon.TABBY_CAT);
        registerIcon(Cat.Type.WHITE, MobIcon.WHITE_CAT);
        registerIcon(Cat.Type.CALICO, MobIcon.CALICO_CAT);
        registerIcon(Cat.Type.JELLIE, MobIcon.JELLIE_CAT);
        registerIcon(Cat.Type.PERSIAN, MobIcon.PERSIAN_CAT);
        registerIcon(Cat.Type.RAGDOLL, MobIcon.RAGDOLL_CAT);
        registerIcon(Cat.Type.SIAMESE, MobIcon.SIAMESE_CAT);
        registerIcon(Cat.Type.ALL_BLACK, MobIcon.ALL_BLACK_CAT);
        registerIcon(Cat.Type.BRITISH_SHORTHAIR, MobIcon.BRITISH_SHORTHAIR_CAT);
    }
}
