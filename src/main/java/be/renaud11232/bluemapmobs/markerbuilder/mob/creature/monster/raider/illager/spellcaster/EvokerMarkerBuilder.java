package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Evoker;

public class EvokerMarkerBuilder extends MobEntityMarkerBuilder<Evoker> {
    public EvokerMarkerBuilder(FileConfiguration config) {
        super(config, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.EVOKER, BlueMapMobsIcon.Mob.EVOKER);
    }
}
