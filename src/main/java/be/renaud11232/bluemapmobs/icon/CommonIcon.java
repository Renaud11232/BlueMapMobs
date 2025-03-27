package be.renaud11232.bluemapmobs.icon;

import be.renaud11232.bluemapmobs.Icon;
import com.flowpowered.math.vector.Vector2i;

//TODO: Merge them back into one nested class hierarchy ?
public enum CommonIcon implements Icon {
    UNKNOWN("assets/bluemapmobs/img/unknown.png", new Vector2i(12, 12));

    private final String path;
    private final Vector2i anchor;

    CommonIcon(String path, Vector2i anchor) {
        this.path = path;
        this.anchor = anchor;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public Vector2i getAnchor() {
        return anchor;
    }
}
