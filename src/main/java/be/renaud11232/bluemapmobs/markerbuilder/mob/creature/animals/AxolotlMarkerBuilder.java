package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Axolotl;

public class AxolotlMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.axolotl", Axolotl::getVariant);
        registerIcon(Axolotl.Variant.LUCY, Icon.LUCY_AXOLOTL);
        registerIcon(Axolotl.Variant.WILD, Icon.WILD_AXOLOTL);
        registerIcon(Axolotl.Variant.GOLD, Icon.GOLD_AXOLOTL);
        registerIcon(Axolotl.Variant.CYAN, Icon.CYAN_AXOLOTL);
        registerIcon(Axolotl.Variant.BLUE, Icon.BLUE_AXOLOTL);
    }
}
