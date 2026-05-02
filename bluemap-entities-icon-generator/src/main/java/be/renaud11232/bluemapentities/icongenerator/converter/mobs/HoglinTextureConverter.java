package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class HoglinTextureConverter extends TextureConverter {
    public HoglinTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(80, 1, 14, 19);
            BufferedImage leftTusk = texture.getSubimage(3, 13, 2, 2);
            BufferedImage rightTusk = texture.getSubimage(12, 13, 2, 2);
            icon.drawImage(face, 2, -6, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(leftTusk, 0, 16, leftTusk.getWidth() * 2, leftTusk.getHeight() * 2, null);
            icon.drawImage(rightTusk, 28, 16, rightTusk.getWidth() * 2, rightTusk.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(12, 0, 10, 12);
            BufferedImage leftTusk = texture.getSubimage(46, 29, 2, 2);
            BufferedImage rightTusk = texture.getSubimage(54, 29, 2, 2);
            icon.drawImage(face, 6, 4, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(leftTusk, 2, 20, leftTusk.getWidth() * 2, leftTusk.getHeight() * 2, null);
            icon.drawImage(rightTusk, 26, 20, rightTusk.getWidth() * 2, rightTusk.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^hoglin\\.png$")),
                        List.of("hoglin.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^hoglin_baby\\.png$")),
                        List.of("hoglin_baby.png")
                )
        );
    }
}
