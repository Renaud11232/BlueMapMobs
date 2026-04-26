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
                new ArmadilloTextureConverter(),
                new CamelHuskTextureConverter(),
                new CamelTextureConverter(),
                new DonkeyTextureConverter(),
                new DrownedTextureConverter(),
                new FoxTextureConverter(),
                new GlowSquidTextureConverter(),
                new GoatTextureConverter(),
                new HoglinTextureConverter(),
                new HorseTextureConverter(),
                new HuskTextureConverter(),
                new LlamaTextureConverter(),
                new MuleTextureConverter(),
                new NautilusTextureConverter(),
                new PandaTextureConverter(),
                new PiglinTextureConverter(),
                new PigTextureConverter(),
                new PigZombieTextureConverter(),
                new PolarBearTextureConverter(),
                new RabbitTextureConverter(),
                new SheepTextureConverter(),
                new SkeletonHorseTextureConverter(),
                new SnifferTextureConverter(),
                new SquidTextureConverter(),
                new StriderTextureConverter(),
                new TurtleTextureConverter(),
                new TraderLlamaTextureConverter(),
                new VillagerTextureConverter(),
                new WolfTextureConverter(),
                new ZoglinTextureConverter(),
                new ZombieHorseTextureConverter(),
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
