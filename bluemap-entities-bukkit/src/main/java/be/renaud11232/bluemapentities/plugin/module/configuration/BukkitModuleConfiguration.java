package be.renaud11232.bluemapentities.plugin.module.configuration;

import be.renaud11232.bluemapentities.module.configuration.MarkerSetConfiguration;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;

import java.util.*;

public class BukkitModuleConfiguration implements ModuleConfiguration {
    private final List<BukkitMarkerSetConfiguration> markerSets;

    public BukkitModuleConfiguration(List<BukkitMarkerSetConfiguration> markerSets) {
        this.markerSets = markerSets;
    }

    @Override
    public List<MarkerSetConfiguration> getMarkerSets() {
        return markerSets == null ? Collections.emptyList() : markerSets.stream().map(s -> (MarkerSetConfiguration) s).toList();
    }

    @SuppressWarnings("unchecked")
    public static BukkitModuleConfiguration deserialize(Map<String, Object> args) {
        List<BukkitMarkerSetConfiguration> markerSets = Optional.ofNullable((List<Map<String, Object>>) args.get("marker_sets"))
                .map(list ->  list.stream().map(BukkitMarkerSetConfiguration::deserialize).toList())
                .orElse(null);
        return new BukkitModuleConfiguration(markerSets);
    }
}
