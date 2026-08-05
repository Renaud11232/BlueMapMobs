package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.ImageOperations;
import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PolarBearTextureConverter extends TextureConverter {
    public PolarBearTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage leftEar = texture.getSubimage(27, 1, 2, 2);
            BufferedImage rightEar = ImageOperations.flop(leftEar);
            BufferedImage face = texture.getSubimage(7, 7, 7, 7);
            BufferedImage nose = texture.getSubimage(3, 47, 5, 3);
            icon.drawImage(leftEar, -2, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 26, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
            icon.drawImage(face, 2, 4, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 6, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage leftEar = texture.getSubimage(21, 1, 2, 2);
            BufferedImage rightEar = texture.getSubimage(27, 1, 2, 2);
            BufferedImage face = texture.getSubimage(4, 4, 6, 5);
            BufferedImage nose = texture.getSubimage(22, 5, 4, 2);
            icon.drawImage(leftEar, 0, 4, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 24, 4, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
            icon.drawImage(face, 4, 8, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 8, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^polar_bear\\.png$")),
                        List.of("polar_bear.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^polar_bear_baby\\.png$")),
                        List.of("polar_bear_baby.png")
                )
        );
    }
}
