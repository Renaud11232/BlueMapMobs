package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Creeper;

public class BukkitCreeper extends BukkitMob<org.bukkit.entity.Creeper> implements Creeper {
    public BukkitCreeper(org.bukkit.entity.Creeper wrapped) {
        super(wrapped);
    }

    @Override
    public boolean isPowered() {
        return wrapped.isPowered();
    }
}
