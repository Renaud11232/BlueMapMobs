package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class HuskTextureConverter extends TextureConverter {
    public HuskTextureConverter() {
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(8, 8, 8, 8);
            icon.drawImage(face, 0, 0, face.getWidth() * 4, face.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(9, 9, 6, 6);
            icon.drawImage(face, 4, 4, face.getWidth() * 4, face.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^husk\\.png$")),
                        List.of("husk.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^husk_baby\\.png$")),
                        List.of("husk_baby.png")
                )
        );
    }
}
