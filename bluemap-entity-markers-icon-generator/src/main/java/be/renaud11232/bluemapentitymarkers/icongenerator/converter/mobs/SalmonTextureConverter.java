package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.ImageOperations;
import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SalmonTextureConverter extends TextureConverter {
    public SalmonTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(22, 3, 3, 4);
            BufferedImage body = texture.getSubimage(0, 8, 8, 5);
            BufferedImage fin = ImageOperations.rotate(texture.getSubimage(0, 0, 2, 2), -90);
            icon.drawImage(head, 20, 10, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(body, -12, 8, body.getWidth() * 4, body.getHeight() * 4, null);
            icon.drawImage(fin, 12, 24, fin.getWidth() * 4, fin.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^salmon\\.png$")),
                        List.of("salmon.png")
                )
        );
    }
}
