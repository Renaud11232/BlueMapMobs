package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CopperGolemTextureConverter extends TextureConverter {
    public CopperGolemTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage head = textures.get(0).getSubimage(10, 10, 8, 5);
            BufferedImage eyes = textures.get(1).getSubimage(10, 10, 8, 5);
            BufferedImage top = textures.get(0).getSubimage(39, 10, 2, 4);
            BufferedImage nose = textures.get(0).getSubimage(58, 2, 2, 3);
            icon.drawImage(head, 0, 8, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(eyes, 0, 8, eyes.getWidth() * 4, eyes.getHeight() * 4, null);
            icon.drawImage(top, 12, -8, top.getWidth() * 4, top.getHeight() * 4, null);
            icon.drawImage(nose, 12, 20, nose.getWidth() * 4, nose.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^copper_golem((?:_(?:exposed|oxidized|weathered))?)\\.png$"), Pattern.compile("^copper_golem_eyes((?:_(?:exposed|oxidized|weathered))?)\\.png$")),
                        List.of("copper_golem$1.png")
                )
        );
    }
}
