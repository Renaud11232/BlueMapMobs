package be.renaud11232.bluemapvehiclemarkers;

import be.renaud11232.bluemapentitymarkers.MarkerType;

public enum VehicleMarkerType implements MarkerType {
    CHEST_RAFT,
    RAFT,
    RIDEABLE_BOAT,
    RIDEABLE_CHEST_BOAT,

    COMMAND_MINECART,
    EXPLOSIVE_MINECART,
    HOPPER_MINECART,
    POWERED_MINECART,
    RIDEABLE_MINECART,
    SPAWNER_MINECART,
    STORAGE_MINECART;

    @Override
    public String getName() {
        return name();
    }
}
