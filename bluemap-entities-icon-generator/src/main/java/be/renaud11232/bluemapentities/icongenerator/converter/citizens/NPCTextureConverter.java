package be.renaud11232.bluemapentities.icongenerator.converter.citizens;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class NPCTextureConverter extends TextureConverter {
    public NPCTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 8, 8);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("(alex|ari|efe|kai|makena|noor|steve|sunny|zuri)\\.png")),
                        List.of("$1.png")
                )
        );
    }
}
