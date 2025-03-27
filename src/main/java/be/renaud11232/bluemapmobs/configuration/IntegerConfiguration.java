package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface IntegerConfiguration extends Configuration<Integer> {
    @Override
    default Integer get(FileConfiguration config) {
        return config.getInt(getKey(), getDefaultValue());
    }
}
