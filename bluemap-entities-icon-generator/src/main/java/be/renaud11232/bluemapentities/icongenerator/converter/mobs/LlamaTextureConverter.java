package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

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
            for (int x = 0; x <= 5; x++) {
                BufferedImage left = texture.getSubimage(x, 20, 1, 10);
                icon.drawImage(left, 0, 6, left.getWidth() * 2, left.getHeight() * 4, null);
            }
            for (int x = 19; x >= 14; x--) {
                BufferedImage right = texture.getSubimage(x, 20, 1, 10);
                icon.drawImage(right, 30, 6, right.getWidth() * 2, right.getHeight() * 4, null);
            }
            for (int y = 14; y <= 19; y++) {
                BufferedImage top = texture.getSubimage(6, y, 8, 1);
                icon.drawImage(top, 0, 6, top.getWidth() * 4, top.getHeight() * 2, null);
            }
            BufferedImage face = texture.getSubimage(6, 20, 8, 10);
            icon.drawImage(face, 0, 6, face.getWidth() * 4, face.getHeight() * 4, null);
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
                        List.of(Pattern.compile("^llama_decor_(black|blue|brown|cyan|gray|green|light_blue|light_gray|lime|magenta|orange|pink|purple|red|white|yellow)\\.png$")),
                        List.of("llama_decor_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^llama_(brown|creamy|gray|white)_baby\\.png$")),
                        List.of("llama_$1_baby.png")
                )
        );
    }
}
