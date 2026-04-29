package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class OcelotTextureConverter extends TextureConverter {
    public OcelotTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(5, 5, 5, 4);
            BufferedImage nose = texture.getSubimage(2, 26, 3, 2);
            BufferedImage leftEar = texture.getSubimage(2, 12, 1, 1);
            BufferedImage rightEar = texture.getSubimage(8, 12, 1, 1);
            icon.drawImage(face, 1, 7, face.getWidth() * 6, face.getHeight() * 6, null);
            icon.drawImage(nose, 7, 19, nose.getWidth() * 6, nose.getHeight() * 6, null);
            icon.drawImage(leftEar, 4, 1, leftEar.getWidth() * 6, leftEar.getHeight() * 6, null);
            icon.drawImage(rightEar, 22, 1, rightEar.getWidth() * 6, rightEar.getHeight() * 6, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(4, 4, 5, 4);
            BufferedImage nose = texture.getSubimage(19, 4, 3, 2);
            BufferedImage leftEar = texture.getSubimage(20, 2, 1, 1);
            BufferedImage rightEar = texture.getSubimage(26, 2, 1, 1);
            icon.drawImage(face, 1, 7, face.getWidth() * 6, face.getHeight() * 6, null);
            icon.drawImage(nose, 7, 19, nose.getWidth() * 6, nose.getHeight() * 6, null);
            icon.drawImage(leftEar, 4, 1, leftEar.getWidth() * 6, leftEar.getHeight() * 6, null);
            icon.drawImage(rightEar, 22, 1, rightEar.getWidth() * 6, rightEar.getHeight() * 6, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^ocelot\\.png$")),
                        List.of("ocelot.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^ocelot_baby\\.png$")),
                        List.of("ocelot_baby.png")
                )
        );
    }
}
