package be.renaud11232.bluemapmobs.plugin.common.entity;

import be.renaud11232.bluemapmobs.entity.Villager;

public class BukkitVillager extends BukkitAgeable<org.bukkit.entity.Villager> implements Villager {
    public BukkitVillager(org.bukkit.entity.Villager wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        var type = wrapped.getVillagerType();
        if (type.equals(org.bukkit.entity.Villager.Type.DESERT)) {
            return Villager.Type.DESERT;
        } else if (type.equals(org.bukkit.entity.Villager.Type.JUNGLE)) {
            return Villager.Type.JUNGLE;
        } else if (type.equals(org.bukkit.entity.Villager.Type.PLAINS)) {
            return Villager.Type.PLAINS;
        } else if (type.equals(org.bukkit.entity.Villager.Type.SAVANNA)) {
            return Villager.Type.SAVANNA;
        } else if (type.equals(org.bukkit.entity.Villager.Type.SNOW)) {
            return Villager.Type.SNOW;
        } else if (type.equals(org.bukkit.entity.Villager.Type.SWAMP)) {
            return Villager.Type.SWAMP;
        } else if (type.equals(org.bukkit.entity.Villager.Type.TAIGA)) {
            return Villager.Type.TAIGA;
        } else {
            return null;
        }
    }
}
