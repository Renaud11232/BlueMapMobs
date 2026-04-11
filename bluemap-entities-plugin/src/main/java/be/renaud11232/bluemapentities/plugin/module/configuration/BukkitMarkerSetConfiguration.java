package be.renaud11232.bluemapentities.plugin.module.configuration;

import be.renaud11232.bluemapentities.module.configuration.MarkerConfiguration;
import be.renaud11232.bluemapentities.module.configuration.MarkerSetConfiguration;

import java.util.*;

public class BukkitMarkerSetConfiguration implements MarkerSetConfiguration {
    private final String id;
    private final String label;
    private final Boolean toggleable;
    private final Boolean hiddenByDefault;
    private final List<BukkitMarkerConfiguration> markers;

    public BukkitMarkerSetConfiguration(String id, String label, Boolean toggleable, Boolean hiddenByDefault, List<BukkitMarkerConfiguration> markers) {
        this.id = Objects.requireNonNull(id);
        this.label = Objects.requireNonNull(label);
        this.toggleable = toggleable;
        this.hiddenByDefault = hiddenByDefault;
        this.markers = markers;
    }

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
        return hiddenByDefault == null || hiddenByDefault;
    }

    @Override
    public List<MarkerConfiguration> getMarkers() {
        return markers == null ? Collections.emptyList() : markers.stream().map(m -> (MarkerConfiguration) m).toList();
    }

    @SuppressWarnings("unchecked")
    public static BukkitMarkerSetConfiguration deserialize(Map<String, Object> args) {
        String id = (String) args.get("id");
        String label = (String) args.get("label");
        Boolean toggleable = (Boolean) args.get("toggleable");
        Boolean hiddenByDefault = (Boolean) args.get("default_hidden");
        List<BukkitMarkerConfiguration> markers = Optional.ofNullable((List<Map<String, Object>>) args.get("markers"))
                .map(list -> list.stream().map(BukkitMarkerConfiguration::deserialize).toList())
                .orElse(null);
        return new BukkitMarkerSetConfiguration(id, label, toggleable, hiddenByDefault, markers);
    }
}
