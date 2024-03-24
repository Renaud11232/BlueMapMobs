package be.renaud11232.bluemapmobs.mobs;

import de.bluecolored.bluemap.api.markers.POIMarker;
import org.bukkit.entity.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MobMarkerBuilder implements MobEntityMarkerBuilder<Mob> {

    private final Map<Class<? extends Mob>, MobEntityMarkerBuilder<? extends Mob>> builders = new HashMap<>();

    public MobMarkerBuilder() {

    }

    @Override
    public Optional<POIMarker> build(Mob mob) {
        if(mob instanceof Axolotl axolotl) {

        } else if (mob instanceof Bat bat) {

        } else if (mob instanceof Bee bee) {

        } else if (mob instanceof Blaze blaze) {

        } else if (mob instanceof Cat cat) {

        } else if (mob instanceof Spider spider) {

        } else if (mob instanceof Chicken chicken) {

        } else if (mob instanceof Cod cod) {

        } else if (mob instanceof Cow cow) {

        } else if (mob instanceof Creeper creeper) {

        } else if (mob instanceof Dolphin dolphin) {

        } else if (mob instanceof Donkey donkey) {

        } else if (mob instanceof Drowned drowned) {

        } else if (mob instanceof Guardian guardian) {

        } else if (mob instanceof EnderDragon enderDragon) {

        } else if (mob instanceof Enderman enderman) {

        } else if (mob instanceof Endermite endermite) {

        } else if (mob instanceof Evoker evoker) {

        } else if (mob instanceof Fox fox) {

        } else if (mob instanceof Ghast ghast) {

        } else if (mob instanceof Giant giant) {

        }
        return MobEntityMarkerBuilder.super.build(mob);
    }
}
