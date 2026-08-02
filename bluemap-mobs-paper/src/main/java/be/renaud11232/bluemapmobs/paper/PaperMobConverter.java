package be.renaud11232.bluemapmobs.paper;

import be.renaud11232.bluemapmobs.bukkit.BukkitCommonMobConverter;
import be.renaud11232.bluemapmobs.entity.Mob;
import be.renaud11232.bluemapmobs.paper.entity.PaperCopperGolem;
import org.bukkit.entity.CopperGolem;

public class PaperMobConverter extends BukkitCommonMobConverter {
    @Override
    public Mob convert(org.bukkit.entity.Mob mob) {
        return switch (mob) {
            case CopperGolem copperGolem -> new PaperCopperGolem(copperGolem);
            default -> super.convert(mob);
        };
    }
}
