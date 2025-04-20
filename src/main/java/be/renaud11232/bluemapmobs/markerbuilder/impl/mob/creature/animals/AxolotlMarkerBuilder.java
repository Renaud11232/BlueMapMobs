package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Axolotl;

public class AxolotlMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Axolotl, Axolotl.Variant> {
    public AxolotlMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.AXOLOTL;
    }

    @Override
    public Axolotl.Variant getVariant(Axolotl axolotl) {
        return axolotl.getVariant();
    }

    @Override
    public void registerVariantIcons(Registry<Axolotl.Variant, Icon> registry) {
        registry.register(Axolotl.Variant.LUCY, BlueMapMobsIcon.Mob.LUCY_AXOLOTL);
        registry.register(Axolotl.Variant.WILD, BlueMapMobsIcon.Mob.WILD_AXOLOTL);
        registry.register(Axolotl.Variant.GOLD, BlueMapMobsIcon.Mob.GOLD_AXOLOTL);
        registry.register(Axolotl.Variant.CYAN, BlueMapMobsIcon.Mob.CYAN_AXOLOTL);
        registry.register(Axolotl.Variant.BLUE, BlueMapMobsIcon.Mob.BLUE_AXOLOTL);
    }
}
