package be.renaud11232.bluemapmobmarkers.paper.entity;

import be.renaud11232.bluemapmobmarkers.bukkit.entity.BukkitMob;
import be.renaud11232.bluemapmobmarkers.entity.CopperGolem;

public class PaperCopperGolem extends BukkitMob<org.bukkit.entity.CopperGolem> implements CopperGolem {
    public PaperCopperGolem(org.bukkit.entity.CopperGolem wrapped) {
        super(wrapped);
    }

    @Override
    public CopperWeatherState getWeatherState() {
        return switch (wrapped.getWeatheringState()) {
            case UNAFFECTED -> CopperWeatherState.UNAFFECTED;
            case EXPOSED -> CopperWeatherState.EXPOSED;
            case WEATHERED -> CopperWeatherState.WEATHERED;
            case OXIDIZED -> CopperWeatherState.OXIDIZED;
        };
    }
}
