package be.renaud11232.bluemapentities.textures.converter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TextureConverter implements Converter {
    private final Map<Pattern, Converter> converters;

    public TextureConverter() {
        converters = new LinkedHashMap<>();
        converters.put(Pattern.compile("^donkey\\.png$"), new DonkeyTextureConverter());
        converters.put(Pattern.compile("^donkey_baby\\.png$"), new DonkeyBabyTextureConverter());
        converters.put(Pattern.compile("^mule\\.png$"), new MuleTextureConverter());
        converters.put(Pattern.compile("^mule_baby\\.png$"), new MuleBabyTextureConverter());
    }

    @Override
    public boolean convert(Path path) throws IOException {
        for (var entry : converters.entrySet()) {
            if (entry.getKey().matcher(path.getFileName().toString()).matches()) {
                return entry.getValue().convert(path);
            }
        }
        return false;
    }
}
