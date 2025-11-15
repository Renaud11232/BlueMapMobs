package be.renaud11232.bluemapmobs.plugin.markerbuilder.mob.creature.npc.abstractvillager;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;

public class VillagerMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<Villager, Villager.Type> {
    public VillagerMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.VILLAGER;
    }

    @Override
    public Villager.Type getVariant(Villager villager) {
        return villager.getVillagerType();
    }

    @Override
    public void registerVariantIcons(Registry<Villager.Type, Icon> registry) {
        registry.register(Villager.Type.SNOW, BlueMapMobsIcon.Mob.SNOWY_VILLAGER);
        registry.register(Villager.Type.SWAMP, BlueMapMobsIcon.Mob.SWAMP_VILLAGER);
        registry.register(Villager.Type.TAIGA, BlueMapMobsIcon.Mob.TAIGA_VILLAGER);
        registry.register(Villager.Type.DESERT, BlueMapMobsIcon.Mob.DESERT_VILLAGER);
        registry.register(Villager.Type.JUNGLE, BlueMapMobsIcon.Mob.JUNGLE_VILLAGER);
        registry.register(Villager.Type.PLAINS, BlueMapMobsIcon.Mob.PLAINS_VILLAGER);
        registry.register(Villager.Type.SAVANNA, BlueMapMobsIcon.Mob.SAVANNA_VILLAGER);
    }
}
