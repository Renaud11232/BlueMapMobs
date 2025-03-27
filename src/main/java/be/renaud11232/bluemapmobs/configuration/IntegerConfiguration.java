package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface IntegerConfiguration extends Configuration<Integer> {
    @Override
    default Integer get(FileConfiguration config, FileConfiguration defaultConfig) {
        return config.getInt(getKey(), defaultConfig.getInt(getKey(), 0));
    }
}
