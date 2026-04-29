package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ParrotTextureConverter extends TextureConverter {
    public ParrotTextureConverter() {
        super();
        registerTextureConversion(this::convert);
        registerTextureConversion(this::convert);
        registerTextureConversion(this::convert);
        registerTextureConversion(this::convert);
    }

    private void convert(BufferedImage texture, Graphics2D icon) {
        BufferedImage feathers = texture.getSubimage(2, 22, 4, 5);
        BufferedImage face = texture.getSubimage(2, 4, 2, 3);
        BufferedImage forehead = texture.getSubimage(10, 4, 4, 1);
        BufferedImage beakBase = texture.getSubimage(12, 8, 1, 2);
        BufferedImage beakTip = texture.getSubimage(17, 8, 1, 2);
        icon.drawImage(feathers, 6, 0, feathers.getWidth() * 4, feathers.getHeight() * 4, null);
        icon.drawImage(face, 12, 20, face.getWidth() * 4, face.getHeight() * 4, null);
        icon.drawImage(beakBase, 20, 20, beakBase.getWidth() * 4, beakBase.getHeight() * 4, null);
        icon.drawImage(beakTip, 24, 18, beakTip.getWidth() * 4, beakTip.getHeight() * 4, null);
        icon.drawImage(forehead, 12, 16, forehead.getWidth() * 4, forehead.getHeight() * 4, null);
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^parrot_(blue|green)\\.png$")),
                        List.of("parrot_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^parrot_grey\\.png$")),
                        List.of("parrot_gray.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^parrot_red_blue\\.png$")),
                        List.of("parrot_red.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^parrot_yellow_blue\\.png$")),
                        List.of("parrot_cyan.png")
                )
        );
    }
}
