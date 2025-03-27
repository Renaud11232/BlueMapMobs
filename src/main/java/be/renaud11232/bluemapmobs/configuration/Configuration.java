package be.renaud11232.bluemapmobs.configuration;

import org.bukkit.configuration.file.FileConfiguration;

public interface Configuration<T> {
    String getKey();
    T get(FileConfiguration config, FileConfiguration defaultConfig);
}
