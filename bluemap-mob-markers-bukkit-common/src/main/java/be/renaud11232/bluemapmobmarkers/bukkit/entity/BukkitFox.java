package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Fox;

public class BukkitFox extends BukkitAgeable<org.bukkit.entity.Fox> implements Fox {
    public BukkitFox(org.bukkit.entity.Fox wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped.getFoxType()) {
            case RED -> Type.RED;
            case SNOW -> Type.SNOW;
        };
    }

    @Override
    public boolean isSleeping() {
        return wrapped.isSleeping();
    }
}
