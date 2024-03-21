package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class BlueMapMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        BlueMapAPI.onEnable(api -> {
            getLogger().info("Scheduling MobUpdater task");
            Bukkit.getScheduler().runTaskTimer(this, new MobUpdateScheduler(this, api), 0, 40);
            getLogger().info("MobUpdater task scheduled");
        });
        BlueMapAPI.onDisable(api -> {
            getLogger().info("Cancelling tasks");
            Bukkit.getScheduler().cancelTasks(this);
            getLogger().info("Tasks cancelled");
        });
    }
}
