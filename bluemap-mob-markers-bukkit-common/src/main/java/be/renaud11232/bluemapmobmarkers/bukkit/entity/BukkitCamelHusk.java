package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.CamelHusk;

public class BukkitCamelHusk extends BukkitAgeable<org.bukkit.entity.CamelHusk> implements CamelHusk {
    public BukkitCamelHusk(org.bukkit.entity.CamelHusk wrapped) {
        super(wrapped);
    }
}
