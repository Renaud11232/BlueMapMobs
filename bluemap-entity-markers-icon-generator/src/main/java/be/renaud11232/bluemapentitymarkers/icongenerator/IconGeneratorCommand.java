package be.renaud11232.bluemapentitymarkers.icongenerator;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Callable;

@Command(
        name = "generate-icons",
        description = "Processes Minecraft texture to produce BlueMapEntityMarkers icons"
)
@SuppressWarnings("unused")
public class IconGeneratorCommand implements Callable<Integer> {
    @Parameters(
            index = "0",
            description = "The folder where Minecraft textures are stored"
    )
    private Path source;

    @Option(
            names = {"-o", "--output"},
            description = "The directory where icons will be saved",
            defaultValue = "./out"
    )
    private Path out;

    static void main(String[] args) {
        System.exit(new CommandLine(new IconGeneratorCommand()).execute(args));
    }

    @Override
    public Integer call() throws Exception {
        if (Files.notExists(source) || !Files.isDirectory(source)) {
            throw new RuntimeException(source + " is not a valid directory.");
        }
        if (Files.notExists(out)) {
            Files.createDirectories(out);
        }
        if (!Files.isDirectory(out)) {
            throw new RuntimeException(out + " is not a directory.");
        }
        new IconGenerator().generate(source, out);
        return 0;
    }
}
