package be.renaud11232.bluemapentities.plugin.module.configuration;

import be.renaud11232.bluemapentities.module.configuration.MarkerSetConfiguration;
import be.renaud11232.bluemapentities.module.configuration.ModuleConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SerializableAs("ModuleConfiguration")
public class BukkitModuleConfiguration implements ModuleConfiguration, ConfigurationSerializable {
    private final List<BukkitMarkerSetConfiguration> markerSets;

    public BukkitModuleConfiguration(List<BukkitMarkerSetConfiguration> markerSets) {
        this.markerSets = markerSets;
    }

    @Override
    public List<? extends MarkerSetConfiguration> getMarkerSets() {
        return markerSets == null ? List.of() : markerSets;
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> result = new LinkedHashMap<>();
        if (markerSets != null) {
            result.put("marker_sets", markerSets.stream().map(BukkitMarkerSetConfiguration::serialize).toList());
        }
        return result;
    }

    public static BukkitModuleConfiguration deserialize(Map<String, Object> args) {
        List<BukkitMarkerSetConfiguration> markerSets = Optional.ofNullable((List<Map<String, Object>>) args.get("marker_sets"))
                .map(list ->  list.stream().map(BukkitMarkerSetConfiguration::deserialize).toList())
                .orElse(null);
        return new BukkitModuleConfiguration(markerSets);
    }
}
