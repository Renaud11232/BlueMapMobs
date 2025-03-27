package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.AbstractMap;
import java.util.Map;

public class WolfMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Wolf, Map.Entry<WolfMarkerBuilder.WolfMood, Wolf.Variant>> {
    public WolfMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig, BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.WOLF, WolfMarkerBuilder::getWolfMood);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.ASHEN), BlueMapMobsIcon.Mob.ANGRY_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.BLACK), BlueMapMobsIcon.Mob.ANGRY_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.CHESTNUT), BlueMapMobsIcon.Mob.ANGRY_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.PALE), BlueMapMobsIcon.Mob.ANGRY_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.RUSTY), BlueMapMobsIcon.Mob.ANGRY_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.SNOWY), BlueMapMobsIcon.Mob.ANGRY_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.SPOTTED), BlueMapMobsIcon.Mob.ANGRY_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.STRIPED), BlueMapMobsIcon.Mob.ANGRY_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.WOODS), BlueMapMobsIcon.Mob.ANGRY_WOODS_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.ASHEN), BlueMapMobsIcon.Mob.TAMED_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.BLACK), BlueMapMobsIcon.Mob.TAMED_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.CHESTNUT), BlueMapMobsIcon.Mob.TAMED_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.PALE), BlueMapMobsIcon.Mob.TAMED_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.RUSTY), BlueMapMobsIcon.Mob.TAMED_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.SNOWY), BlueMapMobsIcon.Mob.TAMED_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.SPOTTED), BlueMapMobsIcon.Mob.TAMED_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.STRIPED), BlueMapMobsIcon.Mob.TAMED_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.WOODS), BlueMapMobsIcon.Mob.TAMED_WOODS_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.ASHEN), BlueMapMobsIcon.Mob.UNTAMED_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.BLACK), BlueMapMobsIcon.Mob.UNTAMED_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.CHESTNUT), BlueMapMobsIcon.Mob.UNTAMED_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.PALE), BlueMapMobsIcon.Mob.UNTAMED_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.RUSTY), BlueMapMobsIcon.Mob.UNTAMED_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.SNOWY), BlueMapMobsIcon.Mob.UNTAMED_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.SPOTTED), BlueMapMobsIcon.Mob.UNTAMED_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.STRIPED), BlueMapMobsIcon.Mob.UNTAMED_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.WOODS), BlueMapMobsIcon.Mob.UNTAMED_WOODS_WOLF);
    }

    private static Map.Entry<WolfMood, Wolf.Variant> getWolfMood(Wolf wolf) {
        if (wolf.isAngry()) {
            return new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, wolf.getVariant());
        } else if (wolf.isTamed()) {
            return new AbstractMap.SimpleEntry<>(WolfMood.TAMED, wolf.getVariant());
        } else {
            return new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, wolf.getVariant());
        }
    }

    protected enum WolfMood {
        ANGRY,
        TAMED,
        UNTAMED
    }
}
