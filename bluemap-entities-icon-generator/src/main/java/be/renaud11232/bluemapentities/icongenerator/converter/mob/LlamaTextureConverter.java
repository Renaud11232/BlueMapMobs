package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class LlamaTextureConverter extends TextureConverter {
    public LlamaTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage ear = texture.getSubimage(19, 2, 3, 3);
            BufferedImage face = texture.getSubimage(6, 20, 8, 6);
            BufferedImage nose = texture.getSubimage(9, 9, 4, 4);
            icon.drawImage(ear, 0, -2, ear.getWidth() * 4, ear.getHeight() * 4, null);
            icon.drawImage(ear, 20, -2, ear.getWidth() * 4, ear.getHeight() * 4, null);
            icon.drawImage(face, 0, 8, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 8, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(4, 4, 6, 5);
            BufferedImage nose = texture.getSubimage(3, 18, 3, 3);
            BufferedImage leftEar = texture.getSubimage(22, 2, 2, 2);
            BufferedImage rightEar = texture.getSubimage(22, 6, 2, 2);
            icon.drawImage(face, 4, 10, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 10, 18, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(leftEar, 4, 2, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 20, 2, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^llama_(brown|creamy|gray|white)\\.png$")),
                        List.of("llama_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^llama_(brown|creamy|gray|white)_baby\\.png$")),
                        List.of("llama_$1_baby.png")
                )
        );
    }
}
