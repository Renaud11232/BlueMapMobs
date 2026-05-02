package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class StriderTextureConverter extends TextureConverter {
    public StriderTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(16, 16, 16, 14);
            icon.drawImage(face, 0, 2, face.getWidth() * 2, face.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(8, 8, 7, 7);
            icon.drawImage(face, 9, 9, face.getWidth() * 2, face.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^strider((?:_cold)?)\\.png$")),
                        List.of("strider$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^strider((?:_cold)?)_baby\\.png$")),
                        List.of("strider$1_baby.png")
                )
        );
    }
}
