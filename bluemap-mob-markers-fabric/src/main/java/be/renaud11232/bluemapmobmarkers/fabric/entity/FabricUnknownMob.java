package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapentitymarkers.entity.UnknownEntity;
import net.minecraft.world.entity.Mob;

public class FabricUnknownMob extends FabricMob<Mob> implements UnknownEntity {
    public FabricUnknownMob(Mob wrapped) {
        super(wrapped);
    }
}
