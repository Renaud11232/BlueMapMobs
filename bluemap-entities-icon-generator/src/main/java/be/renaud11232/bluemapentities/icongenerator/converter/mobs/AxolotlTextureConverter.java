package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class AxolotlTextureConverter extends TextureConverter {
    public AxolotlTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(5, 6, 8, 5);
            icon.drawImage(face, 0, 6, face.getWidth() * 4, face.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage face = texture.getSubimage(4, 12, 6, 3);
            icon.drawImage(face, 4, 10, face.getWidth() * 4, face.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^axolotl_(blue|cyan|gold|lucy|wild)\\.png$")),
                        List.of("axolotl_$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^axolotl_(blue|cyan|gold|lucy|wild)_baby\\.png$")),
                        List.of("axolotl_$1_baby.png")
                )
        );
    }
}
