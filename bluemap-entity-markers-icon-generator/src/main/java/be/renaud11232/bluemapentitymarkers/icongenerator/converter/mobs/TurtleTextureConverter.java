package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.ImageOperations;
import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TurtleTextureConverter extends TextureConverter {
    public TurtleTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(3, 6, 6, 5);
            BufferedImage shell1 = ImageOperations.rotate(texture.getSubimage(7, 43, 6, 1), 90);
            BufferedImage shell2 = ImageOperations.rotate(texture.getSubimage(31, 4, 3, 1), 90);
            icon.drawImage(head, 4, 8, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(shell1, 0, -4, shell1.getWidth() * 4, shell1.getHeight() * 4, null);
            icon.drawImage(shell2, 0, 20, shell2.getWidth() * 4, shell2.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(0, 9, 3, 3);
            BufferedImage shell = texture.getSubimage(3, 4, 1, 2);
            icon.drawImage(head, 12, 10, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(shell, 8, 14, shell.getWidth() * 4, shell.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^turtle\\.png$")),
                        List.of("turtle.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^turtle_baby\\.png$")),
                        List.of("turtle_baby.png")
                )
        );
    }
}
