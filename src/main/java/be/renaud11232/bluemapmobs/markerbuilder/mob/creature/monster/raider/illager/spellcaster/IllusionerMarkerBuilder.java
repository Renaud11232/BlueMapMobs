package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.visibility.MobMarkerVisibilityConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illusioner;

public class IllusionerMarkerBuilder extends MobEntityMarkerBuilder<Illusioner> {
    public IllusionerMarkerBuilder(FileConfiguration config) {
        super(config, MobMarkerVisibilityConfiguration.ILLUSIONER, MobIcon.ILLUSIONER);
    }
}
