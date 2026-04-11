package be.renaud11232.bluemapentities.module.configuration;

import java.util.List;

public interface ModuleConfiguration {
    List<? extends MarkerSetConfiguration> getMarkerSets();
}
