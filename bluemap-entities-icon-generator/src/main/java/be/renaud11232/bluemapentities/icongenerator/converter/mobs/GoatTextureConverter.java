package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;
import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GoatTextureConverter extends TextureConverter {
    public GoatTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage headTop = texture.getSubimage(44, 46, 5, 10);
            BufferedImage headLeft = ImageOperations.rotate(texture.getSubimage(34, 58, 10, 1), 90);
            BufferedImage headRight = ImageOperations.rotate(texture.getSubimage(49, 58, 10, 1), -90);
            BufferedImage leftEar = texture.getSubimage(3, 62, 3, 2);
            BufferedImage rightEar = ImageOperations.flop(leftEar);
            BufferedImage horn = texture.getSubimage(14, 57, 2, 7);
            icon.drawImage(horn, 11, 2, horn.getWidth() * 2, horn.getHeight() * 2, null);
            icon.drawImage(horn, 17, 2, horn.getWidth() * 2, horn.getHeight() * 2, null);
            icon.drawImage(headTop, 11, 10, headTop.getWidth() * 2, headTop.getHeight() * 2, null);
            icon.drawImage(headLeft, 10, 10, headLeft.getWidth(), headLeft.getHeight() * 2, null);
            icon.drawImage(headRight, 21, 10, headRight.getWidth(), headRight.getHeight() * 2, null);
            icon.drawImage(leftEar, 5, 12, leftEar.getWidth() * 2, leftEar.getHeight() * 2, null);
            icon.drawImage(rightEar, 21, 12, rightEar.getWidth() * 2, rightEar.getHeight() * 2, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage headTop = texture.getSubimage(6, 0, 4, 6);
            BufferedImage headLeft = ImageOperations.rotate(texture.getSubimage(0, 7, 6, 1), 90);
            BufferedImage headRight = ImageOperations.rotate(texture.getSubimage(10, 7, 6, 1), -90);
            BufferedImage leftEar = texture.getSubimage(1, 10, 2, 1);
            BufferedImage rightEar = texture.getSubimage(1, 12, 2, 1);
            BufferedImage leftHorn = texture.getSubimage(22, 1, 1, 2);
            BufferedImage rightHorn = texture.getSubimage(26, 1, 1, 2);
            icon.drawImage(headTop, 13, 11, headTop.getWidth() * 2, headTop.getHeight() * 2, null);
            icon.drawImage(headLeft, 12, 11, headLeft.getWidth(), headLeft.getHeight() * 2, null);
            icon.drawImage(headRight, 21, 11, headRight.getWidth(), headRight.getHeight() * 2, null);
            icon.drawImage(leftHorn, 14, 9, leftHorn.getWidth() * 2, leftHorn.getHeight() * 2, null);
            icon.drawImage(rightHorn, 18, 9, rightHorn.getWidth() * 2, rightHorn.getHeight() * 2, null);
            icon.drawImage(leftEar, 9, 12, leftEar.getWidth() * 2, leftEar.getHeight() * 2, null);
            icon.drawImage(rightEar, 21, 12, rightEar.getWidth() * 2, rightEar.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^goat\\.png$")),
                        List.of("goat.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^goat_baby\\.png$")),
                        List.of("goat_baby.png")
                )
        );
    }
}
