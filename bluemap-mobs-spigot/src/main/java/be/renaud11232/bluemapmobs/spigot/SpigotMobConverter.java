package be.renaud11232.bluemapmobs.spigot;

import be.renaud11232.bluemapmobs.bukkit.BukkitCommonMobConverter;
import be.renaud11232.bluemapmobs.entity.Mob;
import be.renaud11232.bluemapmobs.spigot.entity.SpigotCopperGolem;
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
