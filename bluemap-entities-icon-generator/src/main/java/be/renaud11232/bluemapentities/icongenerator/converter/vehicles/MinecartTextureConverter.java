package be.renaud11232.bluemapentities.icongenerator.converter.vehicles;

import be.renaud11232.bluemapentities.icongenerator.converter.TextureConverter;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class MinecartTextureConverter extends TextureConverter {
    public MinecartTextureConverter() {
        super();
        registerTextureConversion((texture, icon) ->
            icon.drawImage(texture, 0, 0, texture.getWidth() * 2, texture.getHeight() * 2, null)
        );
    }

    @Override
    protected List<Map.Entry<List<Pattern>, List<String>>> getConversions() {
        return List.of(
                Map.entry(
                        List.of(Pattern.compile("((?:(?:chest|command_block|furnace|hopper|tnt)_)?)minecart\\.png")),
                        List.of("$1minecart.png")
                )
        );
    }
}
