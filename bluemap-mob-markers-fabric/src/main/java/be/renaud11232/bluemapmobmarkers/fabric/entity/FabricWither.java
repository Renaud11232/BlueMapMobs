package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Wither;
import net.minecraft.world.entity.boss.wither.WitherBoss;

public class FabricWither extends FabricMob<WitherBoss> implements Wither {
    public FabricWither(WitherBoss wrapped) {
        super(wrapped);
    }
}
