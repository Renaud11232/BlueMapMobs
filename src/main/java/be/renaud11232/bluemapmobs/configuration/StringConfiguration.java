package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface StringConfiguration extends TypedConfiguration<String> {
    @Override
    default String get(FileConfiguration config) {
        return config.getString(getKey(), getDefaultValue());
    }
}
