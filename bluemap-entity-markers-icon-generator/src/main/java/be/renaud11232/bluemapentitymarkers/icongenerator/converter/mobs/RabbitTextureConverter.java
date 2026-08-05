package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RabbitTextureConverter extends TextureConverter {
    public RabbitTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage leftEar = texture.getSubimage(27, 1, 2, 5);
            BufferedImage rightEar = texture.getSubimage(33, 1, 2, 5);
            BufferedImage face = texture.getSubimage(5, 21, 5, 5);
            icon.drawImage(leftEar, 6, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 18, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
            icon.drawImage(face, 6, 12, face.getWidth() * 4, face.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage leftEar = texture.getSubimage(19, 1, 2, 4);
            BufferedImage rightEar = texture.getSubimage(25, 1, 2, 4);
            BufferedImage face = texture.getSubimage(4, 4, 5, 4);
            icon.drawImage(leftEar, 6, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 18, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
            icon.drawImage(face, 6, 16, face.getWidth() * 4, face.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^rabbit_(black|brown|caerbannog|gold|salt|toast|white|white_splotched)\\.png$")),
                        List.of("rabbit_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^rabbit_(black|brown|caerbannog|gold|salt|toast|white|white_splotched)_baby\\.png$")),
                        List.of("rabbit_$1_baby.png")
                )
        );
    }
}
