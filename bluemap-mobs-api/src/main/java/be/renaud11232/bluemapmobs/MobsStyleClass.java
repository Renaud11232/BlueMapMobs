package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.entity.TropicalFish;

public class MobsStyleClass {
    public static final String FLIP = "bluemapmobs-flip";
    public static final String BEE = "bluemapmobs-bee";
    public static final String BEE_ANGRY = "bluemapmobs-bee-angry";
    public static final String BEE_BABY = "bluemapmobs-bee-baby";
    public static final String BEE_ANGRY_BABY = "bluemapmobs-bee-angry-baby";
    public static final String HAPPY_GHAST = "bluemapmobs-happy-ghast";
    public static final String HAPPY_GHAST_BABY = "bluemapmobs-happy-ghast-baby";
    public static final String HORSE_WHITE = "bluemapmobs-horse-white";
    public static final String HORSE_CREAMY = "bluemapmobs-horse-creamy";
    public static final String HORSE_CHESTNUT = "bluemapmobs-horse-chestnut";
    public static final String HORSE_BROWN = "bluemapmobs-horse-brown";
    public static final String HORSE_BLACK = "bluemapmobs-horse-black";
    public static final String HORSE_GRAY = "bluemapmobs-horse-gray";
    public static final String HORSE_DARK_BROWN = "bluemapmobs-horse-dark-brown";
    public static final String LLAMA_CREAMY = "bluemapmobs-llama-creamy";
    public static final String LLAMA_WHITE = "bluemapmobs-llama-white";
    public static final String LLAMA_GRAY = "bluemapmobs-llama-gray";
    public static final String LLAMA_BROWN = "bluemapmobs-llama-brown";
    public static final String SHEEP_WHITE = "bluemapmobs-sheep-fur-white";
    public static final String SHEEP_ORANGE = "bluemapmobs-sheep-fur-orange";
    public static final String SHEEP_MAGENTA = "bluemapmobs-sheep-fur-magenta";
    public static final String SHEEP_LIGHT_BLUE = "bluemapmobs-sheep-fur-light-blue";
    public static final String SHEEP_YELLOW = "bluemapmobs-sheep-fur-yellow";
    public static final String SHEEP_LIME = "bluemapmobs-sheep-fur-lime";
    public static final String SHEEP_PINK = "bluemapmobs-sheep-fur-pink";
    public static final String SHEEP_GRAY = "bluemapmobs-sheep-fur-gray";
    public static final String SHEEP_LIGHT_GRAY = "bluemapmobs-sheep-fur-light-gray";
    public static final String SHEEP_CYAN = "bluemapmobs-sheep-fur-cyan";
    public static final String SHEEP_PURPLE = "bluemapmobs-sheep-fur-purple";
    public static final String SHEEP_BLUE = "bluemapmobs-sheep-fur-blue";
    public static final String SHEEP_BROWN = "bluemapmobs-sheep-fur-brown";
    public static final String SHEEP_GREEN = "bluemapmobs-sheep-fur-green";
    public static final String SHEEP_RED = "bluemapmobs-sheep-fur-red";
    public static final String SHEEP_BLACK = "bluemapmobs-sheep-fur-black";
    public static final String SHEEP_JEB = "bluemapmobs-sheep-fur-jeb";
    public static String tropicalFishBody(TropicalFish.BodyType bodyType, TropicalFish.Color bodyColor) {
        return String.format("bluemapmobs-tropical-fish-body-%s-%s", bodyType.name().toLowerCase(), bodyColor.name().toLowerCase().replace('_', '-'));
    }
}
