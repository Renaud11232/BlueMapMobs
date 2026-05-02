package be.renaud11232.bluemapentities.icongenerator.converter.mobs;

import be.renaud11232.bluemapentities.icongenerator.ImageOperations;
import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class BeeTextureConverter extends TextureConverter {
    public BeeTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage bee = textures.get(0).getSubimage(10, 10, 7, 7);
            BufferedImage beeWithNectar = textures.get(1).getSubimage(10, 10, 7, 7);
            BufferedImage nectar = ImageOperations.difference(bee, beeWithNectar);
            icon.drawImage(nectar, 2, 2, nectar.getWidth() * 4, nectar.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage bee = texture.getSubimage(10, 10, 7, 7);
            icon.drawImage(bee, 2, 2, bee.getWidth() * 4, bee.getHeight() * 4, null);
        });
        registerTexturesConversion((textures, icon) -> {
            BufferedImage bee = textures.get(0).getSubimage(5, 5, 4, 4);
            BufferedImage beeWithNectar = textures.get(1).getSubimage(5, 5, 4, 4);
            BufferedImage nectar = ImageOperations.difference(bee, beeWithNectar);
            icon.drawImage(nectar, 8, 8, nectar.getWidth() * 4, nectar.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            BufferedImage bee = texture.getSubimage(5, 5, 4, 4);
            icon.drawImage(bee, 8, 8, bee.getWidth() * 4, bee.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^bee\\.png$"), Pattern.compile("^bee_nectar\\.png$")),
                        List.of("bee_nectar.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^bee((?:_angry)?)\\.png$")),
                        List.of("bee$1.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^bee_baby\\.png$"), Pattern.compile("^bee_nectar_baby\\.png$")),
                        List.of("bee_nectar_baby.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^bee((?:_angry)?)_baby\\.png$")),
                        List.of("bee$1_baby.png")
                )
        );
    }
}
