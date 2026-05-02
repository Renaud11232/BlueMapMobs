package be.renaud11232.bluemapentities.icongenerator.converter.other;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ArmorStandTextureConverter extends TextureConverter {
    public ArmorStandTextureConverter() {
        super();
        registerTextureConversion((texture, icon) ->
            icon.drawImage(texture, 0, 0, texture.getWidth() * 2, texture.getHeight() * 2, null)
        );
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("armor_stand\\.png")),
                        List.of("armor_stand.png")
                )
        );
    }
}
