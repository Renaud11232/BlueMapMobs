package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class VexTextureConverter extends TextureConverter {
    public VexTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(5, 5, 5, 5);
            icon.drawImage(head, 1, 1, head.getWidth() * 6, head.getHeight() * 6, null);
        });
        registerTexturesConversion((textures, icon) -> {
            BufferedImage head = textures.get(0).getSubimage(5, 5, 5, 5);
            BufferedImage overlay = textures.get(1).getSubimage(5, 5, 5, 5);
            icon.drawImage(head, 1, 1, head.getWidth() * 6, head.getHeight() * 6, null);
            icon.drawImage(overlay, 1, 1, overlay.getWidth() * 6, overlay.getHeight() * 6, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^vex\\.png$")),
                        List.of("vex.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^vex\\.png$"), Pattern.compile("^vex_charging\\.png$")),
                        List.of("vex_charging.png")
                )
        );
    }
}
