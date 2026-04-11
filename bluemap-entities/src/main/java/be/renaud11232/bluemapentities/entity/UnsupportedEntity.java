package be.renaud11232.bluemapentities.entity;

public interface UnsupportedEntity extends Entity {
    @Override
    default String getMarkerType() {
        return "unsupported";
    }
}
