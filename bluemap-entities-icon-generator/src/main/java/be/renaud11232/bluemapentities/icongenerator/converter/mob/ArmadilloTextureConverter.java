package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;
import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ArmadilloTextureConverter extends TextureConverter {
    public ArmadilloTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage headTop = texture.getSubimage(45, 17, 3, 5);
            BufferedImage headLeft = texture.getSubimage(44, 17, 1, 5);
            BufferedImage headRight = texture.getSubimage(48, 17, 1, 5);
            BufferedImage leftEar = texture.getSubimage(43, 10, 2, 4);
            BufferedImage rightEar = texture.getSubimage(47, 10, 2, 4);
            icon.drawImage(headTop, 10, 12, headTop.getWidth() * 4, headTop.getHeight() * 4, null);
            icon.drawImage(headLeft, 9, 12, headLeft.getWidth(), headLeft.getHeight() * 4, null);
            icon.drawImage(headRight, 22, 12, headRight.getWidth(), headRight.getHeight() * 4, null);
            icon.drawImage(leftEar, 2, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 22, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage headTop = texture.getSubimage(24, 17, 2, 4);
            BufferedImage headLeft = ImageOperations.rotate(texture.getSubimage(20, 21, 4, 1), 90);
            BufferedImage headRight = ImageOperations.rotate(texture.getSubimage(26, 21, 4, 1), -90);
            BufferedImage leftEar = texture.getSubimage(24, 8, 2, 3);
            BufferedImage rightEar = texture.getSubimage(28, 8, 2, 3);
            icon.drawImage(headTop, 12, 12, headTop.getWidth() * 4, headTop.getHeight() * 4, null);
            icon.drawImage(headLeft, 11, 12, headLeft.getWidth(), headLeft.getHeight() * 4, null);
            icon.drawImage(headRight, 20, 12, headRight.getWidth(), headRight.getHeight() * 4, null);
            icon.drawImage(leftEar, 4, 4, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 20, 4, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^armadillo\\.png$")),
                        List.of("armadillo.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^armadillo_baby\\.png$")),
                        List.of("armadillo_baby.png")
                )
        );
    }
}
