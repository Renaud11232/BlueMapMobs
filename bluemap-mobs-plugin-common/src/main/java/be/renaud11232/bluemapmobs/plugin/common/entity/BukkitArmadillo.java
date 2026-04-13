package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Armadillo;

public class BukkitArmadillo extends BukkitAgeable<org.bukkit.entity.Armadillo> implements Armadillo {
    public BukkitArmadillo(org.bukkit.entity.Armadillo wrapped) {
        super(wrapped);
    }
}
