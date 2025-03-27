package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;

//TODO: remove this
public enum VehicleMarkerVisibilityConfiguration implements BooleanConfiguration {
    BOAT("marker_sets.vehicles.markers.types.boat", true),
    CHEST_BOAT("marker_sets.vehicles.markers.types.chest_boat", true),
    COMMAND_MINECART("marker_sets.vehicles.markers.types.command_minecart", true),
    EXPLOSIVE_MINECART("marker_sets.vehicles.markers.types.explosive_minecart", true),
    HOPPER_MINECART("marker_sets.vehicles.markers.types.hopper_minecart", true),
    POWERED_MINECART("marker_sets.vehicles.markers.types.powered_minecart", true),
    RIDEABLE_MINECART("marker_sets.vehicles.markers.types.rideable_minecart", true),
    SPAWNER_MINECART("marker_sets.vehicles.markers.types.spawner_minecart", true),
    STORAGE_MINECART("marker_sets.vehicles.markers.types.storage_minecart", true);

    private final String key;
    private final boolean defaultValue;

    VehicleMarkerVisibilityConfiguration(String key, boolean defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Boolean getDefaultValue() {
        return defaultValue;
    }
}
