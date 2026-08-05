package be.renaud11232.bluemapothermarkers.paper;

import be.renaud11232.bluemapentitymarkers.entity.Entity;
import be.renaud11232.bluemapothermarkers.bukkit.BukkitOtherConverter;
import be.renaud11232.bluemapothermarkers.paper.entity.PaperMannequin;
import org.bukkit.entity.Mannequin;

public class PaperOtherConverter extends BukkitOtherConverter {
    @Override
    public Entity convert(org.bukkit.entity.Entity entity) {
        return switch (entity) {
            case Mannequin mannequin -> new PaperMannequin(mannequin);
            default -> super.convert(entity);
        };
    }
}
