package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.icon.Icon;
import be.renaud11232.bluemapmobs.MobsIcon;
import be.renaud11232.bluemapmobs.entity.Fox;

import java.util.HashMap;
import java.util.Map;

public class FoxMarkerBuilder extends AgeableMarkerBuilder<Fox> {
    private final Map<Fox.Type, Icon> adultIcons;
    private final Map<Fox.Type, Icon> sleepAdultIcons;
    private final Map<Fox.Type, Icon> babyIcons;
    private final Map<Fox.Type, Icon> sleepBabyIcons;

    public FoxMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
        adultIcons = new HashMap<>();
        adultIcons.put(Fox.Type.RED, MobsIcon.FOX_RED);
        adultIcons.put(Fox.Type.SNOW, MobsIcon.FOX_SNOW);
        sleepAdultIcons = new HashMap<>();
        sleepAdultIcons.put(Fox.Type.RED, MobsIcon.FOX_RED_SLEEP);
        sleepAdultIcons.put(Fox.Type.SNOW, MobsIcon.FOX_SNOW_SLEEP);
        babyIcons = new HashMap<>();
        babyIcons.put(Fox.Type.RED, MobsIcon.FOX_RED_BABY);
        babyIcons.put(Fox.Type.SNOW, MobsIcon.FOX_SNOW_BABY);
        sleepBabyIcons = new HashMap<>();
        sleepBabyIcons.put(Fox.Type.RED, MobsIcon.FOX_RED_SLEEP_BABY);
        sleepBabyIcons.put(Fox.Type.SNOW, MobsIcon.FOX_SNOW_SLEEP_BABY);
    }

    @Override
    protected Icon getAdultIcon(Fox fox) {
        Map<Fox.Type, Icon> icons;
        if (fox.isSleeping()) {
            icons = sleepAdultIcons;
        } else {
            icons = adultIcons;
        }
        return icons.get(fox.getType());
    }

    @Override
    protected Icon getBabyIcon(Fox fox) {
        Map<Fox.Type, Icon> icons;
        if (fox.isSleeping()) {
            icons = sleepBabyIcons;
        } else {
            icons = babyIcons;
        }
        return icons.get(fox.getType());
    }
}
