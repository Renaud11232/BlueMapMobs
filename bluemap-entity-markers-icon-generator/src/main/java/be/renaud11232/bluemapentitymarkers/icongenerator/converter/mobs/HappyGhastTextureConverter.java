package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class HappyGhastTextureConverter extends TextureConverter {
    public HappyGhastTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(32, 32, 32, 32);
            icon.drawImage(head, 0, 0, head.getWidth(), head.getHeight(), null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage top = texture.getSubimage(32, 32, 32, 32);
            BufferedImage glasses = texture.getSubimage(10, 67, 32, 32);
            icon.drawImage(top, 0, 0, top.getWidth(), top.getHeight(), null);
            icon.drawImage(glasses, 0, 0, glasses.getWidth(), glasses.getHeight(), null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(16, 16, 16, 16);
            icon.drawImage(head, 0, 0, head.getWidth() * 2, head.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^happy_ghast\\.png$")),
                        List.of("happy_ghast.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^(black|blue|brown|cyan|gray|green|light_blue|light_gray|lime|magenta|orange|pink|purple|red|white|yellow)_harness\\.png$")),
                        List.of("happy_ghast_harness_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^happy_ghast_baby\\.png$")),
                        List.of("happy_ghast_baby.png")
                )
        );
    }
}
