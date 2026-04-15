package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Wolf;

import java.util.HashMap;
import java.util.Map;

public class WolfMarkerBuilder extends AgeableMarkerBuilder<Wolf> {
    private final Map<Wolf.Variant, Icon> angryAdultIcons;
    private final Map<Wolf.Variant, Icon> tamedAdultIcons;
    private final Map<Wolf.Variant, Icon> untamedAdultIcons;
    private final Map<Wolf.Variant, Icon> angryBabyIcons;
    private final Map<Wolf.Variant, Icon> tamedBabyIcons;
    private final Map<Wolf.Variant, Icon> untamedBabyIcons;
    
    public WolfMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        angryAdultIcons = new HashMap<>();
        angryAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.ANGRY_ASHEN_WOLF);
        angryAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.ANGRY_BLACK_WOLF);
        angryAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.ANGRY_CHESTNUT_WOLF);
        angryAdultIcons.put(Wolf.Variant.PALE, MobsIcon.ANGRY_PALE_WOLF);
        angryAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.ANGRY_RUSTY_WOLF);
        angryAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.ANGRY_SNOWY_WOLF);
        angryAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.ANGRY_SPOTTED_WOLF);
        angryAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.ANGRY_STRIPED_WOLF);
        angryAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.ANGRY_WOODS_WOLF);
        tamedAdultIcons = new HashMap<>();
        tamedAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.TAMED_ASHEN_WOLF);
        tamedAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.TAMED_BLACK_WOLF);
        tamedAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.TAMED_CHESTNUT_WOLF);
        tamedAdultIcons.put(Wolf.Variant.PALE, MobsIcon.TAMED_PALE_WOLF);
        tamedAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.TAMED_RUSTY_WOLF);
        tamedAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.TAMED_SNOWY_WOLF);
        tamedAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.TAMED_SPOTTED_WOLF);
        tamedAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.TAMED_STRIPED_WOLF);
        tamedAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.TAMED_WOODS_WOLF);
        untamedAdultIcons = new HashMap<>();
        untamedAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.UNTAMED_ASHEN_WOLF);
        untamedAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.UNTAMED_BLACK_WOLF);
        untamedAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.UNTAMED_CHESTNUT_WOLF);
        untamedAdultIcons.put(Wolf.Variant.PALE, MobsIcon.UNTAMED_PALE_WOLF);
        untamedAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.UNTAMED_RUSTY_WOLF);
        untamedAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.UNTAMED_SNOWY_WOLF);
        untamedAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.UNTAMED_SPOTTED_WOLF);
        untamedAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.UNTAMED_STRIPED_WOLF);
        untamedAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.UNTAMED_WOODS_WOLF);
        angryBabyIcons = new HashMap<>();
        tamedBabyIcons = new HashMap<>();
        untamedBabyIcons = new HashMap<>();
        //TODO: Add baby variants
    }

    @Override
    protected Icon getAdultIcon(Wolf wolf) {
        Map<Wolf.Variant, Icon> icons;
        if (wolf.isAngry()) {
            icons = angryAdultIcons;
        } else if (wolf.isTamed()) {
            icons = tamedAdultIcons;
        } else {
            icons = untamedAdultIcons;
        }
        return icons.get(wolf.getVariant());
    }

    @Override
    protected Icon getBabyIcon(Wolf wolf) {
        Map<Wolf.Variant, Icon> icons;
        if (wolf.isAngry()) {
            icons = angryBabyIcons;
        } else if (wolf.isTamed()) {
            icons = tamedBabyIcons;
        } else {
            icons = untamedBabyIcons;
        }
        return icons.get(wolf.getVariant());
    }
}
