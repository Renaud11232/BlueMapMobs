package be.renaud11232.bluemapmobmarkers.bukkit.entity;

import be.renaud11232.bluemapmobmarkers.entity.Rabbit;

public class BukkitRabbit extends BukkitAgeable<org.bukkit.entity.Rabbit> implements Rabbit {
    public BukkitRabbit(org.bukkit.entity.Rabbit wrapped) {
        super(wrapped);
    }

    @Override
    public Type getType() {
        return switch (wrapped.getRabbitType()) {
            case BROWN -> Type.BROWN;
            case WHITE -> Type.WHITE;
            case BLACK -> Type.BLACK;
            case BLACK_AND_WHITE -> Type.BLACK_AND_WHITE;
            case GOLD -> Type.GOLD;
            case SALT_AND_PEPPER -> Type.SALT_AND_PEPPER;
            case THE_KILLER_BUNNY -> Type.THE_KILLER_BUNNY;
        };
    }
}
