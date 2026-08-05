package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class TraderLlamaTextureConverter extends TextureConverter {
    public TraderLlamaTextureConverter() {
        super();
        registerTextureConversion((texture, icon) -> {
            for (int x = 0; x <= 5; x++) {
                BufferedImage left = texture.getSubimage(x, 20, 1, 10);
                icon.drawImage(left, 0, 6, left.getWidth() * 2, left.getHeight() * 4, null);
            }
            for (int x = 19; x >= 14; x--) {
                BufferedImage right = texture.getSubimage(x, 20, 1, 10);
                icon.drawImage(right, 30, 6, right.getWidth() * 2, right.getHeight() * 4, null);
            }
            for (int y = 14; y <= 19; y++) {
                BufferedImage top = texture.getSubimage(6, y, 8, 1);
                icon.drawImage(top, 0, 6, top.getWidth() * 4, top.getHeight() * 2, null);
            }
            BufferedImage face = texture.getSubimage(6, 20, 8, 10);
            icon.drawImage(face, 0, 6, face.getWidth() * 4, face.getHeight() * 4, null);
        });
        registerTextureConversion((texture, icon) -> {
            for (int x = 0; x <= 3; x++) {
                BufferedImage left = texture.getSubimage(x, 4, 1, 7);
                icon.drawImage(left, 4, 10, left.getWidth() * 2, left.getHeight() * 4, null);
            }
            for (int x = 13; x >= 10; x--) {
                BufferedImage right = texture.getSubimage(x, 4, 1, 7);
                icon.drawImage(right, 26, 10, right.getWidth() * 2, right.getHeight() * 4, null);
            }
            for (int y = 0; y <= 3; y++) {
                BufferedImage top = texture.getSubimage(4, y, 6, 1);
                icon.drawImage(top, 4, 8, top.getWidth() * 4, top.getHeight() * 2, null);
            }
            BufferedImage face = texture.getSubimage(4, 4, 6, 7);
            icon.drawImage(face, 4, 10, face.getWidth() * 4, face.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^trader_llama_decor\\.png$")),
                        List.of("trader_llama_decor.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^trader_llama_decor_baby\\.png$")),
                        List.of("trader_llama_decor_baby.png")
                )
        );
    }
}
