package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Panda;

public class BukkitPanda extends BukkitAgeable<org.bukkit.entity.Panda> implements Panda {
    public BukkitPanda(org.bukkit.entity.Panda wrapped) {
        super(wrapped);
    }

    private static Gene mapGene(org.bukkit.entity.Panda.Gene gene) {
        return switch (gene) {
            case NORMAL -> Gene.NORMAL;
            case LAZY -> Gene.LAZY;
            case WORRIED -> Gene.WORRIED;
            case PLAYFUL -> Gene.PLAYFUL;
            case BROWN -> Gene.BROWN;
            case WEAK -> Gene.WEAK;
            case AGGRESSIVE -> Gene.AGGRESSIVE;
        };
    }

    @Override
    public Gene getMainGene() {
        return mapGene(wrapped.getMainGene());
    }

    @Override
    public Gene getHiddenGene() {
        return mapGene(wrapped.getHiddenGene());
    }
}
