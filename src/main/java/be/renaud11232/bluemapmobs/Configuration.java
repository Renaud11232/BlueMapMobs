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

                }
            }
        }
    }
}
