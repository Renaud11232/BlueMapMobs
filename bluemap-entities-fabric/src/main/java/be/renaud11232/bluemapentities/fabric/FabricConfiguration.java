package be.renaud11232.bluemapentities.fabric;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.configuration.GeneralConfiguration;

public class FabricConfiguration implements Configuration {
    private FabricGeneralConfiguration general;

    @Override
    public GeneralConfiguration getGeneral() {
        return general == null ? new FabricGeneralConfiguration() : general;
    }
}
