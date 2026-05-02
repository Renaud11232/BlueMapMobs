package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;
import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CodTextureConverter extends TextureConverter {
    public CodTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage head = texture.getSubimage(11, 3, 3, 4);
            BufferedImage nose = texture.getSubimage(0, 1, 1, 3);
            BufferedImage body = texture.getSubimage(0, 7, 7, 4);
            BufferedImage topFins = ImageOperations.flop(texture.getSubimage(26, 0, 6, 1));
            BufferedImage bottomFin =  ImageOperations.rotate(texture.getSubimage(26, 1, 2, 2), -90);
            icon.drawImage(head, 12, 10, head.getWidth() * 4, head.getHeight() * 4, null);
            icon.drawImage(nose, 24, 10, nose.getWidth() * 4, nose.getHeight() * 4, null);
            icon.drawImage(body, -16, 10, body.getWidth() * 4, body.getHeight() * 4, null);
            icon.drawImage(topFins, -8, 6, topFins.getWidth() * 4, topFins.getHeight() * 4, null);
            icon.drawImage(bottomFin, 8, 22, bottomFin.getWidth() * 4, bottomFin.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^cod\\.png$")),
                        List.of("cod.png")
                )
        );
    }
}
