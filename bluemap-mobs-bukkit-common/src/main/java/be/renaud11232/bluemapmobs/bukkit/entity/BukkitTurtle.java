package be.renaud11232.bluemapmobs.bukkit.entity;

import be.renaud11232.bluemapmobs.entity.Turtle;

public class BukkitTurtle extends BukkitAgeable<org.bukkit.entity.Turtle> implements Turtle {
    public BukkitTurtle(org.bukkit.entity.Turtle wrapped) {
        super(wrapped);
    }
}
