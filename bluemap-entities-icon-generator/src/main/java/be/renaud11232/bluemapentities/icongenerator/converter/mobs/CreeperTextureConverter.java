package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;
import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CreeperTextureConverter extends TextureConverter {
    public CreeperTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(8, 8, 8, 8);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
        });
        registerTexturesConversion((textures, icon) -> {
            BufferedImage head = textures.get(0).getSubimage(8, 8, 8, 8);
            BufferedImage overlay = ImageOperations.opacity(textures.get(1).getSubimage(2, 1, 8, 8), 0.35f);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(overlay, 0, 0, overlay.getWidth() * 4, overlay.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^creeper\\.png$")),
                        List.of("creeper.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^creeper\\.png$"), Pattern.compile("^creeper_armor\\.png$")),
                        List.of("creeper_charged.png")
                )
        );
    }
}
