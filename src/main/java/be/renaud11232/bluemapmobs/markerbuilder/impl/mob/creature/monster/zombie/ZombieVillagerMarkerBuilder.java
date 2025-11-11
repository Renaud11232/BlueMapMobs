package be.renaud11232.bluemapmobs.markerbuilder.impl.mob.creature.monster.zombie;

import be.renaud11232.bluemapmobs.BlueMapMobsConfiguration;
import be.renaud11232.bluemapmobs.BlueMapMobsIcon;
import be.renaud11232.bluemapmobs.configuration.Configuration;
import be.renaud11232.bluemapmobs.icon.Icon;
import be.renaud11232.bluemapmobs.markerbuilder.AbstractSingleVariantMobMarkerBuilder;
import be.renaud11232.bluemapmobs.registry.Registry;
import de.bluecolored.bluemap.api.BlueMapAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Villager;
import org.bukkit.entity.ZombieVillager;

public class ZombieVillagerMarkerBuilder extends AbstractSingleVariantMobMarkerBuilder<ZombieVillager, Villager.Type> {
    public ZombieVillagerMarkerBuilder(BlueMapAPI api, FileConfiguration config, FileConfiguration defaultConfig) {
        super(api, config, defaultConfig);
    }

    @Override
    public Configuration<Boolean> getVisibility() {
        return BlueMapMobsConfiguration.MarkerSets.Mobs.Markers.Types.ZOMBIE_VILLAGER;
    }

    @Override
    public Villager.Type getVariant(ZombieVillager zombieVillager) {
        return zombieVillager.getVillagerType();
    }

    @Override
    public void registerVariantIcons(Registry<Villager.Type, Icon> registry) {
        registry.register(Villager.Type.SNOW, BlueMapMobsIcon.Mob.SNOWY_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.SWAMP, BlueMapMobsIcon.Mob.SWAMP_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.TAIGA, BlueMapMobsIcon.Mob.TAIGA_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.DESERT, BlueMapMobsIcon.Mob.DESERT_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.JUNGLE, BlueMapMobsIcon.Mob.JUNGLE_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.PLAINS, BlueMapMobsIcon.Mob.PLAINS_ZOMBIE_VILLAGER);
        registry.register(Villager.Type.SAVANNA, BlueMapMobsIcon.Mob.SAVANNA_ZOMBIE_VILLAGER);
    }
}
