package be.renaud11232.bluemapmobs;

import be.renaud11232.bluemapmobs.configuration.BooleanConfiguration;

//TODO: remove this
public enum MobMarkerVisibilityConfiguration implements BooleanConfiguration {
    BAT("marker_sets.mobs.markers.types.bat", true),
    ALLAY("marker_sets.mobs.markers.types.allay", true),
    CAMEL("marker_sets.mobs.markers.types.camel", true),
    DONKEY("marker_sets.mobs.markers.types.donkey", true),
    LLAMA("marker_sets.mobs.markers.types.llama", true),
    TRADER_LLAMA("marker_sets.mobs.markers.types.trader_llama", true),
    MULE("marker_sets.mobs.markers.types.mule", true),
    HORSE("marker_sets.mobs.markers.types.horse", true),
    SKELETON_HORSE("marker_sets.mobs.markers.types.skeleton_horse", true),
    ZOMBIE_HORSE("marker_sets.mobs.markers.types.zombie_horse", true),
    ARMADILLO("marker_sets.mobs.markers.types.armadillo", true),
    AXOLOTL("marker_sets.mobs.markers.types.axolotl", true),
    BEE("marker_sets.mobs.markers.types.bee", true),
    CAT("marker_sets.mobs.markers.types.cat", true),
    CHICKEN("marker_sets.mobs.markers.types.chicken", true),
    COW("marker_sets.mobs.markers.types.cow", true),
    MUSHROOM_COW("marker_sets.mobs.markers.types.mushroom_cow", true),
    FOX("marker_sets.mobs.markers.types.fox", true),
    FROG("marker_sets.mobs.markers.types.frog", true),
    GOAT("marker_sets.mobs.markers.types.goat", true),
    HOGLIN("marker_sets.mobs.markers.types.hoglin", true),
    OCELOT("marker_sets.mobs.markers.types.ocelot", true),
    PANDA("marker_sets.mobs.markers.types.panda", true),
    PARROT("marker_sets.mobs.markers.types.parrot", true),
    PIG("marker_sets.mobs.markers.types.pig", true),
    POLAR_BEAR("marker_sets.mobs.markers.types.polar_bear", true),
    RABBIT("marker_sets.mobs.markers.types.rabbit", true),
    SHEEP("marker_sets.mobs.markers.types.sheep", true),
    SNIFFER("marker_sets.mobs.markers.types.sniffer", true),
    STRIDER("marker_sets.mobs.markers.types.strider", true),
    TURTLE("marker_sets.mobs.markers.types.turtle", true),
    WOLF("marker_sets.mobs.markers.types.wolf", true),
    IRON_GOLEM("marker_sets.mobs.markers.types.iron_golem", true),
    SHULKER("marker_sets.mobs.markers.types.shulker", true),
    SNOWMAN("marker_sets.mobs.markers.types.snowman", true),
    BOGGED("marker_sets.mobs.markers.types.bogged", true),
    SKELETON("marker_sets.mobs.markers.types.skeleton", true),
    STRAY("marker_sets.mobs.markers.types.stray", true),
    WITHER_SKELETON("marker_sets.mobs.markers.types.wither_skeleton", true),
    BLAZE("marker_sets.mobs.markers.types.blaze", true),
    BREEZE("marker_sets.mobs.markers.types.breeze", true),
    CREAKING("marker_sets.mobs.markers.types.creaking", true),
    CREEPER("marker_sets.mobs.markers.types.creeper", true),
    ENDERMAN("marker_sets.mobs.markers.types.enderman", true),
    ENDERMITE("marker_sets.mobs.markers.types.endermite", true),
    GIANT("marker_sets.mobs.markers.types.giant", true),
    GUARDIAN("marker_sets.mobs.markers.types.guardian", true),
    ELDER_GUARDIAN("marker_sets.mobs.markers.types.elder_guardian", true),
    PIGLIN("marker_sets.mobs.markers.types.piglin", true),
    PIGLIN_BRUTE("marker_sets.mobs.markers.types.piglin_brute", true),
    PILLAGER("marker_sets.mobs.markers.types.pillager", true),
    EVOKER("marker_sets.mobs.markers.types.evoker", true),
    ILLUSIONER("marker_sets.mobs.markers.types.illusioner", true),
    VINDICATOR("marker_sets.mobs.markers.types.vindicator", true),
    RAVAGER("marker_sets.mobs.markers.types.ravager", true),
    WITCH("marker_sets.mobs.markers.types.witch", true),
    SILVERFISH("marker_sets.mobs.markers.types.silverfish", true),
    SPIDER("marker_sets.mobs.markers.types.spider", true),
    CAVE_SPIDER("marker_sets.mobs.markers.types.cave_spider", true),
    VEX("marker_sets.mobs.markers.types.vex", true),
    WARDEN("marker_sets.mobs.markers.types.warden", true),
    WITHER("marker_sets.mobs.markers.types.wither", true),
    ZOGLIN("marker_sets.mobs.markers.types.zoglin", true),
    ZOMBIE("marker_sets.mobs.markers.types.zombie", true),
    DROWNED("marker_sets.mobs.markers.types.drowned", true),
    HUSK("marker_sets.mobs.markers.types.husk", true),
    PIG_ZOMBIE("marker_sets.mobs.markers.types.pig_zombie", true),
    ZOMBIE_VILLAGER("marker_sets.mobs.markers.types.zombie_villager", true),
    VILLAGER("marker_sets.mobs.markers.types.villager", true),
    WANDERING_TRADER("marker_sets.mobs.markers.types.wandering_trader", true),
    DOLPHIN("marker_sets.mobs.markers.types.dolphin", true),
    COD("marker_sets.mobs.markers.types.cod", true),
    PUFFER_FISH("marker_sets.mobs.markers.types.puffer_fish", true),
    SALMON("marker_sets.mobs.markers.types.salmon", true),
    TADPOLE("marker_sets.mobs.markers.types.tadpole", true),
    TROPICAL_FISH("marker_sets.mobs.markers.types.tropical_fish", true),
    SQUID("marker_sets.mobs.markers.types.squid", true),
    GLOW_SQUID("marker_sets.mobs.markers.types.glow_squid", true),
    ENDER_DRAGON("marker_sets.mobs.markers.types.ender_dragon", true),
    GHAST("marker_sets.mobs.markers.types.ghast", true),
    PHANTOM("marker_sets.mobs.markers.types.phantom", true),
    SLIME("marker_sets.mobs.markers.types.slime", true),
    MAGMA_CUBE("marker_sets.mobs.markers.types.magma_cube", true);

    private final String key;
    private final boolean defaultValue;

    MobMarkerVisibilityConfiguration(String key, boolean defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public Boolean getDefaultValue() {
        return defaultValue;
    }
}
