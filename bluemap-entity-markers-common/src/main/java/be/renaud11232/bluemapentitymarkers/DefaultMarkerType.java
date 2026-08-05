package be.renaud11232.bluemapentitymarkers;

public enum DefaultMarkerType implements MarkerType {
    UNKNOWN;

    @Override
    public String getName() {
        return name();
    }
}
