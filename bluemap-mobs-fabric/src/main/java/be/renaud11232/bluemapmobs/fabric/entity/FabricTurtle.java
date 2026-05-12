package be.renaud11232.bluemapmobs.fabric.entity;

import be.renaud11232.bluemapmobs.entity.Turtle;

public class FabricTurtle extends FabricAgeable<net.minecraft.world.entity.animal.turtle.Turtle> implements Turtle {
    public FabricTurtle(net.minecraft.world.entity.animal.turtle.Turtle wrapped) {
        super(wrapped);
    }
}
