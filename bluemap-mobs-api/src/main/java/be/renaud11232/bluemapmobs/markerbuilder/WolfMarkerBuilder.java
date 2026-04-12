package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Wolf;

import java.util.HashMap;
import java.util.Map;

public class WolfMarkerBuilder extends SimpleMarkerBuilder<Wolf> {
    private final Map<Wolf.Variant, Icon> angryIcons;
    private final Map<Wolf.Variant, Icon> tamedIcons;
    private final Map<Wolf.Variant, Icon> untamedIcons;
    
    public WolfMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        angryIcons = new HashMap<>();
        angryIcons.put(Wolf.Variant.ASHEN, MobsIcon.ANGRY_ASHEN_WOLF);
        angryIcons.put(Wolf.Variant.BLACK, MobsIcon.ANGRY_BLACK_WOLF);
        angryIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.ANGRY_CHESTNUT_WOLF);
        angryIcons.put(Wolf.Variant.PALE, MobsIcon.ANGRY_PALE_WOLF);
        angryIcons.put(Wolf.Variant.RUSTY, MobsIcon.ANGRY_RUSTY_WOLF);
        angryIcons.put(Wolf.Variant.SNOWY, MobsIcon.ANGRY_SNOWY_WOLF);
        angryIcons.put(Wolf.Variant.SPOTTED, MobsIcon.ANGRY_SPOTTED_WOLF);
        angryIcons.put(Wolf.Variant.STRIPED, MobsIcon.ANGRY_STRIPED_WOLF);
        angryIcons.put(Wolf.Variant.WOODS, MobsIcon.ANGRY_WOODS_WOLF);
        tamedIcons = new HashMap<>();
        tamedIcons.put(Wolf.Variant.ASHEN, MobsIcon.TAMED_ASHEN_WOLF);
        tamedIcons.put(Wolf.Variant.BLACK, MobsIcon.TAMED_BLACK_WOLF);
        tamedIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.TAMED_CHESTNUT_WOLF);
        tamedIcons.put(Wolf.Variant.PALE, MobsIcon.TAMED_PALE_WOLF);
        tamedIcons.put(Wolf.Variant.RUSTY, MobsIcon.TAMED_RUSTY_WOLF);
        tamedIcons.put(Wolf.Variant.SNOWY, MobsIcon.TAMED_SNOWY_WOLF);
        tamedIcons.put(Wolf.Variant.SPOTTED, MobsIcon.TAMED_SPOTTED_WOLF);
        tamedIcons.put(Wolf.Variant.STRIPED, MobsIcon.TAMED_STRIPED_WOLF);
        tamedIcons.put(Wolf.Variant.WOODS, MobsIcon.TAMED_WOODS_WOLF);
        untamedIcons = new HashMap<>();
        untamedIcons.put(Wolf.Variant.ASHEN, MobsIcon.UNTAMED_ASHEN_WOLF);
        untamedIcons.put(Wolf.Variant.BLACK, MobsIcon.UNTAMED_BLACK_WOLF);
        untamedIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.UNTAMED_CHESTNUT_WOLF);
        untamedIcons.put(Wolf.Variant.PALE, MobsIcon.UNTAMED_PALE_WOLF);
        untamedIcons.put(Wolf.Variant.RUSTY, MobsIcon.UNTAMED_RUSTY_WOLF);
        untamedIcons.put(Wolf.Variant.SNOWY, MobsIcon.UNTAMED_SNOWY_WOLF);
        untamedIcons.put(Wolf.Variant.SPOTTED, MobsIcon.UNTAMED_SPOTTED_WOLF);
        untamedIcons.put(Wolf.Variant.STRIPED, MobsIcon.UNTAMED_STRIPED_WOLF);
        untamedIcons.put(Wolf.Variant.WOODS, MobsIcon.UNTAMED_WOODS_WOLF);
    }

    @Override
    protected Icon getIcon(Wolf wolf) {
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
