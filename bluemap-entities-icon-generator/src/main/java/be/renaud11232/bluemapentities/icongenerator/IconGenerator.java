package be.renaud11232.bluemapentities.icongenerator;

import be.renaud11232.bluemapentities.icongenerator.converter.*;
import be.renaud11232.bluemapentities.icongenerator.converter.mob.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class IconGenerator {
    private final List<TextureConverter> converters;

    public IconGenerator() {
        converters = List.of(
                new AllayTextureConverter(),
                new ArmadilloTextureConverter(),
                new AxolotlTextureConverter(),
                new BatTextureConverter(),
                new BeeTextureConverter(),
                new BlazeTextureConverter(),
                new BoggedTextureConverter(),
                new BreezeTextureConverter(),
                new CamelHuskTextureConverter(),
                new CamelTextureConverter(),
                new CatTextureConverter(),
                new CaveSpiderTextureConverter(),
                new ChickenTextureConverter(),
                new CodTextureConverter(),
                new CopperGolemTextureConverter(),
                new CowTextureConverter(),
                new CreakingTextureConverter(),
                new CreeperTextureConverter(),
                new DolphinTextureConverter(),
                new DonkeyTextureConverter(),
                new DrownedTextureConverter(),
                new ElderGuardianTextureConverter(),
                new EnderDragonTextureConverter(),
                new EndermanTextureConverter(),
                new EndermiteTextureConverter(),
                new EvokerTextureConverter(),
                new FoxTextureConverter(),
                new FrogTextureConverter(),
                new GhastTextureConverter(),
                new GiantTextureConverter(),
                new GlowSquidTextureConverter(),
                new GoatTextureConverter(),
                new GuardianTextureConverter(),
                new HappyGhastTextureConverter(),
                new HoglinTextureConverter(),
                new HorseTextureConverter(),
                new HuskTextureConverter(),
                new IllusionerTextureConverter(),
                new IronGolemTextureConverter(),
                new LlamaTextureConverter(),
                new MagmaCubeTextureConverter(),
                new MuleTextureConverter(),
                new MushroomCowTextureConverter(),
                new NautilusTextureConverter(),
                new OcelotTextureConverter(),
                new PandaTextureConverter(),
                new ParchedTextureConverter(),
                new ParrotTextureConverter(),
                new PhantomTextureConverter(),
                new PiglinBruteTextureConverter(),
                new PiglinTextureConverter(),
                new PigTextureConverter(),
                new PigZombieTextureConverter(),
                new PillagerTextureConverter(),
                new PolarBearTextureConverter(),
                new PufferFishTextureConverter(),
                new RabbitTextureConverter(),
                new RavagerTextureConverter(),
                new SalmonTextureConverter(),
                new SheepTextureConverter(),
                new ShulkerTextureConverter(),
                new SilverfishTextureConverter(),
                new SkeletonHorseTextureConverter(),
                new SkeletonTextureConverter(),
                new SlimeTextureConverter(),
                new SnifferTextureConverter(),
                new SnowmanTextureConverter(),
                new SpiderTextureConverter(),
                new SquidTextureConverter(),
                new StrayTextureConverter(),
                new StriderTextureConverter(),
                new TadpoleTextureConverter(),
                new TraderLlamaTextureConverter(),
//                new TropicalFishTextureConverter(),
                new TurtleTextureConverter(),
//                new VexTextureConverter(),
                new VillagerTextureConverter(),
                new VindicatorTextureConverter(),
//                new WanderingTraderTextureConverter(),
//                new WardenTextureConverter(),
//                new WitchTextureConverter(),
//                new WitherTextureConverter(),
                new WitherSkeletonTextureConverter(),
                new WolfTextureConverter(),
                new ZoglinTextureConverter(),
                new ZombieHorseTextureConverter(),
                new ZombieTextureConverter(),
//                new ZombieNautilusTextureConverter(),
                new ZombieVillagerTextureConverter()
        );
    }

    public void generate(Path source, Path out) throws IOException {
        List<Path> files;
        try (Stream<Path> stream = Files.walk(source)) {
            files = stream.map(source::relativize).toList();
        }
        for (var converter : converters) {
            var supportedFiles = files.stream()
                    .filter(path -> converter.getSupportedFiles().stream().anyMatch(pattern -> pattern.matcher(path.getFileName().toString()).matches()))
                    .toList();
            converter.convert(source, supportedFiles, out);
        }
    }
}
