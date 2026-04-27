package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ChickenTextureConverter extends TextureConverter {
    public ChickenTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(3, 3, 4, 6);
            BufferedImage beak = texture.getSubimage(16, 2, 4, 2);
            icon.drawImage(head, 8, 4, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(beak, 8, 12, beak.getWidth() * 4, beak.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(4, 4, 4, 4);
            BufferedImage beak = texture.getSubimage(11, 9, 2, 1);
            icon.drawImage(head, 8, 8, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(beak, 12, 16, beak.getWidth() * 4, beak.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^chicken_(cold|temperate|warm)\\.png$")),
                        List.of("chicken_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^chicken_(cold|temperate|warm)_baby\\.png$")),
                        List.of("chicken_$1_baby.png")
                )
        );
    }
}
