package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Axolotl;

public class AxolotlMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.AXOLOTL, Axolotl::getVariant);
        registerIcon(Axolotl.Variant.LUCY, BlueMapMobsIcon.Mob.LUCY_AXOLOTL);
        registerIcon(Axolotl.Variant.WILD, BlueMapMobsIcon.Mob.WILD_AXOLOTL);
        registerIcon(Axolotl.Variant.GOLD, BlueMapMobsIcon.Mob.GOLD_AXOLOTL);
        registerIcon(Axolotl.Variant.CYAN, BlueMapMobsIcon.Mob.CYAN_AXOLOTL);
        registerIcon(Axolotl.Variant.BLUE, BlueMapMobsIcon.Mob.BLUE_AXOLOTL);
    }
}
