package be.renaud11232.bluemapentities.fabric;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.Configuration;
import de.bluecolored.bluemap.api.BlueMapAPI;

import java.util.Collection;
import java.util.List;
import java.util.stream.StreamSupport;

public class FabricBlueMapEntitiesAPI extends BlueMapEntitiesAPI {
    protected FabricBlueMapEntitiesAPI(BlueMapAPI api, Configuration configuration) {
        super(api, configuration);
    }

    @Override
    public Collection<?> getWorlds() {
        return FabricBlueMapEntities.getServer()
                .map(s -> StreamSupport.stream(s.getAllLevels().spliterator(), false).toList())
                .orElseGet(List::of);
    }
}
