package be.renaud11232.bluemapentities.fabric;

import be.renaud11232.bluemapentities.configuration.GeneralConfiguration;

public class FabricGeneralConfiguration implements GeneralConfiguration {
    private Integer minimum_block_light;
    private Integer minimum_sky_light;

    @Override
    public int getMinimumBlockLight() {
        return minimum_block_light == null ? 4 : minimum_block_light;
    }

    @Override
    public int getMinimumSkyLight() {
        return minimum_sky_light == null ? 1 : minimum_sky_light;
    }
}
