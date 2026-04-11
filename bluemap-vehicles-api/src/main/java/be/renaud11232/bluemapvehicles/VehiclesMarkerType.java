package be.renaud11232.bluemapvehicles;

import be.renaud11232.bluemapentities.MarkerType;

public enum VehiclesMarkerType implements MarkerType {
    ACACIA_BOAT,
    ACACIA_CHEST_BOAT,
    BAMBOO_CHEST_RAFT,
    BAMBOO_RAFT,
    BIRCH_BOAT,
    BIRCH_CHEST_BOAT,
    CHERRY_BOAT,
    CHERRY_CHEST_BOAT,
    DARK_OAK_BOAT,
    DARK_OAK_CHEST_BOAT,
    JUNGLE_BOAT,
    JUNGLE_CHEST_BOAT,
    MANGROVE_BOAT,
    MANGROVE_CHEST_BOAT,
    OAK_BOAT,
    OAK_CHEST_BOAT,
    PALE_OAK_BOAT,
    PALE_OAK_CHEST_BOAT,
    SPRUCE_BOAT,
    SPRUCE_CHEST_BOAT,

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
