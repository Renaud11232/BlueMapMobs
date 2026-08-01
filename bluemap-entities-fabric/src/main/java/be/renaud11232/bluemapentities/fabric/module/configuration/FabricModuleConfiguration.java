package be.renaud11232.bluemapentities.fabric.module.configuration;

import be.renaud11232.bluemapentities.configuration.MarkerSetConfiguration;
import be.renaud11232.bluemapentities.configuration.ModuleConfiguration;

import java.util.Collections;
import java.util.List;

public class FabricModuleConfiguration implements ModuleConfiguration {
    private List<FabricMarkerSetConfiguration> marker_sets;

    @Override
    public List<MarkerSetConfiguration> getMarkerSets() {
        return marker_sets == null ? Collections.emptyList() : marker_sets.stream().map(s -> (MarkerSetConfiguration) s).toList();
    }
}
