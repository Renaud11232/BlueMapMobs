package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Pillager;

public class PillagerMarkerBuilder extends MobEntityMarkerBuilder<Pillager> {
    public PillagerMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.PILLAGER, BlueMapMobsIcon.Mob.PILLAGER);
    }
}
