package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.TraderLlama;

public class BukkitTraderLlama extends AbstractBukkitLlama<org.bukkit.entity.TraderLlama> implements TraderLlama {
    public BukkitTraderLlama(org.bukkit.entity.TraderLlama wrapped) {
        super(wrapped);
    }
}
