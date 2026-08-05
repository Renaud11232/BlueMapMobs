package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PigTextureConverter extends TextureConverter {
    public PigTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(8, 8, 8, 8);
            BufferedImage nose = texture.getSubimage(17, 17, 4, 3);
            icon.drawImage(face, 0, 0, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(6, 21, 7, 6);
            BufferedImage nose = texture.getSubimage(7, 28, 3, 2);
            icon.drawImage(face, 2, 4, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 10, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^pig_(cold|temperate|warm)\\.png$")),
                        List.of("pig_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^pig_(cold|temperate|warm)_baby\\.png$")),
                        List.of("pig_$1_baby.png")
                )
        );
    }
}
