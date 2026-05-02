package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GlowSquidTextureConverter extends TextureConverter {
    public GlowSquidTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(12, 12, 12, 16);
            icon.drawImage(face, 4, 0, face.getWidth() * 2, face.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(8, 8, 8, 10);
            icon.drawImage(face, 8, 6, face.getWidth() * 2, face.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^glow_squid\\.png$")),
                        List.of("glow_squid.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^glow_squid_baby\\.png$")),
                        List.of("glow_squid_baby.png")
                )
        );
    }
}
