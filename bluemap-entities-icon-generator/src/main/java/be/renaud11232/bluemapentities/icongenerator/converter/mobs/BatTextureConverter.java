package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class BatTextureConverter extends TextureConverter {
    public BatTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage leftEar =  texture.getSubimage(1, 15, 3, 5);
            BufferedImage rightEar =  texture.getSubimage(8, 15, 3, 5);
            BufferedImage face = texture.getSubimage(2, 9, 4, 3);
            icon.drawImage(leftEar, 0, 4, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 20, 4, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
            icon.drawImage(face, 8, 16, face.getWidth() * 4, face.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^bat\\.png$")),
                        List.of("bat.png")
                )
        );
    }
}
