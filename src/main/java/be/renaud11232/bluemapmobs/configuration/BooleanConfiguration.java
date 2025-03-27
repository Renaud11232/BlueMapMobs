package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface BooleanConfiguration extends Configuration<Boolean> {
    @Override
    default Boolean get(FileConfiguration config) {
        return config.getBoolean(getKey(), getDefaultValue());
    }
}
