package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Enderman;
import net.minecraft.world.entity.monster.EnderMan;

public class FabricEnderman extends FabricMob<EnderMan> implements Enderman {
    public FabricEnderman(EnderMan wrapped) {
        super(wrapped);
    }
}
