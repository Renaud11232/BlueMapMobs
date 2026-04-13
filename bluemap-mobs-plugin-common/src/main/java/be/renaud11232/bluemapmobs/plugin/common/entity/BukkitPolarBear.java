package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.PolarBear;

public class BukkitPolarBear extends BukkitAgeable<org.bukkit.entity.PolarBear> implements PolarBear {
    public BukkitPolarBear(org.bukkit.entity.PolarBear wrapped) {
        super(wrapped);
    }
}
