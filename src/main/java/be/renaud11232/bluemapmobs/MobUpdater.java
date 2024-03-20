package be.renaud11232.bluemapmobs;

import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.BlueMapWorld;
import org.bukkit.Bukkit;

public class MobUpdater implements Runnable {

    private final BlueMapAPI api;

    public MobUpdater(BlueMapAPI api) {
        this.api = api;
    }

    @Override
    public void run() {
        Bukkit.getServer().getWorlds().forEach(world -> {
            BlueMapWorld blueMapWorld = api.getWorld(world).orElse(null);
            if(blueMapWorld == null) {
                return;
            }
            blueMapWorld.getMaps().forEach(map -> {

            });
        });
    }
}
