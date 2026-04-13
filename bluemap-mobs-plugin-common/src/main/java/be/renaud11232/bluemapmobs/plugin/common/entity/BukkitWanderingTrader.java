package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.WanderingTrader;

public class BukkitWanderingTrader extends BukkitAgeable<org.bukkit.entity.WanderingTrader> implements WanderingTrader {
    public BukkitWanderingTrader(org.bukkit.entity.WanderingTrader wrapped) {
        super(wrapped);
    }
}
