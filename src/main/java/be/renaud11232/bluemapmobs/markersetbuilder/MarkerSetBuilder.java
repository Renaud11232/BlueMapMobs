package be.renaud11232.bluemapmobs.markersetbuilder;

import de.bluecolored.bluemap.api.markers.MarkerSet;
import org.bukkit.entity.Entity;

public interface MarkerSetBuilder<T extends Entity> {

    MarkerSet build();
    String getKey();

}
