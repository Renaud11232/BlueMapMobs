package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Hoglin;

public class BukkitHoglin extends BukkitAgeable<org.bukkit.entity.Hoglin> implements Hoglin {
    public BukkitHoglin(org.bukkit.entity.Hoglin wrapped) {
        super(wrapped);
    }
}
