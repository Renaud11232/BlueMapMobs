package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractMobMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.HashMap;
import java.util.Map;

public class WolfMarkerBuilder extends AbstractMobMarkerBuilder<Wolf> {
    private final Map<Wolf.Variant, Icon> angryIcons;
    private final Map<Wolf.Variant, Icon> tamedIcons;
    private final Map<Wolf.Variant, Icon> untamedIcons;
    
    public WolfMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
        angryIcons = new HashMap<>();
        angryIcons.put(Wolf.Variant.ASHEN, BlueMapMobsIcon.Mob.ANGRY_ASHEN_WOLF);
        angryIcons.put(Wolf.Variant.BLACK, BlueMapMobsIcon.Mob.ANGRY_BLACK_WOLF);
        angryIcons.put(Wolf.Variant.CHESTNUT, BlueMapMobsIcon.Mob.ANGRY_CHESTNUT_WOLF);
        angryIcons.put(Wolf.Variant.PALE, BlueMapMobsIcon.Mob.ANGRY_PALE_WOLF);
        angryIcons.put(Wolf.Variant.RUSTY, BlueMapMobsIcon.Mob.ANGRY_RUSTY_WOLF);
        angryIcons.put(Wolf.Variant.SNOWY, BlueMapMobsIcon.Mob.ANGRY_SNOWY_WOLF);
        angryIcons.put(Wolf.Variant.SPOTTED, BlueMapMobsIcon.Mob.ANGRY_SPOTTED_WOLF);
        angryIcons.put(Wolf.Variant.STRIPED, BlueMapMobsIcon.Mob.ANGRY_STRIPED_WOLF);
        angryIcons.put(Wolf.Variant.WOODS, BlueMapMobsIcon.Mob.ANGRY_WOODS_WOLF);
        tamedIcons = new HashMap<>();
        tamedIcons.put(Wolf.Variant.ASHEN, BlueMapMobsIcon.Mob.TAMED_ASHEN_WOLF);
        tamedIcons.put(Wolf.Variant.BLACK, BlueMapMobsIcon.Mob.TAMED_BLACK_WOLF);
        tamedIcons.put(Wolf.Variant.CHESTNUT, BlueMapMobsIcon.Mob.TAMED_CHESTNUT_WOLF);
        tamedIcons.put(Wolf.Variant.PALE, BlueMapMobsIcon.Mob.TAMED_PALE_WOLF);
        tamedIcons.put(Wolf.Variant.RUSTY, BlueMapMobsIcon.Mob.TAMED_RUSTY_WOLF);
        tamedIcons.put(Wolf.Variant.SNOWY, BlueMapMobsIcon.Mob.TAMED_SNOWY_WOLF);
        tamedIcons.put(Wolf.Variant.SPOTTED, BlueMapMobsIcon.Mob.TAMED_SPOTTED_WOLF);
        tamedIcons.put(Wolf.Variant.STRIPED, BlueMapMobsIcon.Mob.TAMED_STRIPED_WOLF);
        tamedIcons.put(Wolf.Variant.WOODS, BlueMapMobsIcon.Mob.TAMED_WOODS_WOLF);
        untamedIcons = new HashMap<>();
        untamedIcons.put(Wolf.Variant.ASHEN, BlueMapMobsIcon.Mob.UNTAMED_ASHEN_WOLF);
        untamedIcons.put(Wolf.Variant.BLACK, BlueMapMobsIcon.Mob.UNTAMED_BLACK_WOLF);
        untamedIcons.put(Wolf.Variant.CHESTNUT, BlueMapMobsIcon.Mob.UNTAMED_CHESTNUT_WOLF);
        untamedIcons.put(Wolf.Variant.PALE, BlueMapMobsIcon.Mob.UNTAMED_PALE_WOLF);
        untamedIcons.put(Wolf.Variant.RUSTY, BlueMapMobsIcon.Mob.UNTAMED_RUSTY_WOLF);
        untamedIcons.put(Wolf.Variant.SNOWY, BlueMapMobsIcon.Mob.UNTAMED_SNOWY_WOLF);
        untamedIcons.put(Wolf.Variant.SPOTTED, BlueMapMobsIcon.Mob.UNTAMED_SPOTTED_WOLF);
        untamedIcons.put(Wolf.Variant.STRIPED, BlueMapMobsIcon.Mob.UNTAMED_STRIPED_WOLF);
        untamedIcons.put(Wolf.Variant.WOODS, BlueMapMobsIcon.Mob.UNTAMED_WOODS_WOLF);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.WOLF;
    }

    @Override
    public Icon getIcon(Wolf wolf) {
        Map<Wolf.Variant, Icon> icons;
        if (wolf.isAngry()) {
            icons = angryIcons;
        } else if (wolf.isTamed()) {
            icons = tamedIcons;
        } else {
            icons = untamedIcons;
        }
        return icons.get(wolf.getVariant());
    }
}
