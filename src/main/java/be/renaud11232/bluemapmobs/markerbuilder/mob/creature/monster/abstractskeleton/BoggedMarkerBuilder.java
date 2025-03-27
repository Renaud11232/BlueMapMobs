package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.abstractskeleton;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Bogged;

public class BoggedMarkerBuilder extends MobEntityMarkerBuilder<Bogged> {
    public BoggedMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.BOGGED, BlueMapMobsIcon.Mob.BOGGED);
    }
}
