package be.renaud11232.bluemapothers.spigot;

import be.renaud11232.bluemapentities.entity.Entity;
import be.renaud11232.bluemapothers.bukkit.BukkitOthersConverter;
import be.renaud11232.bluemapothers.spigot.entity.SpigotMannequin;
import org.bukkit.entity.Mannequin;

public class SpigotOthersConverter extends BukkitOthersConverter {
    @Override
    public Entity convert(org.bukkit.entity.Entity entity) {
        return switch (entity) {
            case Mannequin mannequin -> new SpigotMannequin(mannequin);
            default -> super.convert(entity);
        };
    }
}
