package be.renaud11232.bluemapcitizens;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class BlueMapCitizens extends JavaPlugin {
    @Override
    public void onEnable() {
        BlueMapEntitiesAPI.onEnable(api -> {
            api.registerModule(new CitizensModule());
        });
    }
}
