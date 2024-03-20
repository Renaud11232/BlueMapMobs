package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BlueMapMobs extends JavaPlugin {

    @Override
    public void onEnable() {
        BlueMapAPI.onEnable(api -> Bukkit.getScheduler().runTaskTimerAsynchronously(this, new MobUpdater(api), 0, 0));
        BlueMapAPI.onDisable(api -> Bukkit.getScheduler().cancelTasks(this));
    }
}
