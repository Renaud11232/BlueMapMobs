package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GhastTextureConverter extends TextureConverter {
    public GhastTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(32, 32, 32, 32);
            icon.drawImage(head, 0, 0, head.getWidth(), head.getHeight(), null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^ghast\\.png$")),
                        List.of("ghast.png")
                )
        );
    }
}
