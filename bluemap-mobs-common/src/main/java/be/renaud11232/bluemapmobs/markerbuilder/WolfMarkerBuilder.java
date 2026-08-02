package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.configuration.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Wolf;

import java.util.HashMap;
import java.util.Map;

public class WolfMarkerBuilder extends AgeableMarkerBuilder<Wolf> {
    private final Map<Wolf.Variant, Icon> adultIcons;
    private final Map<Wolf.Variant, Icon> angryAdultIcons;
    private final Map<Wolf.Variant, Icon> tameAdultIcons;
    private final Map<Wolf.Variant, Icon> babyIcons;
    private final Map<Wolf.Variant, Icon> angryBabyIcons;
    private final Map<Wolf.Variant, Icon> tameBabyIcons;
    
    public WolfMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        adultIcons = new HashMap<>();
        adultIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN);
        adultIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK);
        adultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT);
        adultIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF);
        adultIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY);
        adultIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY);
        adultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED);
        adultIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED);
        adultIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS);
        angryAdultIcons = new HashMap<>();
        angryAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_ANGRY);
        angryAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_ANGRY);
        angryAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_ANGRY);
        angryAdultIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_ANGRY);
        angryAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_ANGRY);
        angryAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_ANGRY);
        angryAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_ANGRY);
        angryAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_ANGRY);
        angryAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_ANGRY);
        tameAdultIcons = new HashMap<>();
        tameAdultIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_TAME);
        tameAdultIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_TAME);
        tameAdultIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_TAME);
        tameAdultIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_TAME);
        tameAdultIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_TAME);
        tameAdultIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_TAME);
        tameAdultIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_TAME);
        tameAdultIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_TAME);
        tameAdultIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_TAME);
        babyIcons = new HashMap<>();
        babyIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_BABY);
        babyIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_BABY);
        babyIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_BABY);
        babyIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_BABY);
        babyIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_BABY);
        babyIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_BABY);
        babyIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_BABY);
        babyIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_BABY);
        babyIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_BABY);
        angryBabyIcons = new HashMap<>();
        angryBabyIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_ANGRY_BABY);
        angryBabyIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_ANGRY_BABY);
        tameBabyIcons = new HashMap<>();
        tameBabyIcons.put(Wolf.Variant.ASHEN, MobsIcon.WOLF_ASHEN_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.BLACK, MobsIcon.WOLF_BLACK_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.CHESTNUT, MobsIcon.WOLF_CHESTNUT_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.PALE, MobsIcon.WOLF_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.RUSTY, MobsIcon.WOLF_RUSTY_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.SNOWY, MobsIcon.WOLF_SNOWY_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.SPOTTED, MobsIcon.WOLF_SPOTTED_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.STRIPED, MobsIcon.WOLF_STRIPED_TAME_BABY);
        tameBabyIcons.put(Wolf.Variant.WOODS, MobsIcon.WOLF_WOODS_TAME_BABY);
    }

    @Override
    protected Icon getAdultIcon(Wolf wolf) {
        Map<Wolf.Variant, Icon> icons;
        if (wolf.isTamed()) {
            icons = tameAdultIcons;
        } else if (wolf.isAngry()) {
            icons = angryAdultIcons;
        } else {
            icons = adultIcons;
        }
        return icons.get(wolf.getVariant());
    }

    @Override
    protected Icon getBabyIcon(Wolf wolf) {
        Map<Wolf.Variant, Icon> icons;
        if (wolf.isTamed()) {
            icons = tameBabyIcons;
        } else if (wolf.isAngry()) {
            icons = angryBabyIcons;
        } else {
            icons = babyIcons;
        }
        return icons.get(wolf.getVariant());
    }
}
