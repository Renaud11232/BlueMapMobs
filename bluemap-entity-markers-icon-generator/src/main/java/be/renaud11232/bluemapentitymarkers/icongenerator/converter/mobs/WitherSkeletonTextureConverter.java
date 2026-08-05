package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class WitherSkeletonTextureConverter extends TextureConverter {
    public WitherSkeletonTextureConverter() {
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
                        List.of(Pattern.compile("^wither_skeleton\\.png$")),
                        List.of("wither_skeleton.png")
                )
        );
    }
}
