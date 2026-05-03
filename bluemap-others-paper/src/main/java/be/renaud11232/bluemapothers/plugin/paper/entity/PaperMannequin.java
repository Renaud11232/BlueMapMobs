package be.renaud11232.bluemapothers.plugin.paper.entity;

import be.renaud11232.bluemapothers.common.entity.BukkitLivingEntity;
import be.renaud11232.bluemapothers.entity.Mannequin;

public class PaperMannequin extends BukkitLivingEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public PaperMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
