package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Cat;

public class BukkitCat extends BukkitAgeable<org.bukkit.entity.Cat> implements Cat {
    public BukkitCat(org.bukkit.entity.Cat wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        var type = wrapped.getCatType();
        if (type.equals(org.bukkit.entity.Cat.Type.TABBY)) {
            return Type.TABBY;
        } else if (type.equals(org.bukkit.entity.Cat.Type.BLACK)) {
            return Type.BLACK;
        } else if (type.equals(org.bukkit.entity.Cat.Type.RED)) {
            return Type.RED;
        } else if (type.equals(org.bukkit.entity.Cat.Type.SIAMESE)) {
            return Type.SIAMESE;
        } else if (type.equals(org.bukkit.entity.Cat.Type.BRITISH_SHORTHAIR)) {
            return Type.BRITISH_SHORTHAIR;
        } else if (type.equals(org.bukkit.entity.Cat.Type.CALICO)) {
            return Type.CALICO;
        } else if (type.equals(org.bukkit.entity.Cat.Type.PERSIAN)) {
            return Type.PERSIAN;
        } else if (type.equals(org.bukkit.entity.Cat.Type.RAGDOLL)) {
            return Type.RAGDOLL;
        } else if (type.equals(org.bukkit.entity.Cat.Type.WHITE)) {
            return Type.WHITE;
        } else if (type.equals(org.bukkit.entity.Cat.Type.JELLIE)) {
            return Type.JELLIE;
        } else if (type.equals(org.bukkit.entity.Cat.Type.ALL_BLACK)) {
            return Type.ALL_BLACK;
        } else {
            return null;
        }
    }
}
