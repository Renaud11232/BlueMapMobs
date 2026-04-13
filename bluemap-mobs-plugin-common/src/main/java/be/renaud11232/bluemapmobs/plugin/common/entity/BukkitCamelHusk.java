package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.CamelHusk;

public class BukkitCamelHusk extends BukkitAgeable<org.bukkit.entity.CamelHusk> implements CamelHusk {
    public BukkitCamelHusk(org.bukkit.entity.CamelHusk wrapped) {
        super(wrapped);
    }
}
