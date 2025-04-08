package be.renaud11232.bluemapmobs;

import org.bukkit.entity.TropicalFish;

public final class BlueMapMobsStyleClass {
    public static final String MARKER = "bluemapmobs-marker";

    public static final class Mob {
        public static final String SHEEP = "bluemapmobs-sheep";
        public static final String WHITE_SHEEP = "bluemapmobs-white-sheep";
        public static final String ORANGE_SHEEP = "bluemapmobs-orange-sheep";
        public static final String MAGENTA_SHEEP = "bluemapmobs-magenta-sheep";
        public static final String LIGHTBLUE_SHEEP = "bluemapmobs-lightblue-sheep";
        public static final String YELLOW_SHEEP = "bluemapmobs-yellow-sheep";
        public static final String LIME_SHEEP = "bluemapmobs-lime-sheep";
        public static final String PINK_SHEEP = "bluemapmobs-pink-sheep";
        public static final String GRAY_SHEEP = "bluemapmobs-gray-sheep";
        public static final String LIGHTGRAY_SHEEP = "bluemapmobs-lightgray-sheep";
        public static final String CYAN_SHEEP = "bluemapmobs-cyan-sheep";
        public static final String PURPLE_SHEEP = "bluemapmobs-purple-sheep";
        public static final String BLUE_SHEEP = "bluemapmobs-blue-sheep";
        public static final String BROWN_SHEEP = "bluemapmobs-brown-sheep";
        public static final String GREEN_SHEEP = "bluemapmobs-green-sheep";
        public static final String RED_SHEEP = "bluemapmobs-red-sheep";
        public static final String BLACK_SHEEP = "bluemapmobs-black-sheep";
        public static final String JEB_SHEEP = "bluemapmobs-jeb-sheep";
        public static final String HORSE = "bluemapmobs-horse";
        public static final String WHITE_HORSE = "bluemapmobs-white-horse";
        public static final String CREAMY_HORSE = "bluemapmobs-creamy-horse";
        public static final String CHESTNUT_HORSE = "bluemapmobs-chestnut-horse";
        public static final String BROWN_HORSE = "bluemapmobs-brown-horse";
        public static final String BLACK_HORSE = "bluemapmobs-black-horse";
        public static final String GRAY_HORSE = "bluemapmobs-gray-horse";
        public static final String DARKBROWN_HORSE = "bluemapmobs-darkbrown-horse";
        public static final String LLAMA = "bluemapmobs-llama";
        public static final String CREAMY_LLAMA = "bluemapmobs-creamy-llama";
        public static final String WHITE_LLAMA = "bluemapmobs-white-llama";
        public static final String GRAY_LLAMA = "bluemapmobs-gray-llama";
        public static final String BROWN_LLAMA = "bluemapmobs-brown-llama";
        public static final String TROPICAL_FISH = "bluemapmobs-tropical-fish";
        public static String tropicalFish(TropicalFish tropicalFish) {
            String bodyType = switch (tropicalFish.getPattern()) {
                case KOB, SUNSTREAK, SNOOPER, DASHER, BRINELY, SPOTTY -> "a";
                case FLOPPER, STRIPEY, GLITTER, BLOCKFISH, BETTY, CLAYFISH -> "b";
            };
            return String.format("bluemapmobs-tropical-fish-%s-%s", bodyType, tropicalFish.getBodyColor().name().toLowerCase().replace('_', '-'));
        }
    }
}
