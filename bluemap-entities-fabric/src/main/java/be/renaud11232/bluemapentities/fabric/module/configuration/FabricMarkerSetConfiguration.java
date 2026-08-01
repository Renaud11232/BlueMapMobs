package be.renaud11232.bluemapentities.fabric.module.configuration;

import be.renaud11232.bluemapentities.configuration.MarkerConfiguration;
import be.renaud11232.bluemapentities.configuration.MarkerSetConfiguration;

import java.util.Collections;
import java.util.List;

public class FabricMarkerSetConfiguration implements MarkerSetConfiguration {
    private String id;
    private String label;
    private Boolean toggleable;
    private Boolean default_hidden;
    private List<FabricMarkerConfiguration> markers;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean isToggleable() {
        return toggleable == null || toggleable;
    }

    @Override
    public boolean isHiddenByDefault() {
        return default_hidden == null || default_hidden;
    }

    @Override
    public List<MarkerConfiguration> getMarkers() {
        return markers == null ? Collections.emptyList() : markers.stream().map(m -> (MarkerConfiguration) m).toList();
    }
}
