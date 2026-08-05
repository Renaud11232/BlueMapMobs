package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Turtle;

public class BukkitTurtle extends BukkitAgeable<org.bukkit.entity.Turtle> implements Turtle {
    public BukkitTurtle(org.bukkit.entity.Turtle wrapped) {
        super(wrapped);
    }
}
