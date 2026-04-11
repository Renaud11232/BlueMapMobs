package be.renaud11232.bluemapentities.module.configuration;

import java.util.List;

public interface MarkerSetConfiguration {
    String getId();
    String getLabel();
    boolean isToggleable();
    boolean isHiddenByDefault();
    List<MarkerConfiguration> getMarkers();
}
