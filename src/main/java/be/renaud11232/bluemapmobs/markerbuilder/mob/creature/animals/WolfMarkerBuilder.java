package be.renaud11232.bluemapmobs.markerbuilder.mob.creature.animals;

import be.renaud11232.bluemapmobs.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.MappedIconMobEntityMarkerBuilder;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Wolf;

import java.util.AbstractMap;
import java.util.Map;

public class WolfMarkerBuilder extends MappedIconMobEntityMarkerBuilder<Wolf, Map.Entry<WolfMarkerBuilder.WolfMood, Wolf.Variant>> {
    public WolfMarkerBuilder(FileConfiguration config) {
        super(config, "marker_sets.mobs.markers.types.wolf", WolfMarkerBuilder::getWolfMood);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.ASHEN), Icon.ANGRY_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.BLACK), Icon.ANGRY_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.CHESTNUT), Icon.ANGRY_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.PALE), Icon.ANGRY_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.RUSTY), Icon.ANGRY_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.SNOWY), Icon.ANGRY_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.SPOTTED), Icon.ANGRY_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.STRIPED), Icon.ANGRY_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.ANGRY, Wolf.Variant.WOODS), Icon.ANGRY_WOODS_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.ASHEN), Icon.TAMED_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.BLACK), Icon.TAMED_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.CHESTNUT), Icon.TAMED_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.PALE), Icon.TAMED_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.RUSTY), Icon.TAMED_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.SNOWY), Icon.TAMED_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.SPOTTED), Icon.TAMED_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.STRIPED), Icon.TAMED_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.TAMED, Wolf.Variant.WOODS), Icon.TAMED_WOODS_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.ASHEN), Icon.UNTAMED_ASHEN_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.BLACK), Icon.UNTAMED_BLACK_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.CHESTNUT), Icon.UNTAMED_CHESTNUT_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.PALE), Icon.UNTAMED_PALE_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.RUSTY), Icon.UNTAMED_RUSTY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.SNOWY), Icon.UNTAMED_SNOWY_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.SPOTTED), Icon.UNTAMED_SPOTTED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.STRIPED), Icon.UNTAMED_STRIPED_WOLF);
        registerIcon(new AbstractMap.SimpleEntry<>(WolfMood.UNTAMED, Wolf.Variant.WOODS), Icon.UNTAMED_WOODS_WOLF);
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
