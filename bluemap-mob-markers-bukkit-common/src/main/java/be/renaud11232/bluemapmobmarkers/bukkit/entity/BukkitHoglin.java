package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Hoglin;

public class BukkitHoglin extends BukkitAgeable<org.bukkit.entity.Hoglin> implements Hoglin {
    public BukkitHoglin(org.bukkit.entity.Hoglin wrapped) {
        super(wrapped);
    }
}
