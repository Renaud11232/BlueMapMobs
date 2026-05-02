package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class WolfTextureConverter extends TextureConverter {
    public WolfTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(4, 4, 6, 6);
            BufferedImage nose = texture.getSubimage(4, 14, 3, 3);
            BufferedImage ear = texture.getSubimage(17, 15, 2, 2);
            icon.drawImage(head, 4, 8, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 10, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(ear, 4, 0, ear.getWidth() * 4, ear.getHeight() * 4, null);
            icon.drawImage(ear, 20, 0, ear.getWidth() * 4, ear.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(5, 17, 6, 5);
            BufferedImage nose = texture.getSubimage(19, 14, 3, 2);
            BufferedImage leftEar = texture.getSubimage(1, 6, 2, 2);
            BufferedImage rightEar = texture.getSubimage(21, 6, 2, 2);
            icon.drawImage(head, 4, 10, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 10, 22, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(leftEar, 4, 2, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
            icon.drawImage(rightEar, 20, 2, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^wolf((?:_(?:ashen|black|chestnut|rusty|snowy|spotted|striped|woods))?)((?:_(?:angry|tame))?)\\.png$")),
                        List.of("wolf$1$2.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^wolf((?:_(?:ashen|black|chestnut|rusty|snowy|spotted|striped|woods))?)((?:_(?:angry|tame))?)_baby\\.png$")),
                        List.of("wolf$1$2_baby.png")
                )
        );
    }
}
