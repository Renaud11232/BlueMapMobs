package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.configuration.*;

public final class BlueMapMobsConfiguration {
    public static final class General {
        public static final Configuration<Boolean> OVERWRITE_ASSETS = new SimpleBooleanConfiguration("general.overwrite_assets");
        public static final Configuration<Integer> MINIMUM_BLOCK_LIGHT = new SimpleIntegerConfiguration("general.minimum_block_light");
        public static final Configuration<Integer> MINIMUM_SKY_LIGHT = new SimpleIntegerConfiguration("general.minimum_sky_light");
    }
    public static final class MarkerSets {
        public static final class Mobs {
            public static final Configuration<String> KEY = new SimpleStringConfiguration("marker_sets.mobs.key");
            public static final Configuration<String> LABEL = new SimpleStringConfiguration("marker_sets.mobs.label");
            public static final Configuration<Boolean> TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.mobs.toggleable");
            public static final Configuration<Boolean> DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.mobs.default_hidden");
            public static final class Markers {
                public static final Configuration<Double> MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.mobs.markers.max_distance");
                public enum Types implements BooleanConfiguration {
                    BAT("marker_sets.mobs.markers.types.bat"),
                    ALLAY("marker_sets.mobs.markers.types.allay"),
                    CAMEL("marker_sets.mobs.markers.types.camel"),
                    DONKEY("marker_sets.mobs.markers.types.donkey"),
                    LLAMA("marker_sets.mobs.markers.types.llama"),
                    TRADER_LLAMA("marker_sets.mobs.markers.types.trader_llama"),
                    MULE("marker_sets.mobs.markers.types.mule"),
                    HORSE("marker_sets.mobs.markers.types.horse"),
                    SKELETON_HORSE("marker_sets.mobs.markers.types.skeleton_horse"),
                    ZOMBIE_HORSE("marker_sets.mobs.markers.types.zombie_horse"),
                    ARMADILLO("marker_sets.mobs.markers.types.armadillo"),
                    AXOLOTL("marker_sets.mobs.markers.types.axolotl"),
                    BEE("marker_sets.mobs.markers.types.bee"),
                    CAT("marker_sets.mobs.markers.types.cat"),
                    CHICKEN("marker_sets.mobs.markers.types.chicken"),
                    COW("marker_sets.mobs.markers.types.cow"),
                    MUSHROOM_COW("marker_sets.mobs.markers.types.mushroom_cow"),
                    FOX("marker_sets.mobs.markers.types.fox"),
                    FROG("marker_sets.mobs.markers.types.frog"),
                    GOAT("marker_sets.mobs.markers.types.goat"),
                    HOGLIN("marker_sets.mobs.markers.types.hoglin"),
                    OCELOT("marker_sets.mobs.markers.types.ocelot"),
                    PANDA("marker_sets.mobs.markers.types.panda"),
                    PARROT("marker_sets.mobs.markers.types.parrot"),
                    PIG("marker_sets.mobs.markers.types.pig"),
                    POLAR_BEAR("marker_sets.mobs.markers.types.polar_bear"),
                    RABBIT("marker_sets.mobs.markers.types.rabbit"),
                    SHEEP("marker_sets.mobs.markers.types.sheep"),
                    SNIFFER("marker_sets.mobs.markers.types.sniffer"),
                    STRIDER("marker_sets.mobs.markers.types.strider"),
                    TURTLE("marker_sets.mobs.markers.types.turtle"),
                    WOLF("marker_sets.mobs.markers.types.wolf"),
                    IRON_GOLEM("marker_sets.mobs.markers.types.iron_golem"),
                    SHULKER("marker_sets.mobs.markers.types.shulker"),
                    SNOWMAN("marker_sets.mobs.markers.types.snowman"),
                    BOGGED("marker_sets.mobs.markers.types.bogged"),
                    SKELETON("marker_sets.mobs.markers.types.skeleton"),
                    STRAY("marker_sets.mobs.markers.types.stray"),
                    WITHER_SKELETON("marker_sets.mobs.markers.types.wither_skeleton"),
                    BLAZE("marker_sets.mobs.markers.types.blaze"),
                    BREEZE("marker_sets.mobs.markers.types.breeze"),
                    CREAKING("marker_sets.mobs.markers.types.creaking"),
                    CREEPER("marker_sets.mobs.markers.types.creeper"),
                    ENDERMAN("marker_sets.mobs.markers.types.enderman"),
                    ENDERMITE("marker_sets.mobs.markers.types.endermite"),
                    GIANT("marker_sets.mobs.markers.types.giant"),
                    GUARDIAN("marker_sets.mobs.markers.types.guardian"),
                    ELDER_GUARDIAN("marker_sets.mobs.markers.types.elder_guardian"),
                    PIGLIN("marker_sets.mobs.markers.types.piglin"),
                    PIGLIN_BRUTE("marker_sets.mobs.markers.types.piglin_brute"),
                    PILLAGER("marker_sets.mobs.markers.types.pillager"),
                    EVOKER("marker_sets.mobs.markers.types.evoker"),
                    ILLUSIONER("marker_sets.mobs.markers.types.illusioner"),
                    VINDICATOR("marker_sets.mobs.markers.types.vindicator"),
                    RAVAGER("marker_sets.mobs.markers.types.ravager"),
                    WITCH("marker_sets.mobs.markers.types.witch"),
                    SILVERFISH("marker_sets.mobs.markers.types.silverfish"),
                    SPIDER("marker_sets.mobs.markers.types.spider"),
                    CAVE_SPIDER("marker_sets.mobs.markers.types.cave_spider"),
                    VEX("marker_sets.mobs.markers.types.vex"),
                    WARDEN("marker_sets.mobs.markers.types.warden"),
                    WITHER("marker_sets.mobs.markers.types.wither"),
                    ZOGLIN("marker_sets.mobs.markers.types.zoglin"),
                    ZOMBIE("marker_sets.mobs.markers.types.zombie"),
                    DROWNED("marker_sets.mobs.markers.types.drowned"),
                    HUSK("marker_sets.mobs.markers.types.husk"),
                    PIG_ZOMBIE("marker_sets.mobs.markers.types.pig_zombie"),
                    ZOMBIE_VILLAGER("marker_sets.mobs.markers.types.zombie_villager"),
                    VILLAGER("marker_sets.mobs.markers.types.villager"),
                    WANDERING_TRADER("marker_sets.mobs.markers.types.wandering_trader"),
                    DOLPHIN("marker_sets.mobs.markers.types.dolphin"),
                    COD("marker_sets.mobs.markers.types.cod"),
                    PUFFER_FISH("marker_sets.mobs.markers.types.puffer_fish"),
                    SALMON("marker_sets.mobs.markers.types.salmon"),
                    TADPOLE("marker_sets.mobs.markers.types.tadpole"),
                    TROPICAL_FISH("marker_sets.mobs.markers.types.tropical_fish"),
                    SQUID("marker_sets.mobs.markers.types.squid"),
                    GLOW_SQUID("marker_sets.mobs.markers.types.glow_squid"),
                    ENDER_DRAGON("marker_sets.mobs.markers.types.ender_dragon"),
                    GHAST("marker_sets.mobs.markers.types.ghast"),
                    PHANTOM("marker_sets.mobs.markers.types.phantom"),
                    SLIME("marker_sets.mobs.markers.types.slime"),
                    MAGMA_CUBE("marker_sets.mobs.markers.types.magma_cube");

                    private final String key;

                    Types(String key) {
                        this.key = key;
                    }

                    @Override
                    public String getKey() {
                        return key;
                    }
                }
            }
        }
        public static final class Vehicles {
            public static final Configuration<String> KEY = new SimpleStringConfiguration("marker_sets.vehicles.key");
            public static final Configuration<String> LABEL = new SimpleStringConfiguration("marker_sets.vehicles.label");
            public static final Configuration<Boolean> TOGGLEABLE = new SimpleBooleanConfiguration("marker_sets.vehicles.toggleable");
            public static final Configuration<Boolean> DEFAULT_HIDDEN = new SimpleBooleanConfiguration("marker_sets.vehicles.default_hidden");
            public static final class Markers {
                public static final Configuration<Double> MAX_DISTANCE = new SimpleDoubleConfiguration("marker_sets.vehicles.markers.max_distance");
                public enum Types implements BooleanConfiguration {
                    BOAT("marker_sets.vehicles.markers.types.boat"),
                    CHEST_BOAT("marker_sets.vehicles.markers.types.chest_boat"),
                    COMMAND_MINECART("marker_sets.vehicles.markers.types.command_minecart"),
                    EXPLOSIVE_MINECART("marker_sets.vehicles.markers.types.explosive_minecart"),
                    HOPPER_MINECART("marker_sets.vehicles.markers.types.hopper_minecart"),
                    POWERED_MINECART("marker_sets.vehicles.markers.types.powered_minecart"),
                    RIDEABLE_MINECART("marker_sets.vehicles.markers.types.rideable_minecart"),
                    SPAWNER_MINECART("marker_sets.vehicles.markers.types.spawner_minecart"),
                    STORAGE_MINECART("marker_sets.vehicles.markers.types.storage_minecart");

                    private final String key;

                    Types(String key) {
                        this.key = key;
                    }

                    @Override
                    public String getKey() {
                        return key;
                    }
                }
            }
        }
    }
}
