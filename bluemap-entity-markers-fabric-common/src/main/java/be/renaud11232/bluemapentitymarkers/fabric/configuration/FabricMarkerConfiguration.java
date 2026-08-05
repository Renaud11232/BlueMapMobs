package be.renaud11232.bluemapentitymarkers.fabric.configuration;

import be.renaud11232.bluemapentitymarkers.configuration.MarkerConfiguration;

public class FabricMarkerConfiguration implements MarkerConfiguration {
    private String type;
    private Integer max_distance;

    @Override
    public int getMaxDistance() {
        return max_distance == null ? 1000 : max_distance;
    }

    @Override
    public String getType() {
        return type;
    }
}
