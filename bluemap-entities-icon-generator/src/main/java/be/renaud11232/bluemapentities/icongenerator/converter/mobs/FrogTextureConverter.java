package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class FrogTextureConverter extends TextureConverter {
    public FrogTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage headTop = texture.getSubimage(9, 22, 7, 3);
            BufferedImage headBottom = texture.getSubimage(12, 10, 7, 3);
            BufferedImage leftEye =  texture.getSubimage(3, 3, 3, 2);
            BufferedImage rightEye =  texture.getSubimage(3, 8, 3, 2);
            icon.drawImage(headTop, 2, 10, headTop.getWidth() * 4, headTop.getHeight() * 4, null);
            icon.drawImage(headBottom, 2, 18, headBottom.getWidth() * 4, headBottom.getHeight() * 4, null);
            icon.drawImage(leftEye, 2, 2, leftEye.getWidth() * 4, leftEye.getHeight() * 4, null);
            icon.drawImage(rightEye, 18, 2, rightEye.getWidth() * 4, rightEye.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^frog_(cold|temperate|warm)\\.png$")),
                        List.of("frog_$1.png")
                )
        );
    }
}
