package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class EndermiteTextureConverter extends TextureConverter {
    public EndermiteTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage body = texture.getSubimage(5, 10, 6, 4);
            BufferedImage head = texture.getSubimage(2, 2, 4, 3);
            icon.drawImage(body, 4, 8, body.getWidth() * 4, body.getHeight() * 4, null);
            icon.drawImage(head, 8, 12, head.getWidth() * 4, head.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^endermite\\.png$")),
                        List.of("endermite.png")
                )
        );
    }
}
