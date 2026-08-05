package be.renaud11232.bluemapentitymarkers.icongenerator.converter.vehicles;

import be.renaud11232.bluemapentitymarkers.icongenerator.converter.TextureConverter;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class BoatTextureConverter extends TextureConverter {
    public BoatTextureConverter() {
        super();
        registerTextureConversion((texture, icon) ->
                icon.drawImage(texture, 0, 0, texture.getWidth() * 2, texture.getHeight() * 2, null)
        );
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("((?:acacia|birch|cherry|dark_oak|jungle|mangrove|oak|pale_oak|spruce)(?:_chest)?_boat|bamboo(?:_chest)?_raft)\\.png")),
                        List.of("$1.png")
                )
        );
    }
}
