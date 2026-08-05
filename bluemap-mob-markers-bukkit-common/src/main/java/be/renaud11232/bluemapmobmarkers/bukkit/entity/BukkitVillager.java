package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Villager;

import java.util.HashMap;
import java.util.Map;

public class BukkitVillager extends BukkitAgeable<org.bukkit.entity.Villager> implements Villager {
    private static final Map<org.bukkit.entity.Villager.Type, Type> TYPE_MAP = new HashMap<>();

    static {
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.DESERT, Type.DESERT);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.JUNGLE, Type.JUNGLE);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.PLAINS, Type.PLAINS);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.SAVANNA, Type.SAVANNA);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.SNOW, Type.SNOW);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.SWAMP, Type.SWAMP);
        TYPE_MAP.put(org.bukkit.entity.Villager.Type.TAIGA, Type.TAIGA);
    }

    public BukkitVillager(org.bukkit.entity.Villager wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return TYPE_MAP.get(wrapped.getVillagerType());
    }
}
