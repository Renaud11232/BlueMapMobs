package be.renaud11232.bluemapmobmarkers.markerbuilder;

import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.icon.Icon;
import be.renaud11232.bluemapmobmarkers.MobIcon;
import be.renaud11232.bluemapmobmarkers.entity.Fox;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.HashMap;
import java.util.Map;

public class FoxMarkerBuilder extends AgeableMarkerBuilder<Fox> {
    private final Map<Fox.Type, Icon> adultIcons;
    private final Map<Fox.Type, Icon> sleepAdultIcons;
    private final Map<Fox.Type, Icon> babyIcons;
    private final Map<Fox.Type, Icon> sleepBabyIcons;

    public FoxMarkerBuilder(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
        adultIcons = new HashMap<>();
        adultIcons.put(Fox.Type.RED, MobIcon.FOX_RED);
        adultIcons.put(Fox.Type.SNOW, MobIcon.FOX_SNOW);
        sleepAdultIcons = new HashMap<>();
        sleepAdultIcons.put(Fox.Type.RED, MobIcon.FOX_RED_SLEEP);
        sleepAdultIcons.put(Fox.Type.SNOW, MobIcon.FOX_SNOW_SLEEP);
        babyIcons = new HashMap<>();
        babyIcons.put(Fox.Type.RED, MobIcon.FOX_RED_BABY);
        babyIcons.put(Fox.Type.SNOW, MobIcon.FOX_SNOW_BABY);
        sleepBabyIcons = new HashMap<>();
        sleepBabyIcons.put(Fox.Type.RED, MobIcon.FOX_RED_SLEEP_BABY);
        sleepBabyIcons.put(Fox.Type.SNOW, MobIcon.FOX_SNOW_SLEEP_BABY);
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
