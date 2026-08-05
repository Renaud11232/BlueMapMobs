package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class DrownedTextureConverter extends TextureConverter {
    public DrownedTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage face = textures.get(0).getSubimage(8, 8, 8, 8);
            BufferedImage faceOuterLayer = textures.get(1).getSubimage(8, 8, 8, 8);
            icon.drawImage(face, 0, 0, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(faceOuterLayer, 0, 0, faceOuterLayer.getWidth() * 4, faceOuterLayer.getHeight() * 4, null);
        });
        registerTexturesConversion((textures, icon) -> {
            BufferedImage face = textures.get(0).getSubimage(9, 9, 6, 6);
            BufferedImage faceOuterLayer = textures.get(1).getSubimage(41, 9, 6, 6);
            icon.drawImage(face, 4, 4, face.getWidth() * 4, face.getHeight() * 4, null);
            icon.drawImage(faceOuterLayer, 4, 4, faceOuterLayer.getWidth() * 4, faceOuterLayer.getHeight() * 4, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^drowned\\.png$"), Pattern.compile("^drowned_outer_layer\\.png$")),
                        List.of("drowned.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^drowned_baby\\.png$"), Pattern.compile("^drowned_outer_layer_baby\\.png$")),
                        List.of("drowned_baby.png")
                )
        );
    }
}
