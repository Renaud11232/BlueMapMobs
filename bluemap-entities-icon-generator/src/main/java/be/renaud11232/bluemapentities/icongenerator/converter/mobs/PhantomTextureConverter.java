package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PhantomTextureConverter extends TextureConverter {
    public PhantomTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage head = textures.get(0).getSubimage(5, 5, 7, 3);
            BufferedImage eyes = textures.get(1).getSubimage(5, 5, 7, 3);
            icon.drawImage(head, 2, 10, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(eyes, 2, 10, eyes.getWidth() * 4, eyes.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^phantom\\.png$"), Pattern.compile("^phantom_eyes\\.png$")),
                        List.of("phantom.png")
                )
        );
    }
}
