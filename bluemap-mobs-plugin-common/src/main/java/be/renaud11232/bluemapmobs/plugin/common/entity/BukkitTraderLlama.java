package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.TraderLlama;

public class BukkitTraderLlama extends AbstractBukkitLlama<org.bukkit.entity.TraderLlama> implements TraderLlama {
    public BukkitTraderLlama(org.bukkit.entity.TraderLlama wrapped) {
        super(wrapped);
    }
}
