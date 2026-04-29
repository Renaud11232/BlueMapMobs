package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class MagmaCubeTextureConverter extends TextureConverter {
    public MagmaCubeTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            for (int i = 0; i < 8; i++) {
                int x = i < 4 ? 8 : 40;
                int y = (9 * (i % 4 + 1)) - 1;
                BufferedImage line = texture.getSubimage(x, y, 8, 1);
                icon.drawImage(line, 0, 4 * i, line.getWidth() * 4, line.getHeight() * 4, null);
            }
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^magmacube\\.png$")),
                        List.of("magma_cube.png")
                )
        );
    }
}
