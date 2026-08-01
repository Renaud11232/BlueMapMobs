package be.renaud11232.bluemapentities.configuration;

import java.util.List;

public interface MarkerSetConfiguration {
    String getId();
    String getLabel();
    boolean isToggleable();
    boolean isHiddenByDefault();
    List<MarkerConfiguration> getMarkers();
}
