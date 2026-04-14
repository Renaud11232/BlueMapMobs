package be.renaud11232.bluemapothers.plugin.paper.entity;

import be.renaud11232.bluemapothers.entity.Mannequin;
import be.renaud11232.bluemapothers.common.entity.BukkitEntity;

public class PaperMannequin extends BukkitEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public PaperMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
