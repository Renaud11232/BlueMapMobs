package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class EndermanTextureConverter extends TextureConverter {
    public EndermanTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage jaw = textures.get(0).getSubimage(8, 24, 8, 8);
            BufferedImage head = textures.get(0).getSubimage(8, 8, 8, 8);
            BufferedImage eyes = textures.get(1).getSubimage(8, 8, 8, 8);
            icon.drawImage(jaw, 0, 0, jaw.getWidth() * 4, jaw.getHeight() * 4, null);
            icon.drawImage(head, 0, 0, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(eyes, 0, 0, eyes.getWidth() * 4, eyes.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^enderman\\.png$"), Pattern.compile("^enderman_eyes\\.png$")),
                        List.of("enderman.png")
                )
        );
    }
}
