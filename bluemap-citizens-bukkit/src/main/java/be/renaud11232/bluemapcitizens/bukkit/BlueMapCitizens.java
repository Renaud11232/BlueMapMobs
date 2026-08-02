package be.renaud11232.bluemapcitizens.bukkit;

import be.renaud11232.bluemapentities.bukkit.BukkitBlueMapEntitiesPlugin;
import be.renaud11232.bluemapentities.configuration.Configuration;
import be.renaud11232.bluemapentities.module.Module;
import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.World;

public class BlueMapCitizens extends BukkitBlueMapEntitiesPlugin<NPC> {
    @Override
    public Module<World, NPC> provideModule(BlueMapAPI api, Configuration configuration) {
        return new CitizensModule(api, configuration);
    }
}
