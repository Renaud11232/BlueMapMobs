package be.renaud11232.bluemapmobmarkers.paper;

import be.renaud11232.bluemapmobmarkers.bukkit.BukkitCommonMobConverter;
import be.renaud11232.bluemapmobmarkers.entity.Mob;
import be.renaud11232.bluemapmobmarkers.paper.entity.PaperCopperGolem;
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
