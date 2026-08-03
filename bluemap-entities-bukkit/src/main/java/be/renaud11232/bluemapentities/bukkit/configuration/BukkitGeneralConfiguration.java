package be.renaud11232.bluemapentities.bukkit.configuration;

import be.renaud11232.bluemapentities.configuration.GeneralConfiguration;

import java.util.Map;

public class BukkitGeneralConfiguration implements GeneralConfiguration {
    private final Integer minimumBlockLight;
    private final Integer minimumSkyLight;

    public BukkitGeneralConfiguration(Integer minimumBlockLight, Integer minimumSkyLight) {
        this.minimumBlockLight = minimumBlockLight;
        this.minimumSkyLight = minimumSkyLight;
    }

    public static BukkitGeneralConfiguration deserialize(Map<String, Object> args) {
        Integer minimumBlockLight = (Integer) args.get("minimum_block_light");
        Integer minimumSkyLight = (Integer) args.get("minimum_sky_light");
        return new BukkitGeneralConfiguration(minimumBlockLight, minimumSkyLight);
    }

    @Override
    public int getMinimumBlockLight() {
        return minimumBlockLight == null ? 4 : minimumBlockLight;
    }

    @Override
    public int getMinimumSkyLight() {
        return minimumSkyLight == null ? 1 : minimumSkyLight;
    }
}
