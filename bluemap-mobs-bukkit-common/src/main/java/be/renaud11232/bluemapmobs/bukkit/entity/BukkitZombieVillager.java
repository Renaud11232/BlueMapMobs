package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Villager;
import be.renaud11232.bluemapmobs.entity.ZombieVillager;

public class BukkitZombieVillager extends BukkitAgeable<org.bukkit.entity.ZombieVillager> implements ZombieVillager {
    public BukkitZombieVillager(org.bukkit.entity.ZombieVillager wrapped) {
        super(wrapped);
    }

    @Override
    public Villager.Type getType() {
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
