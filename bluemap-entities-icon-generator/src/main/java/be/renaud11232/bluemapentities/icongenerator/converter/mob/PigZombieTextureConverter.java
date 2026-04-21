package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PigZombieTextureConverter extends TextureConverter {
    public PigZombieTextureConverter() {
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
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(7, 7, 9, 6);
            BufferedImage nose = texture.getSubimage(22, 31, 3, 3);
            icon.drawImage(face, -2, 4, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(nose, 10, 16, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^pig_zombie\\.png$")),
                        List.of("pig_zombie.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^pig_zombie_baby\\.png$")),
                        List.of("pig_zombie_baby.png")
                )
        );
    }
}
