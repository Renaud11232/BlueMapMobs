package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Strider;

public class BukkitStrider extends BukkitAgeable<org.bukkit.entity.Strider> implements Strider {
    public BukkitStrider(org.bukkit.entity.Strider wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isShivering() {
        return wrapped.isShivering();
    }
}
