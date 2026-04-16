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
        angryAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_ANGRY);
        angryAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_ANGRY);
        angryAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_ANGRY);
        angryAdultIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_PALE_ANGRY);
        angryAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_ANGRY);
        angryAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_ANGRY);
        angryAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_ANGRY);
        angryAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_ANGRY);
        angryAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_ANGRY);
        tamedAdultIcons = new HashMap<>();
        tamedAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_TAMED);
        tamedAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_TAMED);
        tamedAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_TAMED);
        tamedAdultIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_PALE_TAMED);
        tamedAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_TAMED);
        tamedAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_TAMED);
        tamedAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_TAMED);
        tamedAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_TAMED);
        tamedAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_TAMED);
        untamedAdultIcons = new HashMap<>();
        untamedAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_PALE_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_UNTAMED);
        untamedAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_UNTAMED);
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
