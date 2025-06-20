package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.animals;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.BlueMapMobsStyleClass;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.HappyGhast;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;

import java.util.Collection;
import java.util.List;

public class HappyGhastMarkerBuilder extends AbstractVariantMobMarkerBuilder<HappyGhast, Material, Boolean> {
    public HappyGhastMarkerBuilder(FileConfiguration config, FileConfiguration defaultConfig) {
        super(config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.HAPPY_GHAST;
    }

    @Override
    public Icon getDefaultIcon() {
        return BlueMapMobsIcon.Mob.HAPPY_GHAST_NO_HARNESS;
    }

    @Override
    public Material getIconVariant(HappyGhast happyGhast) {
        EntityEquipment equipment = happyGhast.getEquipment();
        if (equipment == null) {
            return null;
        }
        return equipment.getItem(EquipmentSlot.BODY).getType();
    }

    @Override
    public Boolean getStyleClassesVariant(HappyGhast happyGhast) {
        return happyGhast.isAdult();
    }

    @Override
    public void registerVariantIcons(Registry<Material, Icon> registry) {
        registry.register(Material.WHITE_HARNESS, BlueMapMobsIcon.Mob.WHITE_HAPPY_GHAST_HARNESS);
        registry.register(Material.LIGHT_GRAY_HARNESS, BlueMapMobsIcon.Mob.LIGHTGRAY_HAPPY_GHAST_HARNESS);
        registry.register(Material.GRAY_HARNESS, BlueMapMobsIcon.Mob.GRAY_HAPPY_GHAST_HARNESS);
        registry.register(Material.BLACK_HARNESS, BlueMapMobsIcon.Mob.BLACK_HAPPY_GHAST_HARNESS);
        registry.register(Material.BROWN_HARNESS, BlueMapMobsIcon.Mob.BROWN_HAPPY_GHAST_HARNESS);
        registry.register(Material.RED_HARNESS, BlueMapMobsIcon.Mob.RED_HAPPY_GHAST_HARNESS);
        registry.register(Material.ORANGE_HARNESS, BlueMapMobsIcon.Mob.ORANGE_HAPPY_GHAST_HARNESS);
        registry.register(Material.YELLOW_HARNESS, BlueMapMobsIcon.Mob.YELLOW_HAPPY_GHAST_HARNESS);
        registry.register(Material.LIME_HARNESS, BlueMapMobsIcon.Mob.LIME_HAPPY_GHAST_HARNESS);
        registry.register(Material.GREEN_HARNESS, BlueMapMobsIcon.Mob.GREEN_HAPPY_GHAST_HARNESS);
        registry.register(Material.CYAN_HARNESS, BlueMapMobsIcon.Mob.CYAN_HAPPY_GHAST_HARNESS);
        registry.register(Material.LIGHT_BLUE_HARNESS, BlueMapMobsIcon.Mob.LIGHTBLUE_HAPPY_GHAST_HARNESS);
        registry.register(Material.BLUE_HARNESS, BlueMapMobsIcon.Mob.BLUE_HAPPY_GHAST_HARNESS);
        registry.register(Material.PURPLE_HARNESS, BlueMapMobsIcon.Mob.PURPLE_HAPPY_GHAST_HARNESS);
        registry.register(Material.MAGENTA_HARNESS, BlueMapMobsIcon.Mob.MAGENTA_HAPPY_GHAST_HARNESS);
        registry.register(Material.PINK_HARNESS, BlueMapMobsIcon.Mob.PINK_HAPPY_GHAST_HARNESS);
    }

    @Override
    public void registerVariantStyleClasses(Registry<Boolean, Collection<String>> registry) {
        registry.register(true, List.of(BlueMapMobsStyleClass.Mob.ADULT_HAPPY_GHAST));
        registry.register(false, List.of(BlueMapMobsStyleClass.Mob.BABY_HAPPY_GHAST));
    }
}
