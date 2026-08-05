package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Villager;

public class FabricVillager extends FabricAgeable<net.minecraft.world.entity.npc.villager.Villager> implements Villager {
    public FabricVillager(net.minecraft.world.entity.npc.villager.Villager wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped.getVillagerData().type().getRegisteredName()) {
            case "minecraft:desert" -> Type.DESERT;
            case "minecraft:jungle" -> Type.JUNGLE;
            case "minecraft:plains" -> Type.PLAINS;
            case "minecraft:savanna" -> Type.SAVANNA;
            case "minecraft:snow" -> Type.SNOW;
            case "minecraft:swamp" -> Type.SWAMP;
            case "minecraft:taiga" -> Type.TAIGA;
            default -> null;
        };
    }
}
