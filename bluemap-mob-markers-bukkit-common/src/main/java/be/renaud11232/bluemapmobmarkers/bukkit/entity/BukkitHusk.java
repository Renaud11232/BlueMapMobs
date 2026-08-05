package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Husk;

public class BukkitHusk extends BukkitAgeable<org.bukkit.entity.Husk> implements Husk {
    public BukkitHusk(org.bukkit.entity.Husk wrapped) {
        super(wrapped);
    }
}
