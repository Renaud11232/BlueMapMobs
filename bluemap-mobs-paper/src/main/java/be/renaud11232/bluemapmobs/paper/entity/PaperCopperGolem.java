package be.renaud11232.bluemapmobs.paper.entity;

import be.renaud11232.bluemapmobs.entity.CopperGolem;
import be.renaud11232.bluemapmobs.bukkit.entity.BukkitMob;

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
