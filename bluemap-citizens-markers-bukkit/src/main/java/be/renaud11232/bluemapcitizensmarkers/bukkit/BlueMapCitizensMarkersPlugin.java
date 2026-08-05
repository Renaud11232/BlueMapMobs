package be.renaud11232.bluemapcitizensmarkers.bukkit;

import be.renaud11232.bluemapentitymarkers.bukkit.BukkitBlueMapEntityMarkersPlugin;
import be.renaud11232.bluemapentitymarkers.configuration.Configuration;
import be.renaud11232.bluemapentitymarkers.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;

public class BlueMapCitizensMarkersPlugin extends BukkitBlueMapEntityMarkersPlugin<NPC> {
    @Override
    public Module<World, NPC> provideModule(BlueMapAPI api, Configuration configuration) {
        return new CitizensModule(api, configuration);
    }
}
