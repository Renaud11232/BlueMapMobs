package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.monster.raider.illager.spellcaster;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.SingleIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Illusioner;

public class IllusionerMarkerBuilder extends SingleIconMobEntityMarkerBuilder<Illusioner> {
    public IllusionerMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.illusioner", Icon.ILLUSIONER);
    }
}
