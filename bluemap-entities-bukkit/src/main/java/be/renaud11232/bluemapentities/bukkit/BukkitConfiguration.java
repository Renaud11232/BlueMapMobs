package be.renaud11232.bluemapentities.bukkit;

import be.renaud11232.bluemapentities.Configuration;
import be.renaud11232.bluemapentities.GeneralConfiguration;

import java.util.Map;
import java.util.stream.Collectors;

public class BukkitConfiguration implements Configuration {
    private final GeneralConfiguration general;

    public BukkitConfiguration(GeneralConfiguration general) {
        this.general = general;
    }

    @Override
    public GeneralConfiguration getGeneral() {
        return general == null ? new BukkitGeneralConfiguration() : general;
    }

    public static BukkitConfiguration deserialize(Map<String, Object> args) {
        Map<String, Object> generalValues = args.entrySet()
                .stream()
                .filter(entry -> entry.getKey().startsWith("general."))
                .collect(Collectors.toMap(entry -> entry.getKey().replace("general.", ""), Map.Entry::getValue));
        BukkitGeneralConfiguration general = BukkitGeneralConfiguration.deserialize(generalValues);
        return new BukkitConfiguration(general);
    }
}
