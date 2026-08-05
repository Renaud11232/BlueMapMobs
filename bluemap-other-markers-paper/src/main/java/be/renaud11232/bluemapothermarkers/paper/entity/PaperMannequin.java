package be.renaud11232.bluemapothermarkers.paper.entity;

import be.renaud11232.bluemapothermarkers.bukkit.entity.BukkitLivingEntity;
import be.renaud11232.bluemapothermarkers.entity.Mannequin;

public class PaperMannequin extends BukkitLivingEntity<org.bukkit.entity.Mannequin> implements Mannequin {
    public PaperMannequin(org.bukkit.entity.Mannequin wrapped) {
        super(wrapped);
    }
}
