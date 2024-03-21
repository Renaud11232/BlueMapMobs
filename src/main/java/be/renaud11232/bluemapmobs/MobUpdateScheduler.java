package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;

public class MobUpdateScheduler implements Runnable {

    private final BlueMapMobs plugin;
    private final BlueMapAPI api;

    public MobUpdateScheduler(BlueMapMobs plugin, BlueMapAPI api) {
        this.plugin = plugin;
        this.api = api;
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> Bukkit.getScheduler().runTaskAsynchronously(plugin, new WorldMobUpdater(api, world, world.getLivingEntities())));
    }
}
