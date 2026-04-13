package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.PiglinBrute;

public class BukkitPiglinBrute extends BukkitMob<org.bukkit.entity.PiglinBrute> implements PiglinBrute {
    public BukkitPiglinBrute(org.bukkit.entity.PiglinBrute wrapped) {
        super(wrapped);
    }
}
