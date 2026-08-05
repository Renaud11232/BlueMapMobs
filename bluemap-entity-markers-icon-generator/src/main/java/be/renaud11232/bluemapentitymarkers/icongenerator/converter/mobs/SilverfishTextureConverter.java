package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SilverfishTextureConverter extends TextureConverter {
    public SilverfishTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage neck = texture.getSubimage(2, 6, 4, 3);
            BufferedImage head = texture.getSubimage(2, 2, 3, 2);
            BufferedImage hair = texture.getSubimage(22, 20, 6, 5);
            icon.drawImage(neck, 8, 14, neck.getWidth() * 4, neck.getHeight() * 4, null);
            icon.drawImage(head, 10, 18, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(hair, 4, 6, hair.getWidth() * 4, hair.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^silverfish\\.png$")),
                        List.of("silverfish.png")
                )
        );
    }
}
