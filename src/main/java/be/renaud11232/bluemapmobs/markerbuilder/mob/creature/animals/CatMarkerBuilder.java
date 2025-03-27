package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Cat;

public class CatMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Cat, Cat.Type> {
    public CatMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.CAT, Cat::getCatType);
        registerIcon(Cat.Type.RED, BlueMapMobsIcon.Mob.RED_CAT);
        registerIcon(Cat.Type.BLACK, BlueMapMobsIcon.Mob.RED_CAT);
        registerIcon(Cat.Type.TABBY, BlueMapMobsIcon.Mob.TABBY_CAT);
        registerIcon(Cat.Type.WHITE, BlueMapMobsIcon.Mob.WHITE_CAT);
        registerIcon(Cat.Type.CALICO, BlueMapMobsIcon.Mob.CALICO_CAT);
        registerIcon(Cat.Type.JELLIE, BlueMapMobsIcon.Mob.JELLIE_CAT);
        registerIcon(Cat.Type.PERSIAN, BlueMapMobsIcon.Mob.PERSIAN_CAT);
        registerIcon(Cat.Type.RAGDOLL, BlueMapMobsIcon.Mob.RAGDOLL_CAT);
        registerIcon(Cat.Type.SIAMESE, BlueMapMobsIcon.Mob.SIAMESE_CAT);
        registerIcon(Cat.Type.ALL_BLACK, BlueMapMobsIcon.Mob.ALL_BLACK_CAT);
        registerIcon(Cat.Type.BRITISH_SHORTHAIR, BlueMapMobsIcon.Mob.BRITISH_SHORTHAIR_CAT);
    }
}
