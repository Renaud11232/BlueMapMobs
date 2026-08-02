package be.renaud11232.bluemapentities.configuration;

import java.util.List;

public interface Configuration {
    GeneralConfiguration getGeneral();
    List<MarkerSetConfiguration> getMarkerSets();
}
