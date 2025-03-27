package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.configuration.*;

public final class Configuration {
    public static final class General {
        public static final BooleanConfiguration OVERWRITE_ASSETS = new SimpleBooleanConfiguration("general.overwrite_assets", true);
        public static final IntegerConfiguration MINIMUM_BLOCK_LIGHT = new SimpleIntegerConfiguration("general.minimum_block_light", 4);
        public static final IntegerConfiguration MINIMUM_SKY_LIGHT = new SimpleIntegerConfiguration("general.minimum_sky_light", 1);
    }
    public static final class MarkerSets {
        public static final class Mobs {
            public static final StringConfiguration KEY = new SimpleStringConfiguration("marker_sets.mobs.key", "bluemapmobs-mobs");
            public static final StringConfiguration LABEL = new SimpleStringConfiguration("marker_sets.mobs.label", "Mobs");
            public static final BooleanConfiguration TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.mobs.toggleable", true);
            public static final BooleanConfiguration DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.mobs.default_hidden", true);
            public static final class Markers {
                public static final DoubleConfiguration MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.mobs.markers.max_distance", 1000d);
                public static final class Types {
                    public static final BooleanConfiguration BAT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.bat", true);
                    public static final BooleanConfiguration ALLAY = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.allay", true);
                    public static final BooleanConfiguration CAMEL = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.camel", true);
                    public static final BooleanConfiguration DONKEY = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.donkey", true);
                    public static final BooleanConfiguration LLAMA = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.llama", true);
                    public static final BooleanConfiguration TRADER_LLAMA = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.trader_llama", true);
                    public static final BooleanConfiguration MULE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.mule", true);
                    public static final BooleanConfiguration HORSE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.horse", true);
                    public static final BooleanConfiguration SKELETON_HORSE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.skeleton_horse", true);
                    public static final BooleanConfiguration ZOMBIE_HORSE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zombie_horse", true);
                    public static final BooleanConfiguration ARMADILLO = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.armadillo", true);
                    public static final BooleanConfiguration AXOLOTL = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.axolotl", true);
                    public static final BooleanConfiguration BEE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.bee", true);
                    public static final BooleanConfiguration CAT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cat", true);
                    public static final BooleanConfiguration CHICKEN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.chicken", true);
                    public static final BooleanConfiguration COW = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cow", true);
                    public static final BooleanConfiguration MUSHROOM_COW = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.mushroom_cow", true);
                    public static final BooleanConfiguration FOX = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.fox", true);
                    public static final BooleanConfiguration FROG = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.frog", true);
                    public static final BooleanConfiguration GOAT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.goat", true);
                    public static final BooleanConfiguration HOGLIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.hoglin", true);
                    public static final BooleanConfiguration OCELOT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ocelot", true);
                    public static final BooleanConfiguration PANDA = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.panda", true);
                    public static final BooleanConfiguration PARROT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.parrot", true);
                    public static final BooleanConfiguration PIG = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.pig", true);
                    public static final BooleanConfiguration POLAR_BEAR = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.polar_bear", true);
                    public static final BooleanConfiguration RABBIT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.rabbit", true);
                    public static final BooleanConfiguration SHEEP = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.sheep", true);
                    public static final BooleanConfiguration SNIFFER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.sniffer", true);
                    public static final BooleanConfiguration STRIDER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.strider", true);
                    public static final BooleanConfiguration TURTLE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.turtle", true);
                    public static final BooleanConfiguration WOLF = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wolf", true);
                    public static final BooleanConfiguration IRON_GOLEM = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.iron_golem", true);
                    public static final BooleanConfiguration SHULKER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.shulker", true);
                    public static final BooleanConfiguration SNOWMAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.snowman", true);
                    public static final BooleanConfiguration BOGGED = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.bogged", true);
                    public static final BooleanConfiguration SKELETON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.skeleton", true);
                    public static final BooleanConfiguration STRAY = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.stray", true);
                    public static final BooleanConfiguration WITHER_SKELETON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wither_skeleton", true);
                    public static final BooleanConfiguration BLAZE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.blaze", true);
                    public static final BooleanConfiguration BREEZE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.breeze", true);
                    public static final BooleanConfiguration CREAKING = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.creaking", true);
                    public static final BooleanConfiguration CREEPER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.creeper", true);
                    public static final BooleanConfiguration ENDERMAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.enderman", true);
                    public static final BooleanConfiguration ENDERMITE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.endermite", true);
                    public static final BooleanConfiguration GIANT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.giant", true);
                    public static final BooleanConfiguration GUARDIAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.guardian", true);
                    public static final BooleanConfiguration ELDER_GUARDIAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.elder_guardian", true);
                    public static final BooleanConfiguration PIGLIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.piglin", true);
                    public static final BooleanConfiguration PIGLIN_BRUTE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.piglin_brute", true);
                    public static final BooleanConfiguration PILLAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.pillager", true);
                    public static final BooleanConfiguration EVOKER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.evoker", true);
                    public static final BooleanConfiguration ILLUSIONER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.illusioner", true);
                    public static final BooleanConfiguration VINDICATOR = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.vindicator", true);
                    public static final BooleanConfiguration RAVAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ravager", true);
                    public static final BooleanConfiguration WITCH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.witch", true);
                    public static final BooleanConfiguration SILVERFISH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.silverfish", true);
                    public static final BooleanConfiguration SPIDER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.spider", true);
                    public static final BooleanConfiguration CAVE_SPIDER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cave_spider", true);
                    public static final BooleanConfiguration VEX = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.vex", true);
                    public static final BooleanConfiguration WARDEN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.warden", true);
                    public static final BooleanConfiguration WITHER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wither", true);
                    public static final BooleanConfiguration ZOGLIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zoglin", true);
                    public static final BooleanConfiguration ZOMBIE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zombie", true);
                    public static final BooleanConfiguration DROWNED = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.drowned", true);
                    public static final BooleanConfiguration HUSK = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.husk", true);
                    public static final BooleanConfiguration PIG_ZOMBIE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.pig_zombie", true);
                    public static final BooleanConfiguration ZOMBIE_VILLAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zombie_villager", true);
                    public static final BooleanConfiguration VILLAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.villager", true);
                    public static final BooleanConfiguration WANDERING_TRADER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wandering_trader", true);
                    public static final BooleanConfiguration DOLPHIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.dolphin", true);
                    public static final BooleanConfiguration COD = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cod", true);
                    public static final BooleanConfiguration PUFFER_FISH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.puffer_fish", true);
                    public static final BooleanConfiguration SALMON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.salmon", true);
                    public static final BooleanConfiguration TADPOLE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.tadpole", true);
                    public static final BooleanConfiguration TROPICAL_FISH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.tropical_fish", true);
                    public static final BooleanConfiguration SQUID = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.squid", true);
                    public static final BooleanConfiguration GLOW_SQUID = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.glow_squid", true);
                    public static final BooleanConfiguration ENDER_DRAGON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ender_dragon", true);
                    public static final BooleanConfiguration GHAST = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ghast", true);
                    public static final BooleanConfiguration PHANTOM = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.phantom", true);
                    public static final BooleanConfiguration SLIME = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.slime", true);
                    public static final BooleanConfiguration MAGMA_CUBE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.magma_cube", true);
                }
            }
        }
        public static final class Vehicles {
            public static final StringConfiguration KEY = new SimpleStringConfiguration("marker_sets.vehicles.key", "bluemapmobs-mobs");
            public static final StringConfiguration LABEL = new SimpleStringConfiguration("marker_sets.vehicles.label", "Vehicles");
            public static final BooleanConfiguration TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.vehicles.toggleable", true);
            public static final BooleanConfiguration DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.vehicles.default_hidden", true);
            public static final class Markers {
                public static final DoubleConfiguration MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.vehicles.markers.max_distance", 1000d);
                public static final class Types {
                    public static final BooleanConfiguration BOAT = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.boat", true);
                    public static final BooleanConfiguration CHEST_BOAT = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.chest_boat", true);
                    public static final BooleanConfiguration COMMAND_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.command_minecart", true);
                    public static final BooleanConfiguration EXPLOSIVE_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.explosive_minecart", true);
                    public static final BooleanConfiguration HOPPER_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.hopper_minecart", true);
                    public static final BooleanConfiguration POWERED_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.powered_minecart", true);
                    public static final BooleanConfiguration RIDEABLE_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.rideable_minecart", true);
                    public static final BooleanConfiguration SPAWNER_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.spawner_minecart", true);
                    public static final BooleanConfiguration STORAGE_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.storage_minecart", true);
                }
            }
        }
    }
}
