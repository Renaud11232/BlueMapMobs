package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Villager;
import be.renaud11232.bluemapmobs.entity.ZombieVillager;

public class FabricZombieVillager extends AbstractFabricZombie<net.minecraft.world.entity.monster.zombie.ZombieVillager> implements ZombieVillager {
    public FabricZombieVillager(net.minecraft.world.entity.monster.zombie.ZombieVillager wrapped) {
        super(wrapped);
    }

    @Override
    public Villager.Type getType() {
        return switch (wrapped.getVillagerData().type().getRegisteredName()) {
            case "minecraft:desert" -> Villager.Type.DESERT;
            case "minecraft:jungle" -> Villager.Type.JUNGLE;
            case "minecraft:plains" -> Villager.Type.PLAINS;
            case "minecraft:savanna" -> Villager.Type.SAVANNA;
            case "minecraft:snow" -> Villager.Type.SNOW;
            case "minecraft:swamp" -> Villager.Type.SWAMP;
            case "minecraft:taiga" -> Villager.Type.TAIGA;
            default -> null;
        };
    }
}
