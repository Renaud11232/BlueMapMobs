package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illusioner;

public class IllusionerMarkerBuilder extends MobEntityMarkerBuilder<Illusioner> {
    public IllusionerMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ILLUSIONER, BlueMapMobsIcon.Mob.ILLUSIONER);
    }
}
