package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static be.renaud11232.bluemapentities.icongenerator.ImageOperations.flop;
import static be.renaud11232.bluemapentities.icongenerator.ImageOperations.rotate;

public class CamelTextureConverter extends TextureConverter {
    public CamelTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(21, 7, 7, 14);
            BufferedImage nose = texture.getSubimage(50, 6, 6, 5);
            BufferedImage ear = flop(rotate(texture.getSubimage(72, 0, 3, 2), 90));
            icon.drawImage(face, 4, 4, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(nose, 18, 4, nose.getWidth() * 2, nose.getHeight() * 2, null);
            icon.drawImage(ear, 5, 0, ear.getWidth() * 2, ear.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(0, 5, 5, 9);
            BufferedImage nose = texture.getSubimage(0, 17, 3, 4);
            BufferedImage ear = flop(rotate(texture.getSubimage(42, 0, 3, 2), 90));
            icon.drawImage(face, 8, 9, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(nose, 18, 9, nose.getWidth() * 2, nose.getHeight() * 2, null);
            icon.drawImage(ear, 9, 5, ear.getWidth() * 2, ear.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^camel\\.png$")),
                        List.of("camel.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^camel_baby\\.png$")),
                        List.of("camel_baby.png")
                )
        );
    }
}
