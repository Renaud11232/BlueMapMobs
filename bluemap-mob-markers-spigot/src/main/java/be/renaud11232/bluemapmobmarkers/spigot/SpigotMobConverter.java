package be.renaud11232.bluemapmobmarkers.spigot;

import be.renaud11232.bluemapmobmarkers.bukkit.BukkitCommonMobConverter;
import be.renaud11232.bluemapmobmarkers.entity.Mob;
import be.renaud11232.bluemapmobmarkers.spigot.entity.SpigotCopperGolem;
import org.bukkit.entity.CopperGolem;

public class SpigotMobConverter extends BukkitCommonMobConverter {
    @Override
    public Mob convert(org.bukkit.entity.Mob mob) {
        return switch (mob) {
            case CopperGolem copperGolem -> new SpigotCopperGolem(copperGolem);
            default -> super.convert(mob);
        };
    }
}
