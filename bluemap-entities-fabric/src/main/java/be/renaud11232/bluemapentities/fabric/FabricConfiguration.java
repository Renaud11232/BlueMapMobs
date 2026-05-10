package be.renaud11232.bluemapentities.fabric;

import be.renaud11232.bluemapentities.Configuration;
import be.renaud11232.bluemapentities.GeneralConfiguration;

public class FabricConfiguration implements Configuration {
    private FabricGeneralConfiguration general;

    @Override
    public GeneralConfiguration getGeneral() {
        return general == null ? new FabricGeneralConfiguration() : general;
    }
}
