package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.configuration.*;
import be.renaud11232.bluemapmobs.configuration.impl.SimpleBooleanConfiguration;
import be.renaud11232.bluemapmobs.configuration.impl.SimpleDoubleConfiguration;
import be.renaud11232.bluemapmobs.configuration.impl.SimpleIntegerConfiguration;
import be.renaud11232.bluemapmobs.configuration.impl.SimpleStringConfiguration;

public final class BlueMapMobsConfiguration {
    public static final class General {
        public static final Configuration<Boolean> OVERWRITE_ASSETS = new SimpleBooleanConfiguration("general.overwrite_assets");
        public static final Configuration<Integer> MINIMUM_BLOCK_LIGHT = new SimpleIntegerConfiguration("general.minimum_block_light");
        public static final Configuration<Integer> MINIMUM_SKY_LIGHT = new SimpleIntegerConfiguration("general.minimum_sky_light");
    }
    public static final class MarkerSets {
        public static final class Mobs {
            public static final Configuration<Boolean> ENABLED = new SimpleBooleanConfiguration("marker_sets.mobs.enabled");
            public static final Configuration<String> KEY = new SimpleStringConfiguration("marker_sets.mobs.key");
            public static final Configuration<String> LABEL = new SimpleStringConfiguration("marker_sets.mobs.label");
            public static final Configuration<Boolean> TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.mobs.toggleable");
            public static final Configuration<Boolean> DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.mobs.default_hidden");
            public static final class Markers {
                public static final Configuration<Double> MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.mobs.markers.max_distance");
                public static final class Types {
                    public static final Configuration<Boolean> BAT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.bat");
                    public static final Configuration<Boolean> ALLAY = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.allay");
                    public static final Configuration<Boolean> CAMEL = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.camel");
                    public static final Configuration<Boolean> DONKEY = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.donkey");
                    public static final Configuration<Boolean> LLAMA = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.llama");
                    public static final Configuration<Boolean> TRADER_LLAMA = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.trader_llama");
                    public static final Configuration<Boolean> MULE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.mule");
                    public static final Configuration<Boolean> HORSE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.horse");
                    public static final Configuration<Boolean> SKELETON_HORSE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.skeleton_horse");
                    public static final Configuration<Boolean> ZOMBIE_HORSE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zombie_horse");
                    public static final Configuration<Boolean> ARMADILLO = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.armadillo");
                    public static final Configuration<Boolean> AXOLOTL = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.axolotl");
                    public static final Configuration<Boolean> BEE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.bee");
                    public static final Configuration<Boolean> CAT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cat");
                    public static final Configuration<Boolean> CHICKEN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.chicken");
                    public static final Configuration<Boolean> COW = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cow");
                    public static final Configuration<Boolean> MUSHROOM_COW = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.mushroom_cow");
                    public static final Configuration<Boolean> FOX = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.fox");
                    public static final Configuration<Boolean> FROG = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.frog");
                    public static final Configuration<Boolean> GOAT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.goat");
                    public static final Configuration<Boolean> HAPPY_GHAST = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.happy_ghast");
                    public static final Configuration<Boolean> HOGLIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.hoglin");
                    public static final Configuration<Boolean> OCELOT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ocelot");
                    public static final Configuration<Boolean> PANDA = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.panda");
                    public static final Configuration<Boolean> PARROT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.parrot");
                    public static final Configuration<Boolean> PIG = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.pig");
                    public static final Configuration<Boolean> POLAR_BEAR = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.polar_bear");
                    public static final Configuration<Boolean> RABBIT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.rabbit");
                    public static final Configuration<Boolean> SHEEP = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.sheep");
                    public static final Configuration<Boolean> SNIFFER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.sniffer");
                    public static final Configuration<Boolean> STRIDER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.strider");
                    public static final Configuration<Boolean> TURTLE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.turtle");
                    public static final Configuration<Boolean> WOLF = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wolf");
                    public static final Configuration<Boolean> COPPER_GOLEM = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.copper_golem");
                    public static final Configuration<Boolean> IRON_GOLEM = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.iron_golem");
                    public static final Configuration<Boolean> SHULKER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.shulker");
                    public static final Configuration<Boolean> SNOWMAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.snowman");
                    public static final Configuration<Boolean> BOGGED = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.bogged");
                    public static final Configuration<Boolean> SKELETON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.skeleton");
                    public static final Configuration<Boolean> STRAY = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.stray");
                    public static final Configuration<Boolean> WITHER_SKELETON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wither_skeleton");
                    public static final Configuration<Boolean> BLAZE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.blaze");
                    public static final Configuration<Boolean> BREEZE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.breeze");
                    public static final Configuration<Boolean> CREAKING = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.creaking");
                    public static final Configuration<Boolean> CREEPER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.creeper");
                    public static final Configuration<Boolean> ENDERMAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.enderman");
                    public static final Configuration<Boolean> ENDERMITE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.endermite");
                    public static final Configuration<Boolean> GIANT = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.giant");
                    public static final Configuration<Boolean> GUARDIAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.guardian");
                    public static final Configuration<Boolean> ELDER_GUARDIAN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.elder_guardian");
                    public static final Configuration<Boolean> PIGLIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.piglin");
                    public static final Configuration<Boolean> PIGLIN_BRUTE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.piglin_brute");
                    public static final Configuration<Boolean> PILLAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.pillager");
                    public static final Configuration<Boolean> EVOKER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.evoker");
                    public static final Configuration<Boolean> ILLUSIONER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.illusioner");
                    public static final Configuration<Boolean> VINDICATOR = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.vindicator");
                    public static final Configuration<Boolean> RAVAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ravager");
                    public static final Configuration<Boolean> WITCH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.witch");
                    public static final Configuration<Boolean> SILVERFISH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.silverfish");
                    public static final Configuration<Boolean> SPIDER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.spider");
                    public static final Configuration<Boolean> CAVE_SPIDER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cave_spider");
                    public static final Configuration<Boolean> VEX = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.vex");
                    public static final Configuration<Boolean> WARDEN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.warden");
                    public static final Configuration<Boolean> WITHER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wither");
                    public static final Configuration<Boolean> ZOGLIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zoglin");
                    public static final Configuration<Boolean> ZOMBIE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zombie");
                    public static final Configuration<Boolean> DROWNED = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.drowned");
                    public static final Configuration<Boolean> HUSK = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.husk");
                    public static final Configuration<Boolean> PIG_ZOMBIE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.pig_zombie");
                    public static final Configuration<Boolean> ZOMBIE_VILLAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.zombie_villager");
                    public static final Configuration<Boolean> VILLAGER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.villager");
                    public static final Configuration<Boolean> WANDERING_TRADER = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.wandering_trader");
                    public static final Configuration<Boolean> DOLPHIN = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.dolphin");
                    public static final Configuration<Boolean> COD = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.cod");
                    public static final Configuration<Boolean> PUFFER_FISH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.puffer_fish");
                    public static final Configuration<Boolean> SALMON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.salmon");
                    public static final Configuration<Boolean> TADPOLE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.tadpole");
                    public static final Configuration<Boolean> TROPICAL_FISH = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.tropical_fish");
                    public static final Configuration<Boolean> SQUID = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.squid");
                    public static final Configuration<Boolean> GLOW_SQUID = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.glow_squid");
                    public static final Configuration<Boolean> ENDER_DRAGON = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ender_dragon");
                    public static final Configuration<Boolean> GHAST = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.ghast");
                    public static final Configuration<Boolean> PHANTOM = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.phantom");
                    public static final Configuration<Boolean> SLIME = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.slime");
                    public static final Configuration<Boolean> MAGMA_CUBE = new SimpleBooleanConfiguration("marker_sets.mobs.markers.types.magma_cube");
                }
            }
        }
        public static final class Vehicles {
            public static final Configuration<Boolean> ENABLED = new SimpleBooleanConfiguration("marker_sets.vehicles.enabled");
            public static final Configuration<String> KEY = new SimpleStringConfiguration("marker_sets.vehicles.key");
            public static final Configuration<String> LABEL = new SimpleStringConfiguration("marker_sets.vehicles.label");
            public static final Configuration<Boolean> TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.vehicles.toggleable");
            public static final Configuration<Boolean> DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.vehicles.default_hidden");
            public static final class Markers {
                public static final Configuration<Double> MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.vehicles.markers.max_distance");
                public static final class Types {
                    public static final Configuration<Boolean> BOAT = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.boat");
                    public static final Configuration<Boolean> CHEST_BOAT = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.chest_boat");
                    public static final Configuration<Boolean> COMMAND_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.command_minecart");
                    public static final Configuration<Boolean> EXPLOSIVE_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.explosive_minecart");
                    public static final Configuration<Boolean> HOPPER_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.hopper_minecart");
                    public static final Configuration<Boolean> POWERED_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.powered_minecart");
                    public static final Configuration<Boolean> RIDEABLE_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.rideable_minecart");
                    public static final Configuration<Boolean> SPAWNER_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.spawner_minecart");
                    public static final Configuration<Boolean> STORAGE_MINECART = new SimpleBooleanConfiguration("marker_sets.vehicles.markers.types.storage_minecart");
                }
            }
        }
        public static final class Others {
            public static final Configuration<Boolean> ENABLED = new SimpleBooleanConfiguration("marker_sets.others.enabled");
            public static final Configuration<String> KEY = new SimpleStringConfiguration("marker_sets.others.key");
            public static final Configuration<String> LABEL = new SimpleStringConfiguration("marker_sets.others.label");
            public static final Configuration<Boolean> TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.others.toggleable");
            public static final Configuration<Boolean> DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.others.default_hidden");
            public static final class Markers {
                public static final Configuration<Double> MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.others.markers.max_distance");
                public static final class Types {
                    public static final Configuration<Boolean> ARMOR_STAND = new SimpleBooleanConfiguration("marker_sets.others.markers.types.armor_stand");
                    public static final Configuration<Boolean> MANNEQUIN = new SimpleBooleanConfiguration("marker_sets.others.markers.types.mannequin");
                }
            }
        }
        public static final class NPCs {
            public static final Configuration<Boolean> ENABLED = new SimpleBooleanConfiguration("marker_sets.npcs.enabled");
            public static final Configuration<String> KEY = new SimpleStringConfiguration("marker_sets.npcs.key");
            public static final Configuration<String> LABEL = new SimpleStringConfiguration("marker_sets.npcs.label");
            public static final Configuration<Boolean> TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.npcs.toggleable");
            public static final Configuration<Boolean> DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.npcs.default_hidden");
            public static final class Markers {
                public static final Configuration<Double> MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.npcs.markers.max_distance");
            }
        }
    }
}
