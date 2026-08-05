package be.renaud11232.bluemapentitymarkers.entity;

import be.renaud11232.bluemapentitymarkers.MarkerType;
import be.renaud11232.bluemapentitymarkers.Position;

import java.util.UUID;

public interface Entity {
    UUID getUUID();

    String getName();

    Position getPosition();

    MarkerType getMarkerType();

    int getBlockLightLevel();

    int getSkyLightLevel();
}
