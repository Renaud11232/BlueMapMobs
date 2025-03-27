package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.icon.MobIcon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import be.renaud11232.bluemapmobs.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.AbstractMap;
import java.util.Map;

public class WolfMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Wolf, Map.Entry<WolfMarkerBuilder.WolfMood, Wolf.Variant>> {
    public WolfMarkerBuilder(FileConfiguration config) {
        super(config, Configuration.MarkerSets.Mobs.Markers.Types.WOLF, WolfMarkerBuilder::getWolfMood);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.ASHEN), MobIcon.ANGRY_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.BLACK), MobIcon.ANGRY_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.CHESTNUT), MobIcon.ANGRY_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.PALE), MobIcon.ANGRY_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.RUSTY), MobIcon.ANGRY_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.SNOWY), MobIcon.ANGRY_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.SPOTTED), MobIcon.ANGRY_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.STRIPED), MobIcon.ANGRY_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.WOODS), MobIcon.ANGRY_WOODS_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.ASHEN), MobIcon.TAMED_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.BLACK), MobIcon.TAMED_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.CHESTNUT), MobIcon.TAMED_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.PALE), MobIcon.TAMED_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.RUSTY), MobIcon.TAMED_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.SNOWY), MobIcon.TAMED_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.SPOTTED), MobIcon.TAMED_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.STRIPED), MobIcon.TAMED_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.WOODS), MobIcon.TAMED_WOODS_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.ASHEN), MobIcon.UNTAMED_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.BLACK), MobIcon.UNTAMED_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.CHESTNUT), MobIcon.UNTAMED_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.PALE), MobIcon.UNTAMED_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.RUSTY), MobIcon.UNTAMED_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.SNOWY), MobIcon.UNTAMED_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.SPOTTED), MobIcon.UNTAMED_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.STRIPED), MobIcon.UNTAMED_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.WOODS), MobIcon.UNTAMED_WOODS_WOLF);
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
