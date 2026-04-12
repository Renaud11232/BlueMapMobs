package be.renaud11232.bluemapmobs.markerbuilder;

import be.renaud11232.bluemapentities.BlueMapEntitiesAPI;
import be.renaud11232.bluemapentities.markerbuilder.SimpleMarkerBuilder;
import be.renaud11232.bluemapmobs.MobsMarkerType;
import be.renaud11232.bluemapmobs.entity.Mob;

public class MobsMarkerBuilder extends SimpleMarkerBuilder<Mob> {
    public MobsMarkerBuilder(BlueMapEntitiesAPI api) {
        super(api);
    }

    @Override
    protected void registerMarkerBuilders() {
        register(MobsMarkerType.ALLAY, new AllayMarkerBuilder(getAPI()));
        register(MobsMarkerType.ARMADILLO, new ArmadilloMarkerBuilder(getAPI()));
        register(MobsMarkerType.AXOLOTL, new AxolotlMarkerBuilder(getAPI()));
        register(MobsMarkerType.BAT, new BatMarkerBuilder(getAPI()));
        register(MobsMarkerType.BEE, new BeeMarkerBuilder(getAPI()));
        register(MobsMarkerType.BLAZE, new BlazeMarkerBuilder(getAPI()));
        register(MobsMarkerType.BOGGED, new BoggedMarkerBuilder(getAPI()));
        register(MobsMarkerType.BREEZE, new BreezeMarkerBuilder(getAPI()));
        register(MobsMarkerType.CAMEL, new CamelMarkerBuilder(getAPI()));
        register(MobsMarkerType.CAMEL_HUSK, new CamelHuskMarkerBuilder(getAPI()));
        register(MobsMarkerType.CAT, new CatMarkerBuilder(getAPI()));
        register(MobsMarkerType.CAVE_SPIDER, new CaveSpiderMarkerBuilder(getAPI()));
        register(MobsMarkerType.CHICKEN, new ChickenMarkerBuilder(getAPI()));
        register(MobsMarkerType.COD, new CodMarkerBuilder(getAPI()));
        register(MobsMarkerType.COPPER_GOLEM, new CopperGolemMarkerBuilder(getAPI()));
        register(MobsMarkerType.COW, new CowMarkerBuilder(getAPI()));
        register(MobsMarkerType.CREAKING, new CreakingMarkerBuilder(getAPI()));
        register(MobsMarkerType.CREEPER, new CreeperMarkerBuilder(getAPI()));
        register(MobsMarkerType.DOLPHIN, new DolphinMarkerBuilder(getAPI()));
        register(MobsMarkerType.DONKEY, new DonkeyMarkerBuilder(getAPI()));
        register(MobsMarkerType.DROWNED, new DrownedMarkerBuilder(getAPI()));
        register(MobsMarkerType.ELDER_GUARDIAN, new ElderGuardianMarkerBuilder(getAPI()));
        register(MobsMarkerType.ENDERMAN, new EndermanMarkerBuilder(getAPI()));
        register(MobsMarkerType.ENDERMITE, new EndermiteMarkerBuilder(getAPI()));
        register(MobsMarkerType.ENDER_DRAGON, new EnderDragonMarkerBuilder(getAPI()));
        register(MobsMarkerType.EVOKER, new EvokerMarkerBuilder(getAPI()));
        register(MobsMarkerType.FOX, new FoxMarkerBuilder(getAPI()));
        register(MobsMarkerType.FROG, new FrogMarkerBuilder(getAPI()));
        register(MobsMarkerType.GHAST, new GhastMarkerBuilder(getAPI()));
        register(MobsMarkerType.GIANT, new GiantMarkerBuilder(getAPI()));
        register(MobsMarkerType.GLOW_SQUID, new GlowSquidMarkerBuilder(getAPI()));
        register(MobsMarkerType.GOAT, new GoatMarkerBuilder(getAPI()));
        register(MobsMarkerType.GUARDIAN, new GuardianMarkerBuilder(getAPI()));
        register(MobsMarkerType.HAPPY_GHAST, new HappyGhastMarkerBuilder(getAPI()));
        register(MobsMarkerType.HOGLIN, new HoglinMarkerBuilder(getAPI()));
        register(MobsMarkerType.HORSE, new HorseMarkerBuilder(getAPI()));
        register(MobsMarkerType.HUSK, new HuskMarkerBuilder(getAPI()));
        register(MobsMarkerType.ILLUSIONER, new IllusionerMarkerBuilder(getAPI()));
        register(MobsMarkerType.IRON_GOLEM, new IronGolemMarkerBuilder(getAPI()));
        register(MobsMarkerType.LLAMA, new LlamaMarkerBuilder(getAPI()));
        register(MobsMarkerType.MAGMA_CUBE, new MagmaCubeMarkerBuilder(getAPI()));
        register(MobsMarkerType.MULE, new MuleMarkerBuilder(getAPI()));
        register(MobsMarkerType.MUSHROOM_COW, new MushroomCowMarkerBuilder(getAPI()));
        register(MobsMarkerType.NAUTILUS, new NautilusMarkerBuilder(getAPI()));
        register(MobsMarkerType.OCELOT, new OcelotMarkerBuilder(getAPI()));
        register(MobsMarkerType.PANDA, new PandaMarkerBuilder(getAPI()));
        register(MobsMarkerType.PARCHED, new ParchedMarkerBuilder(getAPI()));
        register(MobsMarkerType.PARROT, new ParrotMarkerBuilder(getAPI()));
        register(MobsMarkerType.PHANTOM, new PhantomMarkerBuilder(getAPI()));
        register(MobsMarkerType.PIG, new PigMarkerBuilder(getAPI()));
        register(MobsMarkerType.PIGLIN, new PiglinMarkerBuilder(getAPI()));
        register(MobsMarkerType.PIGLIN_BRUTE, new PiglinBruteMarkerBuilder(getAPI()));
        register(MobsMarkerType.PIG_ZOMBIE, new PigZombieMarkerBuilder(getAPI()));
        register(MobsMarkerType.PILLAGER, new PillagerMarkerBuilder(getAPI()));
        register(MobsMarkerType.POLAR_BEAR, new PolarBearMarkerBuilder(getAPI()));
        register(MobsMarkerType.PUFFER_FISH, new PufferFishMarkerBuilder(getAPI()));
        register(MobsMarkerType.RABBIT, new RabbitMarkerBuilder(getAPI()));
        register(MobsMarkerType.RAVAGER, new RavagerMarkerBuilder(getAPI()));
        register(MobsMarkerType.SALMON, new SalmonMarkerBuilder(getAPI()));
        register(MobsMarkerType.SHEEP, new SheepMarkerBuilder(getAPI()));
        register(MobsMarkerType.SHULKER, new ShulkerMarkerBuilder(getAPI()));
        register(MobsMarkerType.SILVERFISH, new SilverfishMarkerBuilder(getAPI()));
        register(MobsMarkerType.SKELETON, new SkeletonMarkerBuilder(getAPI()));
        register(MobsMarkerType.SKELETON_HORSE, new SkeletonHorseMarkerBuilder(getAPI()));
        register(MobsMarkerType.SLIME, new SlimeMarkerBuilder(getAPI()));
        register(MobsMarkerType.SNIFFER, new SnifferMarkerBuilder(getAPI()));
        register(MobsMarkerType.SNOWMAN, new SnowmanMarkerBuilder(getAPI()));
        register(MobsMarkerType.SPIDER, new SpiderMarkerBuilder(getAPI()));
        register(MobsMarkerType.SQUID, new SquidMarkerBuilder(getAPI()));
        register(MobsMarkerType.STRAY, new StrayMarkerBuilder(getAPI()));
        register(MobsMarkerType.STRIDER, new StriderMarkerBuilder(getAPI()));
        register(MobsMarkerType.TADPOLE, new TadpoleMarkerBuilder(getAPI()));
        register(MobsMarkerType.TRADER_LLAMA, new TraderLlamaMarkerBuilder(getAPI()));
        register(MobsMarkerType.TROPICAL_FISH, new TropicalFishMarkerBuilder(getAPI()));
        register(MobsMarkerType.TURTLE, new TurtleMarkerBuilder(getAPI()));
        register(MobsMarkerType.VEX, new VexMarkerBuilder(getAPI()));
        register(MobsMarkerType.VILLAGER, new VillagerMarkerBuilder(getAPI()));
        register(MobsMarkerType.VINDICATOR, new VindicatorMarkerBuilder(getAPI()));
        register(MobsMarkerType.WANDERING_TRADER, new WanderingTraderMarkerBuilder(getAPI()));
        register(MobsMarkerType.WARDEN, new WardenMarkerBuilder(getAPI()));
        register(MobsMarkerType.WITCH, new WitchMarkerBuilder(getAPI()));
        register(MobsMarkerType.WITHER, new WitherMarkerBuilder(getAPI()));
        register(MobsMarkerType.WITHER_SKELETON, new WitherSkeletonMarkerBuilder(getAPI()));
        register(MobsMarkerType.WOLF, new WolfMarkerBuilder(getAPI()));
        register(MobsMarkerType.ZOGLIN, new ZoglinMarkerBuilder(getAPI()));
        register(MobsMarkerType.ZOMBIE, new ZombieMarkerBuilder(getAPI()));
        register(MobsMarkerType.ZOMBIE_HORSE, new ZombieHorseMarkerBuilder(getAPI()));
        register(MobsMarkerType.ZOMBIE_NAUTILUS, new ZombieNautilusMarkerBuilder(getAPI()));
        register(MobsMarkerType.ZOMBIE_VILLAGER, new ZombieVillagerMarkerBuilder(getAPI()));
    }
}
