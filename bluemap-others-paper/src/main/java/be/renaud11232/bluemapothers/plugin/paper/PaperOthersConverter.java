package be.renaud11232.bluemapothers.plugin.paper;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapothers.common.BukkitOthersConverter;
import be.renaud11232.bluemapothers.plugin.paper.entity.PaperMannequin;
import org.bukkit.entity.Mannequin;

public class PaperOthersConverter extends BukkitOthersConverter {
    @Override
    public Entity convert(org.bukkit.entity.Entity entity) {
        return switch (entity) {
            case Mannequin mannequin -> new PaperMannequin(mannequin);
            default -> super.convert(entity);
        };
    }
}
