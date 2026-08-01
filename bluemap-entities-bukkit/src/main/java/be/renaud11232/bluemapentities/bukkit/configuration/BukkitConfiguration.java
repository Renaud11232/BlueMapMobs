package be.renaud11232.bluemapentities.bukkit.configuration;

import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.configuration.GeneralConfiguration;
import be.renaud11232.bluemapentities.configuration.MarkerSetConfiguration;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BukkitConfiguration implements Configuration {
    private final GeneralConfiguration general;
    private final List<BukkitMarkerSetConfiguration> markerSets;

    public BukkitConfiguration(GeneralConfiguration general, List<BukkitMarkerSetConfiguration> markerSets) {
        this.general = general;
        this.markerSets = markerSets;
    }

    @Override
    public GeneralConfiguration getGeneral() {
        return general == null ? new BukkitGeneralConfiguration() : general;
    }

    @Override
    public List<MarkerSetConfiguration> getMarkerSets() {
        return markerSets == null ? Collections.emptyList() : markerSets.stream().map(s -> (MarkerSetConfiguration) s).toList();
    }

    @SuppressWarnings("unchecked")
    public static BukkitConfiguration deserialize(Map<String, Object> args) {
        Map<String, Object> generalValues = args.entrySet()
                .stream()
                .filter(entry -> entry.getKey().startsWith("general."))
                .collect(Collectors.toMap(entry -> entry.getKey().replace("general.", ""), Map.Entry::getValue));
        BukkitGeneralConfiguration general = BukkitGeneralConfiguration.deserialize(generalValues);
        List<BukkitMarkerSetConfiguration> markerSets = Optional.ofNullable((List<Map<String, Object>>) args.get("marker_sets"))
                .map(list ->  list.stream().map(BukkitMarkerSetConfiguration::deserialize).toList())
                .orElse(null);
        return new BukkitConfiguration(general, markerSets);
    }
}
