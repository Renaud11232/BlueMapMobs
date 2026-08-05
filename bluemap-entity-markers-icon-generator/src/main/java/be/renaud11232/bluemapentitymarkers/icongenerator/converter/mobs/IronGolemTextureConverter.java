package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class IronGolemTextureConverter extends TextureConverter {
    public IronGolemTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 8, 10);
            BufferedImage nose = texture.getSubimage(26, 2, 2, 4);
            icon.drawImage(head, 0, -8, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 12, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^iron_golem\\.png$")),
                        List.of("iron_golem.png")
                )
        );
    }
}
