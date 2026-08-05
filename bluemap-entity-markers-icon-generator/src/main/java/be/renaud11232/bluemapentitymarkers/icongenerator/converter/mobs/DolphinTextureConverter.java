package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DolphinTextureConverter extends TextureConverter {
    public DolphinTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(0, 6, 6, 7);
            BufferedImage nose = texture.getSubimage(0, 17, 4, 2);
            icon.drawImage(head, -4, 2, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 20, 22, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(0, 4, 4, 5);
            BufferedImage nose = texture.getSubimage(0, 11, 2, 2);
            icon.drawImage(head, 4, 6, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 20, 18, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^dolphin\\.png$")),
                        List.of("dolphin.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^dolphin_baby\\.png$")),
                        List.of("dolphin_baby.png")
                )
        );
    }
}
