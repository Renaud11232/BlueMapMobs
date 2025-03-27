package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Axolotl;

public class AxolotlMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.AXOLOTL, Axolotl::getVariant);
        registerIcon(Axolotl.Variant.LUCY, MobIcon.LUCY_AXOLOTL);
        registerIcon(Axolotl.Variant.WILD, MobIcon.WILD_AXOLOTL);
        registerIcon(Axolotl.Variant.GOLD, MobIcon.GOLD_AXOLOTL);
        registerIcon(Axolotl.Variant.CYAN, MobIcon.CYAN_AXOLOTL);
        registerIcon(Axolotl.Variant.BLUE, MobIcon.BLUE_AXOLOTL);
    }
}
