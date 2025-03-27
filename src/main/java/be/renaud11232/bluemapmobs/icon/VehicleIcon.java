package be.renaud11232.bluemapmobs.icon;

import be.renaud11232.bluemapmobs.Icon;
import com.flowpowered.math.vector.Vector2i;

public enum VehicleIcon implements Icon {
    CHEST_MINECART("assets/bluemapmobs/img/vehicles/minecart/chest_minecart.png", new Vector2i(12, 12)),
    COMMAND_BLOCK_MINECART("assets/bluemapmobs/img/vehicles/minecart/command_block_minecart.png", new Vector2i(12, 12)),
    FURNACE_MINECART("assets/bluemapmobs/img/vehicles/minecart/furnace_minecart.png", new Vector2i(12, 12)),
    HOPPER_MINECART("assets/bluemapmobs/img/vehicles/minecart/hopper_minecart.png", new Vector2i(12, 12)),
    MINECART("assets/bluemapmobs/img/vehicles/minecart/minecart.png", new Vector2i(12, 12)),
    SPAWNER_MINECART("assets/bluemapmobs/img/vehicles/minecart/spawner_minecart.png", new Vector2i(12, 12)),
    TNT_MINECART("assets/bluemapmobs/img/vehicles/minecart/tnt_minecart.png", new Vector2i(12, 12)),
    ACACIA_BOAT("assets/bluemapmobs/img/vehicles/boat/acacia_boat.png", new Vector2i(12, 12)),
    ACACIA_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/acacia_chest_boat.png", new Vector2i(12, 12)),
    BAMBOO_CHEST_RAFT("assets/bluemapmobs/img/vehicles/boat/bamboo_chest_raft.png", new Vector2i(12, 12)),
    BAMBOO_RAFT("assets/bluemapmobs/img/vehicles/boat/bamboo_raft.png", new Vector2i(12, 12)),
    BIRCH_BOAT("assets/bluemapmobs/img/vehicles/boat/birch_boat.png", new Vector2i(12, 12)),
    BIRCH_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/birch_chest_boat.png", new Vector2i(12, 12)),
    CHERRY_BOAT("assets/bluemapmobs/img/vehicles/boat/cherry_boat.png", new Vector2i(12, 12)),
    CHERRY_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/cherry_chest_boat.png", new Vector2i(12, 12)),
    DARK_OAK_BOAT("assets/bluemapmobs/img/vehicles/boat/dark_oak_boat.png", new Vector2i(12, 12)),
    DARK_OAK_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/dark_oak_chest_boat.png", new Vector2i(12, 12)),
    JUNGLE_BOAT("assets/bluemapmobs/img/vehicles/boat/jungle_boat.png", new Vector2i(12, 12)),
    JUNGLE_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/jungle_chest_boat.png", new Vector2i(12, 12)),
    MANGROVE_BOAT("assets/bluemapmobs/img/vehicles/boat/mangrove_boat.png", new Vector2i(12, 12)),
    MANGROVE_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/mangrove_chest_boat.png", new Vector2i(12, 12)),
    OAK_BOAT("assets/bluemapmobs/img/vehicles/boat/oak_boat.png", new Vector2i(12, 12)),
    OAK_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/oak_chest_boat.png", new Vector2i(12, 12)),
    SPRUCE_BOAT("assets/bluemapmobs/img/vehicles/boat/spruce_boat.png", new Vector2i(12, 12)),
    SPRUCE_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/spruce_chest_boat.png", new Vector2i(12, 12)),
    PALE_OAK_BOAT("assets/bluemapmobs/img/vehicles/boat/pale_oak_boat.png", new Vector2i(12, 12)),
    PALE_OAK_CHEST_BOAT("assets/bluemapmobs/img/vehicles/boat/pale_oak_chest_boat.png", new Vector2i(12, 12));

    private final String path;
    private final Vector2i anchor;

    VehicleIcon(String path, Vector2i anchor) {
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
