package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ZombieTextureConverter extends TextureConverter {
    public ZombieTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 8, 8);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(9, 9, 6, 6);
            icon.drawImage(head, 4, 4, head.getWidth() * 4, head.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^zombie\\.png$")),
                        List.of("zombie.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^zombie_baby\\.png$")),
                        List.of("zombie_baby.png")
                )
        );
    }
}
