package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class FoxTextureConverter extends TextureConverter {
    public FoxTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(7, 11, 8, 6);
            BufferedImage nose = texture.getSubimage(9, 21, 4, 2);
            BufferedImage leftEar = texture.getSubimage(9, 2, 2, 2);
            BufferedImage rightEar = texture.getSubimage(16, 2, 2, 2);
            icon.drawImage(face, 0, 8, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 8, 24, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(leftEar, 0, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 24, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(5, 5, 6, 5);
            BufferedImage nose = texture.getSubimage(20, 22, 2, 2);
            BufferedImage leftEar = texture.getSubimage(23, 9, 2, 2);
            BufferedImage rightEar = texture.getSubimage(23, 12, 2, 2);
            icon.drawImage(face, 4, 10, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 12, 22, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(leftEar, 4, 2, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 20, 2, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^fox((?:_snow)?(?:_sleep)?)\\.png$")),
                        List.of("fox$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^fox((?:_snow)?(?:_sleep)?)_baby\\.png$")),
                        List.of("fox$1_baby.png")
                )
        );
    }
}
