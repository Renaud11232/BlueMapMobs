package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class EnderDragonTextureConverter extends TextureConverter {
    public EnderDragonTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(128, 46, 16, 16);
            BufferedImage nostril = texture.getSubimage(116, 4, 2, 2);
            BufferedImage mouthTop = texture.getSubimage(192, 60, 12, 5);
            BufferedImage mouthBottom = texture.getSubimage(192, 81, 12, 4);
            icon.drawImage(head, 0, 0, head.getWidth() * 2, head.getHeight() * 2, null);
            icon.drawImage(nostril, 6, 10, nostril.getWidth() * 2, nostril.getHeight() * 2, null);
            icon.drawImage(nostril, 22, 10, nostril.getWidth() * 2, nostril.getHeight() * 2, null);
            icon.drawImage(mouthTop, 4, 14, mouthTop.getWidth() * 2, mouthTop.getHeight() * 2, null);
            icon.drawImage(mouthBottom, 4, 24, mouthBottom.getWidth() * 2, mouthBottom.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^dragon\\.png$")),
                        List.of("ender_dragon.png")
                )
        );
    }
}
