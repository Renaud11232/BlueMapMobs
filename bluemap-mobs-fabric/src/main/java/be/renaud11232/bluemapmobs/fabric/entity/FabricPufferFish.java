package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.PufferFish;
import net.minecraft.world.entity.animal.fish.Pufferfish;

public class FabricPufferFish extends FabricMob<Pufferfish> implements PufferFish {
    public FabricPufferFish(Pufferfish wrapped) {
        super(wrapped);
    }
}
