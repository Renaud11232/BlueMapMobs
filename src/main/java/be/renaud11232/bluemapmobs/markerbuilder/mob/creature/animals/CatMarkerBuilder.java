package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

public class CatMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.cat", Cat::getCatType);
        registerIcon(Cat.Type.RED, Icon.RED_CAT);
        registerIcon(Cat.Type.BLACK, Icon.RED_CAT);
        registerIcon(Cat.Type.TABBY, Icon.TABBY_CAT);
        registerIcon(Cat.Type.WHITE, Icon.WHITE_CAT);
        registerIcon(Cat.Type.CALICO, Icon.CALICO_CAT);
        registerIcon(Cat.Type.JELLIE, Icon.JELLIE_CAT);
        registerIcon(Cat.Type.PERSIAN, Icon.PERSIAN_CAT);
        registerIcon(Cat.Type.RAGDOLL, Icon.RAGDOLL_CAT);
        registerIcon(Cat.Type.SIAMESE, Icon.SIAMESE_CAT);
        registerIcon(Cat.Type.ALL_BLACK, Icon.ALL_BLACK_CAT);
        registerIcon(Cat.Type.BRITISH_SHORTHAIR, Icon.BRITISH_SHORTHAIR_CAT);
    }
}
