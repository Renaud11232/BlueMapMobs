package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TadpoleTextureConverter extends TextureConverter {
    public TadpoleTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(3, 3, 3, 2);
            icon.drawImage(head, 1, 6, head.getWidth() * 10, head.getHeight() * 10, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^tadpole\\.png$")),
                        List.of("tadpole.png")
                )
        );
    }
}
