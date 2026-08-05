package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SnowmanTextureConverter extends TextureConverter {
    public SnowmanTextureConverter() {
        super();
        registerTextureConversion((texture, icon) ->
                icon.drawImage(texture, 0, 0, texture.getWidth() * 2, texture.getHeight() * 2, null)
        );
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 8, 8);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^carved_pumpkin\\.png$")),
                        List.of("snowman.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^snow_golem\\.png$")),
                        List.of("snowman_derp.png")
                )
        );
    }
}
