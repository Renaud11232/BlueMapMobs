package be.renaud11232.bluemapentities.fabric.configuration;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.configuration.GeneralConfiguration;
import be.renaud11232.bluemapentities.configuration.MarkerSetConfiguration;

import java.util.Collections;
import java.util.List;

public class FabricConfiguration implements Configuration {
    private FabricGeneralConfiguration general;
    private List<FabricMarkerSetConfiguration> marker_sets;

    @Override
    public GeneralConfiguration getGeneral() {
        return general == null ? new FabricGeneralConfiguration() : general;
    }

    @Override
    public List<MarkerSetConfiguration> getMarkerSets() {
        return marker_sets == null ? Collections.emptyList() : marker_sets.stream().map(s -> (MarkerSetConfiguration) s).toList();
    }
}
