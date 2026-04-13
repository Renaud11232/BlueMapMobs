package be.renaud11232.bluemapmobs.plugin.spigot.entity;

import be.renaud11232.bluemapmobs.entity.CopperGolem;
import be.renaud11232.bluemapmobs.plugin.common.entity.BukkitMob;

public class SpigotCopperGolem extends BukkitMob<org.bukkit.entity.CopperGolem> implements CopperGolem {
    public SpigotCopperGolem(org.bukkit.entity.CopperGolem wrapped) {
        super(wrapped);
    }

    @Override
    public CopperWeatherState getWeatherState() {
        return switch (wrapped.getWeatherState()) {
            case UNAFFECTED -> CopperWeatherState.UNAFFECTED;
            case EXPOSED -> CopperWeatherState.EXPOSED;
            case WEATHERED -> CopperWeatherState.WEATHERED;
            case OXIDIZED -> CopperWeatherState.OXIDIZED;
        };
    }
}
