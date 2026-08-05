package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Villager;
import be.renaud11232.bluemapmobmarkers.entity.ZombieVillager;

import java.util.HashMap;
import java.util.Map;

public class BukkitZombieVillager extends BukkitAgeable<org.bukkit.entity.ZombieVillager> implements ZombieVillager {
    public static final Map<org.bukkit.entity.Villager.Type, Villager.Type> TYPE_MAP = new HashMap<>();

    static {
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.DESERT, Villager.Type.DESERT);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.JUNGLE, Villager.Type.JUNGLE);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.PLAINS, Villager.Type.PLAINS);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.SAVANNA, Villager.Type.SAVANNA);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.SNOW, Villager.Type.SNOW);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.SWAMP, Villager.Type.SWAMP);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.TAIGA, Villager.Type.TAIGA);
    }

    public BukkitZombieVillager(org.bukkit.entity.ZombieVillager wrapped) {
        super(wrapped);
    }

    @Override
    public Villager.Type getType() {
        return TYPE_MAP.get(wrapped.getVillagerType());
    }
}
