package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ShulkerTextureConverter extends TextureConverter {
    public ShulkerTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(6, 58, 6, 6);
            BufferedImage boxBottom = texture.getSubimage(16, 44, 16, 8);
            BufferedImage boxTop = texture.getSubimage(16, 16, 16, 12);
            icon.drawImage(head, 10, 8, head.getWidth() * 2, head.getHeight() * 2, null);
            icon.drawImage(boxBottom, 0, 16, boxBottom.getWidth() * 2, boxBottom.getHeight() * 2, null);
            icon.drawImage(boxTop, 0, -7, boxTop.getWidth() * 2, boxTop.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^shulker((?:_(?:black|blue|brown|cyan|gray|green|light_blue|light_gray|lime|magenta|orange|pink|purple|red|white|yellow))?)\\.png$")),
                        List.of("shulker$1.png")
                )
        );
    }
}
