package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface DoubleConfiguration extends TypedConfiguration<Double> {
    @Override
    default Double get(FileConfiguration config) {
        return config.getDouble(getKey(), getDefaultValue());
    }
}
