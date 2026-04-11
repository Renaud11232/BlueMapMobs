package be.renaud11232.bluemapentities.plugin.module.configuration;

import be.renaud11232.bluemapentities.module.configuration.MarkerConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@SerializableAs("MarkerConfiguration")
public class BukkitMarkerConfiguration implements MarkerConfiguration, ConfigurationSerializable {
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

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("type", type);
        if (maxDistance != null) {
            result.put("max_distance", maxDistance);
        }
        return result;
    }

    public static BukkitMarkerConfiguration deserialize(Map<String, Object> args) {
        String type = (String) args.get("type");
        Integer maxDistance = (Integer) args.get("max_distance");
        return new BukkitMarkerConfiguration(type, maxDistance);
    }
}
