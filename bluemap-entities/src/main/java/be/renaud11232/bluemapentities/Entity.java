package be.renaud11232.bluemapentities;

import java.util.UUID;

public interface Entity {
    UUID getUUID();
    String getName();
    Position getPosition();
}
