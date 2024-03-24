package be.renaud11232.bluemapmobs;

import com.flowpowered.math.vector.Vector2i;

public enum Icon {

    UNKNOWN("assets/bluemapmobs/unknown.png", new Vector2i(16, 16)),

    CHEST_MINECART("assets/bluemapmobs/vehicles/minecart/chest_minecart.png", new Vector2i(16, 16)),
    COMMAND_BLOCK_MINECART("assets/bluemapmobs/vehicles/minecart/command_block_minecart.png", new Vector2i(16, 16)),
    FURNACE_MINECART("assets/bluemapmobs/vehicles/minecart/furnace_minecart.png", new Vector2i(16, 16)),
    HOPPER_MINECART("assets/bluemapmobs/vehicles/minecart/hopper_minecart.png", new Vector2i(16, 16)),
    MINECART("assets/bluemapmobs/vehicles/minecart/minecart.png", new Vector2i(16, 16)),
    SPAWNER_MINECART("assets/bluemapmobs/vehicles/minecart/spawner_minecart.png", new Vector2i(16, 16)),
    TNT_MINECART("assets/bluemapmobs/vehicles/minecart/tnt_minecart.png", new Vector2i(16, 16)),

    ACACIA_BOAT("assets/bluemapmobs/vehicles/boat/acacia_boat.png", new Vector2i(16, 16)),
    ACACIA_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/acacia_chest_boat.png", new Vector2i(16, 16)),
    BAMBOO_CHEST_RAFT("assets/bluemapmobs/vehicles/boat/bamboo_chest_raft.png", new Vector2i(16, 16)),
    BAMBOO_RAFT("assets/bluemapmobs/vehicles/boat/bamboo_raft.png", new Vector2i(16, 16)),
    BIRCH_BOAT("assets/bluemapmobs/vehicles/boat/birch_boat.png", new Vector2i(16, 16)),
    BIRCH_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/birch_chest_boat.png", new Vector2i(16, 16)),
    CHERRY_BOAT("assets/bluemapmobs/vehicles/boat/cherry_boat.png", new Vector2i(16, 16)),
    CHERRY_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/cherry_chest_boat.png", new Vector2i(16, 16)),
    DARK_OAK_BOAT("assets/bluemapmobs/vehicles/boat/dark_oak_boat.png", new Vector2i(16, 16)),
    DARK_OAK_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/dark_oak_chest_boat.png", new Vector2i(16, 16)),
    JUNGLE_BOAT("assets/bluemapmobs/vehicles/boat/jungle_boat.png", new Vector2i(16, 16)),
    JUNGLE_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/jungle_chest_boat.png", new Vector2i(16, 16)),
    MANGROVE_BOAT("assets/bluemapmobs/vehicles/boat/mangrove_boat.png", new Vector2i(16, 16)),
    MANGROVE_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/mangrove_chest_boat.png", new Vector2i(16, 16)),
    OAK_BOAT("assets/bluemapmobs/vehicles/boat/oak_boat.png", new Vector2i(16, 16)),
    OAK_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/oak_chest_boat.png", new Vector2i(16, 16)),
    SPRUCE_BOAT("assets/bluemapmobs/vehicles/boat/spruce_boat.png", new Vector2i(16, 16)),
    SPRUCE_CHEST_BOAT("assets/bluemapmobs/vehicles/boat/spruce_chest_boat.png", new Vector2i(16, 16));

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
