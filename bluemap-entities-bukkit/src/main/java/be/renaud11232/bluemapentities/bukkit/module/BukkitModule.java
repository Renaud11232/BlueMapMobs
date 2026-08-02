package be.renaud11232.bluemapentities.bukkit.module;

import be.renaud11232.bluemapentities.module.Module;
import org.bukkit.Bukkit;
import org.bukkit.World;

import java.util.Collection;

public interface BukkitModule<SOURCE_ENTITY_TYPE> extends Module<World, SOURCE_ENTITY_TYPE> {
    @Override
    default Collection<World> getWorlds() {
        return Bukkit.getWorlds();
    }
}
