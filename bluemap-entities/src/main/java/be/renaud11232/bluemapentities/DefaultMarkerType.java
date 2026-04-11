package be.renaud11232.bluemapentities;

public enum DefaultMarkerType implements MarkerType {
    UNKNOWN;

    @Override
    public String getName() {
        return name();
    }
}
