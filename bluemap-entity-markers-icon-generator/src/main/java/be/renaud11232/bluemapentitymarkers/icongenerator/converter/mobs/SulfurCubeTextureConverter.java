package be.renaud11232.bluemapentitymarkers.icongenerator.converter.mobs;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SulfurCubeTextureConverter extends TextureConverter {
    public SulfurCubeTextureConverter() {
        super();
        registerTexturesConversion((textures, icon) -> {
            BufferedImage inner = textures.get(0).getSubimage(16, 52, 16, 16);
            BufferedImage outer = textures.get(1).getSubimage(18, 18, 18, 18);
            icon.drawImage(inner, 0, -2, inner.getWidth() * 2, inner.getHeight() * 2, null);
            icon.drawImage(outer, -2, -4, outer.getWidth() * 2, outer.getHeight() * 2, null);
        });
        registerTexturesConversion((textures, icon) -> {
            BufferedImage inner = textures.get(0).getSubimage(8, 28, 8, 8);
            BufferedImage outer = textures.get(1).getSubimage(10, 10, 10, 10);
            icon.drawImage(inner, 8, 8, inner.getWidth() * 2, inner.getHeight() * 2, null);
            icon.drawImage(outer, 6, 6, outer.getWidth() * 2, outer.getHeight() * 2, null);
        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^sulfur_cube_inner.png$"), Pattern.compile("^sulfur_cube_outer.png$")),
                        List.of("sulfur_cube.png")
                ),
                Map.entry(
                        List.of(Pattern.compile("^sulfur_cube_inner_small.png$"), Pattern.compile("^sulfur_cube_outer_small.png$")),
                        List.of("sulfur_cube_small.png")
                )
        );
    }
}
