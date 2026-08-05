package be.renaud11232.bluemapothermarkers.spigot;

import be.renaud11232.bluemapentitymarkers.entity.Entity;
import be.renaud11232.bluemapothermarkers.bukkit.BukkitOtherConverter;
import be.renaud11232.bluemapothermarkers.spigot.entity.SpigotMannequin;
import org.bukkit.entity.Mannequin;

public class SpigotOtherConverter extends BukkitOtherConverter {
    @Override
    public Entity convert(org.bukkit.entity.Entity entity) {
        return switch (entity) {
            case Mannequin mannequin -> new SpigotMannequin(mannequin);
            default -> super.convert(entity);
        };
    }
}
