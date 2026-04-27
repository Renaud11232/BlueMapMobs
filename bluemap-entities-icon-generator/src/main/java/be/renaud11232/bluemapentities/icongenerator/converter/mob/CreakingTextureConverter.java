package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CreakingTextureConverter extends TextureConverter {
    public CreakingTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face =  texture.getSubimage(6, 6, 6, 10);
            BufferedImage left =  texture.getSubimage(39, 14, 4, 11);
            BufferedImage right =  texture.getSubimage(12, 44, 4, 10);
            BufferedImage top =  texture.getSubimage(34, 38, 6, 2);
            icon.drawImage(face, 10, 8, face.getWidth() * 2, face.getHeight() * 2, null);
            icon.drawImage(left, 2, 4, left.getWidth() * 2, left.getHeight() * 2, null);
            icon.drawImage(right, 22, 8, right.getWidth() * 2, right.getHeight() * 2, null);
            icon.drawImage(top, 10, 4, top.getWidth() * 2, top.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^creaking\\.png$")),
                        List.of("creaking.png")
                )
        );
    }
}
