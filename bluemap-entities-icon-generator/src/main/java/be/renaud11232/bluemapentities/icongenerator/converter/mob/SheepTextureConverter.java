package be.renaud11232.bluemapentities.icongenerator.converter.mob;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SheepTextureConverter extends TextureConverter {
    public SheepTextureConverter() {
        super();
        registerTexturesConversions((textures, icons) -> {

        });
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("^sheep\\.png$"), Pattern.compile("^sheep_wool\\.png$")),
                        List.of("sheep_white.png", "sheep_orange.png", "sheep_magenta.png", "sheep_light_blue.png", "sheep_yellow.png", "sheep_lime.png", "sheep_pink.png", "sheep_gray.png", "sheep_light_gray.png", "sheep_cyan.png", "sheep_purple.png", "sheep_blue.png", "sheep_brown.png", "sheep_green.png", "sheep_red.png", "sheep_black.png")
                )
        );
    }
}
