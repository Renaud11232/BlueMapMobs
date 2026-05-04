package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Husk;

public class BukkitHusk extends BukkitAgeable<org.bukkit.entity.Husk> implements Husk {
    public BukkitHusk(org.bukkit.entity.Husk wrapped) {
        super(wrapped);
    }
}
