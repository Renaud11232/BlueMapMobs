package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SnifferTextureConverter extends TextureConverter {
    public SnifferTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 26, 11, 18);
            BufferedImage hair = texture.getSubimage(48, 7, 7, 19);
            BufferedImage nose1 = texture.getSubimage(10, 66, 9, 12);
            BufferedImage nose2 = texture.getSubimage(10, 54, 9, 2);
            icon.drawImage(head, -4, 0, head.getWidth() * 2, head.getHeight() * 2, null);
            icon.drawImage(hair, -4, 0, hair.getWidth() * 2, hair.getHeight() * 2, null);
            icon.drawImage(nose1, 18, 6, nose1.getWidth() * 2, nose1.getHeight() * 2, null);
            icon.drawImage(nose2, 18, 2, nose2.getWidth() * 2, nose2.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(70, 29, 7, 9);
            BufferedImage hair = texture.getSubimage(96, 41, 3, 11);
            BufferedImage nose1 = texture.getSubimage(68, 42, 4, 5);
            BufferedImage nose2 = texture.getSubimage(68, 51, 4, 3);
            icon.drawImage(head, 5, 8, head.getWidth() * 2, head.getHeight() * 2, null);
            icon.drawImage(hair, 5, 8, hair.getWidth() * 2, hair.getHeight() * 2, null);
            icon.drawImage(nose1, 19, 14, nose1.getWidth() * 2, nose1.getHeight() * 2, null);
            icon.drawImage(nose2, 19, 8, nose2.getWidth() * 2, nose2.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^sniffer\\.png$")),
                        List.of("sniffer.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^snifflet\\.png$")),
                        List.of("sniffer_baby.png")
                )
        );
    }
}
