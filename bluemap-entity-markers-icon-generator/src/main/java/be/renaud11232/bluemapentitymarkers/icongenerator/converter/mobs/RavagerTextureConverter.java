package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RavagerTextureConverter extends TextureConverter {
    public RavagerTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(16, 16, 16, 20);
            BufferedImage jaw = texture.getSubimage(16, 52, 16, 3);
            BufferedImage nose = texture.getSubimage(4, 4, 4, 8);
            icon.drawImage(head, 0, -10, head.getWidth() * 2, head.getHeight() * 2, null);
            icon.drawImage(jaw, 0, 26, jaw.getWidth() * 2, jaw.getHeight() * 2, null);
            icon.drawImage(nose, 12, 18, nose.getWidth() * 2, nose.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^ravager\\.png$")),
                        List.of("ravager.png")
                )
        );
    }
}
