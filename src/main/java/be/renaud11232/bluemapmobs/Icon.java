package be.renaud11232.bluemapmobs;

import com.flowpowered.math.vector.Vector2i;

public enum Icon {

    UNKNOWN("assets/bluemapmobs/unknown.png", new Vector2i(16, 16)),
    COMMAND_MINECART("assets/bluemapmobs/vehicles/minecart/command_block_minecart.png", new Vector2i(16, 16)),
    EXPLOSIVE_MINECART("assets/bluemapmobs/vehicles/minecart/tnt_minecart.png", new Vector2i(16, 16)),
    HOPPER_MINECART("assets/bluemapmobs/vehicles/minecart/hopper_minecart.png", new Vector2i(16, 16)),
    POWERED_MINECART("assets/bluemapmobs/vehicles/minecart/furnace_minecart.png", new Vector2i(16, 16)),
    RIDEABLE_MINECART("assets/bluemapmobs/vehicles/minecart/minecart.png", new Vector2i(16, 16)),
    STORAGE_MINECART("assets/bluemapmobs/vehicles/minecart/chest_minecart.png", new Vector2i(16, 16));

    private final String path;
    private final Vector2i anchor;

    Icon(String path, Vector2i anchor) {
        this.path = path;
        this.anchor = anchor;
    }

    public String getPath() {
        return path;
    }

    public Vector2i getAnchor() {
        return anchor;
    }

}
