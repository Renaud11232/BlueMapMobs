package be.renaud11232.bluemapmobs.icon.impl;

import be.renaud11232.bluemapmobs.icon.Icon;
import com.flowpowered.math.vector.Vector2i;

public class SimpleIcon implements Icon {
    private final String path;
    private final Vector2i anchor;

    public SimpleIcon(String path, Vector2i anchor) {
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
