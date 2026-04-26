package be.renaud11232.bluemapentities.icongenerator.converter;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public abstract class TextureConverter {
    private final List<BiConsumer<List<BufferedImage>, List<Graphics2D>>> converters;

    public TextureConverter() {
        converters = new ArrayList<>();
    }

    protected void registerTexturesConversions(BiConsumer<List<BufferedImage>, List<Graphics2D>> converter) {
        converters.add(converter);
    }

    protected void registerTexturesConversion(BiConsumer<List<BufferedImage>, Graphics2D> converter) {
        converters.add((textures, icons) -> converter.accept(textures, icons.getFirst()));
    }

    protected void registerTextureConversions(BiConsumer<BufferedImage, List<Graphics2D>> converter) {
        converters.add((textures, icons) -> converter.accept(textures.getFirst(), icons));
    }

    protected void registerTextureConversion(BiConsumer<BufferedImage, Graphics2D> converter) {
        converters.add((textures, icons) -> converter.accept(textures.getFirst(), icons.getFirst()));
    }

    public void convert(Path sourceDir, List<Path> sources, Path outDir) throws IOException {
        Map<Path, BufferedImage> textures = new HashMap<>();
        for (var source : sources) {
            textures.put(source, loadImage(sourceDir, source));
        }
        var conversions = getConversions();
        for (int conversionIndex = 0; conversionIndex < conversions.size(); conversionIndex++) {
            var conversion = conversions.get(conversionIndex);
            var converter = converters.get(conversionIndex);
            Map<List<String>, List<Path>> groupedSources = new HashMap<>();
            Map<List<String>, Matcher> matchers = new HashMap<>();
            Map<List<String>, List<String>> groupedOutputs = new HashMap<>();
            for (var inputPattern : conversion.getKey()) {
                for (var source : sources) {
                    var matcher = inputPattern.matcher(source.getFileName().toString());
                    if (matcher.matches()) {
                        List<String> groups = new ArrayList<>();
                        for (int g = 0; g < matcher.groupCount(); g++) {
                            groups.add(matcher.group(g));
                        }
                        matchers.put(groups, matcher);
                        groupedSources.computeIfAbsent(groups, _ -> new ArrayList<>()).add(source);
                    }
                }
            }
            for (var outputFileTemplate : conversion.getValue()) {
                for (var groups : groupedSources.keySet()) {
                    groupedOutputs.computeIfAbsent(groups, _ -> new ArrayList<>()).add(matchers.get(groups).replaceAll(outputFileTemplate));
                }
            }
            for (var groups : groupedSources.keySet()) {
                convert(
                        converter,
                        groupedSources.get(groups).stream().map(textures::get).toList(),
                        outDir,
                        groupedOutputs.get(groups)
                );
            }

        }
    }

    private void convert(BiConsumer<List<BufferedImage>, List<Graphics2D>> converter, List<BufferedImage> textures, Path outDir, List<String> outputNames) throws IOException {
        var outputs = outputNames.stream().map(_ -> ImageOperations.newImage(32, 32)).toList();
        var graphics = outputs.stream().map(ImageOperations::createGraphics).toList();
        converter.accept(textures, graphics);
        graphics.forEach(Graphics::dispose);
        for (int i = 0; i < outputs.size(); i++) {
            saveImage(outDir, outputNames.get(i), outputs.get(i));
        }
    }

    private static BufferedImage loadImage(Path directory, Path file) throws IOException {
        Path filePath = directory.resolve(file);
        try (var is = Files.newInputStream(filePath)) {
            return ImageIO.read(is);
        }
    }

    protected static void saveImage(Path directory, String fileName, BufferedImage image) throws IOException {
        Path filePath = directory.resolve(fileName);
        if (Files.notExists(filePath.getParent())) {
            Files.createDirectories(filePath.getParent());
        }
        try (var os = Files.newOutputStream(filePath)) {
            ImageIO.write(image, "png", os);
        }
    }

    protected abstract List<Map.Entry<List<Pattern>, List<String>>> getConversions();

    public Set<Pattern> getSupportedFiles() {
        return getConversions().stream()
                .map(Map.Entry::getKey)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }
}
