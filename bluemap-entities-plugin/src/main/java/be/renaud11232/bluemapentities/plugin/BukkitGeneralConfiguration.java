package be.renaud11232.bluemapentities.plugin;

import be.renaud11232.bluemapentities.GeneralConfiguration;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.configuration.serialization.SerializableAs;

import java.util.LinkedHashMap;
import java.util.Map;

@SerializableAs("GeneralConfiguration")
public class BukkitGeneralConfiguration implements GeneralConfiguration, ConfigurationSerializable {
    private final Integer minimumBlockLight;
    private final Integer minimumSkyLight;

    public BukkitGeneralConfiguration(Integer minimumBlockLight, Integer minimumSkyLight) {
        this.minimumBlockLight = minimumBlockLight;
        this.minimumSkyLight = minimumSkyLight;
    }

    @Override
    public int getMinimumBlockLight() {
        return minimumBlockLight == null ? 4 : minimumBlockLight;
    }

    @Override
    public int getMinimumSkyLight() {
        return minimumSkyLight == null ? 1 : minimumSkyLight;
    }

    @Override
    public Map<String, Object> serialize() {
        Map<String, Object> result = new LinkedHashMap<>();
        if (minimumBlockLight != null) {
            result.put("minimum_block_light", minimumBlockLight);
        }
        if (minimumSkyLight != null) {
            result.put("minimum_sky_light", minimumSkyLight);
        }
        return result;
    }

    public static BukkitGeneralConfiguration deserialize(Map<String, Object> args) {
        Integer minimumBlockLight = (Integer) args.get("minimum_block_light");
        Integer minimumSkyLight = (Integer) args.get("minimum_sky_light");
        return new BukkitGeneralConfiguration(minimumBlockLight, minimumSkyLight);
    }
}
