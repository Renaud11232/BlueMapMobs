package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.CopperGolem;

public class FabricCopperGolem extends FabricMob<net.minecraft.world.entity.animal.golem.CopperGolem> implements CopperGolem {
    public FabricCopperGolem(net.minecraft.world.entity.animal.golem.CopperGolem wrapped) {
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
