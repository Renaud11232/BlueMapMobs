package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class MushroomCowTextureConverter extends TextureConverter {
    public MushroomCowTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(6, 6, 8, 8);
            BufferedImage nose = texture.getSubimage(2, 34, 6, 3);
            icon.drawImage(face, 0, 0, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 4, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(5, 23, 6, 6);
            BufferedImage nose = texture.getSubimage(13, 30, 4, 3);
            icon.drawImage(face, 4, 4, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^mooshroom_(brown|red)\\.png$")),
                        List.of("mushroom_cow_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^mooshroom_(brown|red)_baby\\.png$")),
                        List.of("mushroom_cow_$1_baby.png")
                )
        );
    }
}
