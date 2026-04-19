package be.renaud11232.bluemapentities.textures.converter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;

public abstract class SimpleTextureConverter implements Converter {
    @Override
    public boolean convert(Path path) throws IOException {
        BufferedImage texture;
        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);
        if (attributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).getYear() != 1980) {
            return false;
        }
        try (var is = Files.newInputStream(path)) {
            texture = ImageIO.read(is);
        }
        BufferedImage icon = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
        Graphics2D iconGraphics = icon.createGraphics();
        iconGraphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        buildGraphics(texture, iconGraphics);
        iconGraphics.dispose();
        try (var os = Files.newOutputStream(path)) {
            ImageIO.write(icon, "png", os);
        }
        try {
            new ProcessBuilder("magick", "mogrify", "-strip", path.toString())
                    .redirectError(ProcessBuilder.Redirect.DISCARD)
                    .redirectOutput(ProcessBuilder.Redirect.DISCARD)
                    .start()
                    .waitFor();
        } catch (IOException ignored) {
            //magick is not installed, can't use mogrify but the image is still there
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    protected abstract void buildGraphics(BufferedImage texture, Graphics2D icon);
}
