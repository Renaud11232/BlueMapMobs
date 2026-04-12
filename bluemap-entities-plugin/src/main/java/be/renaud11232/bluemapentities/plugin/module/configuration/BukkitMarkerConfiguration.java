package be.renaud11232.bluemapentities.plugin.module.configuration;

import be.renaud11232.bluemapentities.module.configuration.MarkerConfiguration;

import java.util.Map;
import java.util.Objects;

public class BukkitMarkerConfiguration implements MarkerConfiguration {
    private final String type;
    private final Integer maxDistance;

    public BukkitMarkerConfiguration(String type, Integer maxDistance) {
        this.type = Objects.requireNonNull(type);
        this.maxDistance = maxDistance;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance == null ? 1000 : maxDistance;
    }

    @Override
    public String getType() {
        return type;
    }

    public static BukkitMarkerConfiguration deserialize(Map<String, Object> args) {
        String type = (String) args.get("type");
        Integer maxDistance = (Integer) args.get("max_distance");
        return new BukkitMarkerConfiguration(type, maxDistance);
    }
}
