package be.renaud11232.bluemapentities.bukkit;

import be.renaud11232.bluemapentities.Configuration;
import be.renaud11232.bluemapentities.GeneralConfiguration;

import java.util.Map;
import java.util.Optional;

public class BukkitConfiguration implements Configuration {
    private final GeneralConfiguration general;

    public BukkitConfiguration(GeneralConfiguration general) {
        this.general = general;
    }

    @Override
    public GeneralConfiguration getGeneral() {
        return general == null ? new BukkitGeneralConfiguration() : general;
    }

    @SuppressWarnings("unchecked")
    public static BukkitConfiguration deserialize(Map<String, Object> args) {
        BukkitGeneralConfiguration general = Optional.ofNullable((Map<String, Object>) args.get("general"))
                .map(BukkitGeneralConfiguration::deserialize)
                .orElse(null);
        return new BukkitConfiguration(general);
    }
}
