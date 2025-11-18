package be.renaud11232.bluemapmobs.markerbuilder;

import de.bluecolored.bluemap.api.BlueMapAPI;
import net.citizensnpcs.api.npc.NPC;
import org.bukkit.configuration.file.FileConfiguration;

public abstract class AbstractSingleVariantNPCMarkerBuilder<V> extends AbstractVariantNPCMarkerBuilder<V, V> implements SingleVariantMarkerBuilder<NPC, V> {
    public AbstractSingleVariantNPCMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }
}
