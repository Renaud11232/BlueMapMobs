package be.renaud11232.bluemapentities.entity;

import be.renaud11232.bluemapentities.MarkerType;
import be.renaud11232.bluemapentities.Position;

import java.util.UUID;

public interface Entity {
    UUID getUUID();
    String getName();
    Position getPosition();
    MarkerType getMarkerType();
    int getBlockLightLevel();
    int getSkyLightLevel();
}
