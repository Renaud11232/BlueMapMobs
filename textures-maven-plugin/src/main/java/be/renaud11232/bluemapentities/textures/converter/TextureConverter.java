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
        converters.put(Pattern.compile("^camel_husk\\.png$"), new CamelHuskTextureConverter());
        converters.put(Pattern.compile("^camel\\.png$"), new CamelTextureConverter());
        converters.put(Pattern.compile("^donkey_baby\\.png$"), new DonkeyBabyTextureConverter());
        converters.put(Pattern.compile("^donkey\\.png$"), new DonkeyTextureConverter());
        converters.put(Pattern.compile("^drowned_baby\\.png$"), new DrownedBabyTextureConverter());
        converters.put(Pattern.compile("^drowned_outer_layer_baby\\.png$"), new DrownedOuterLayerBabyTextureConverter());
        converters.put(Pattern.compile("^drowned\\.png$"), new DrownedTextureConverter());
        converters.put(Pattern.compile("^drowned_outer_layer\\.png$"), new DrownedOuterLayerTextureConverter());
        converters.put(Pattern.compile("^fox_.*?_baby\\.png$"), new FoxBabyTextureConverter());
        converters.put(Pattern.compile("^fox_.*?\\.png$"), new FoxTextureConverter());
        converters.put(Pattern.compile("^horse_.*?_baby\\.png$"), new HorseBabyTextureConverter());
        converters.put(Pattern.compile("^horse_.*?\\.png$"), new HorseTextureConverter());
        converters.put(Pattern.compile("^mule_baby\\.png$"), new MuleBabyTextureConverter());
        converters.put(Pattern.compile("^mule\\.png$"), new MuleTextureConverter());
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
