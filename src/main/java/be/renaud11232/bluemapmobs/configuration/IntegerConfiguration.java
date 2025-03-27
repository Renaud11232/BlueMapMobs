package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface IntegerConfiguration extends TypedConfiguration<Integer> {
    @Override
    default Integer get(FileConfiguration config) {
        return config.getInt(getKey(), getDefaultValue());
    }
}
