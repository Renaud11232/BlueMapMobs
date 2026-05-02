package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CaveSpiderTextureConverter extends TextureConverter {
    public CaveSpiderTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage head = textures.get(0).getSubimage(40, 12, 8, 8);
            BufferedImage eyes = textures.get(1).getSubimage(40, 12, 8, 8);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(eyes, 0, 0, eyes.getWidth() * 4, eyes.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^cave_spider\\.png$"), Pattern.compile("^spider_eyes\\.png$")),
                        List.of("cave_spider.png")
                )
        );
    }
}
