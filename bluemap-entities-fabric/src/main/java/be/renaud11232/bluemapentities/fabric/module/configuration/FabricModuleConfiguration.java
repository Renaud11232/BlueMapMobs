package be.renaud11232.bluemapentities.fabric.module.configuration;

import be.renaud11232.bluemapentities.module.configuration.MarkerSetConfiguration;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;

import java.util.Collections;
import java.util.List;

public class FabricModuleConfiguration implements ModuleConfiguration {
    private List<FabricMarkerSetConfiguration> marker_sets;

    @Override
    public List<MarkerSetConfiguration> getMarkerSets() {
        return marker_sets == null ? Collections.emptyList() : marker_sets.stream().map(s -> (MarkerSetConfiguration) s).toList();
    }
}
