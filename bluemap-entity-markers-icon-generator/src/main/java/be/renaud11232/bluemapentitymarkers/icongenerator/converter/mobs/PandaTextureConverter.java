package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PandaTextureConverter extends TextureConverter {
    public PandaTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage ear = texture.getSubimage(53, 26, 5, 4);
            BufferedImage face = texture.getSubimage(9, 15, 13, 10);
            BufferedImage nose = texture.getSubimage(47, 18, 7, 5);
            icon.drawImage(ear, 0, 3, ear.getWidth() * 2, ear.getHeight() * 2, null);
            icon.drawImage(ear, 22, 3, ear.getWidth() * 2, ear.getHeight() * 2, null);
            icon.drawImage(face, 3, 9, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(nose, 9, 19, nose.getWidth() * 2, nose.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage leftEar = texture.getSubimage(25, 1, 3, 3);
            BufferedImage rightEar = texture.getSubimage(34, 1, 3, 3);
            BufferedImage face = texture.getSubimage(5, 5, 7, 6);
            BufferedImage nose = texture.getSubimage(25, 7, 4, 2);
            icon.drawImage(leftEar, 7, 9, leftEar.getWidth() * 2, leftEar.getHeight() * 2, null);
            icon.drawImage(rightEar, 19, 9, rightEar.getWidth() * 2, rightEar.getHeight() * 2, null);
            icon.drawImage(face, 9, 11, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(nose, 12, 19, nose.getWidth() * 2, nose.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^panda((?:_(?:aggressive|brown|lazy|playful|weak|worried))?)\\.png$")),
                        List.of("panda$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^((?:(?:aggressive|brown|lazy|playful|weak|worried)_)?)panda_baby\\.png$")),
                        List.of("panda_$1baby.png")
                )
        );
    }
}
