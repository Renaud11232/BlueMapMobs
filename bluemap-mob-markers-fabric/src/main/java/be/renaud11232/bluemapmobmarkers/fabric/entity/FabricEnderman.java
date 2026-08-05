package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Enderman;
import net.minecraft.world.entity.monster.EnderMan;

public class FabricEnderman extends FabricMob<EnderMan> implements Enderman {
    public FabricEnderman(EnderMan wrapped) {
        super(wrapped);
    }
}
