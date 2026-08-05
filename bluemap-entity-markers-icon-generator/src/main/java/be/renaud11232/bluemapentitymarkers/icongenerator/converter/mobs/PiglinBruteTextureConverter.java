package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PiglinBruteTextureConverter extends TextureConverter {
    public PiglinBruteTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(8, 8, 10, 8);
            BufferedImage nose = texture.getSubimage(32, 2, 4, 4);
            BufferedImage leftTusk = texture.getSubimage(3, 1, 1, 2);
            BufferedImage rightTusk = texture.getSubimage(3, 5, 1, 2);
            icon.drawImage(face, -4, 0, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(leftTusk, 4, 24, leftTusk.getWidth() * 4, leftTusk.getHeight() * 4, null);
            icon.drawImage(rightTusk, 24, 24, rightTusk.getWidth() * 4, rightTusk.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^piglin_brute\\.png$")),
                        List.of("piglin_brute.png")
                )
        );
    }
}
