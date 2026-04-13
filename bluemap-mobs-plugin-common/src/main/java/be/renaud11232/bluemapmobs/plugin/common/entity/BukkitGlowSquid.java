package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.GlowSquid;

public class BukkitGlowSquid extends BukkitMob<org.bukkit.entity.GlowSquid> implements GlowSquid {
    public BukkitGlowSquid(org.bukkit.entity.GlowSquid wrapped) {
        super(wrapped);
    }
}
