package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Cat;

import java.util.HashMap;
import java.util.Map;

public class BukkitCat extends BukkitAgeable<org.bukkit.entity.Cat> implements Cat {
    private static final Map<org.bukkit.entity.Cat.Type, Type> TYPE_MAP = new HashMap<>();

    static {
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.TABBY, Type.TABBY);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.BLACK, Type.BLACK);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.RED, Type.RED);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.SIAMESE, Type.SIAMESE);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.BRITISH_SHORTHAIR, Type.BRITISH_SHORTHAIR);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.CALICO, Type.CALICO);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.PERSIAN, Type.PERSIAN);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.RAGDOLL, Type.RAGDOLL);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.WHITE, Type.WHITE);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.JELLIE, Type.JELLIE);
        TYPE_MAP.put(org.bukkit.entity.Cat.Type.ALL_BLACK, Type.ALL_BLACK);
    }

    public BukkitCat(org.bukkit.entity.Cat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return TYPE_MAP.get(wrapped.getCatType());
    }
}
