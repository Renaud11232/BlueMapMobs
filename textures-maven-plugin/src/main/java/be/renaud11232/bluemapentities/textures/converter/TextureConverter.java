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
        converters.put(Pattern.compile("^glow_squid_baby\\.png$"), new GlowSquidBabyTextureConverter());
        converters.put(Pattern.compile("^glow_squid\\.png$"), new GlowSquidTextureConverter());
        converters.put(Pattern.compile("^hoglin_baby\\.png$"), new HoglinBabyTextureConverter());
        converters.put(Pattern.compile("^hoglin\\.png$"), new HoglinTextureConverter());
        converters.put(Pattern.compile("^horse_.*?_baby\\.png$"), new HorseBabyTextureConverter());
        converters.put(Pattern.compile("^horse_.*?\\.png$"), new HorseTextureConverter());
        converters.put(Pattern.compile("^husk_baby\\.png$"), new HuskBabyTextureConverter());
        converters.put(Pattern.compile("^husk\\.png$"), new HuskTextureConverter());
        converters.put(Pattern.compile("^llama_.*?_baby\\.png$"), new LlamaBabyTextureConverter());
        converters.put(Pattern.compile("^llama_.*?\\.png$"), new LlamaTextureConverter());
        converters.put(Pattern.compile("^mule_baby\\.png$"), new MuleBabyTextureConverter());
        converters.put(Pattern.compile("^mule\\.png$"), new MuleTextureConverter());
        converters.put(Pattern.compile("^nautilus_baby\\.png$"), new NautilusBabyTextureConverter());
        converters.put(Pattern.compile("^nautilus\\.png$"), new NautilusTextureConverter());
        converters.put(Pattern.compile("^panda_.*?_baby\\.png$"), new PandaBabyTextureConverter());
        converters.put(Pattern.compile("^panda_.*?\\.png$"), new PandaTextureConverter());
        converters.put(Pattern.compile("^piglin_baby\\.png$"), new PiglinBabyTextureConverter());
        converters.put(Pattern.compile("^piglin\\.png$"), new PiglinTextureConverter());
        converters.put(Pattern.compile("^pig_zombie_baby\\.png$"), new PigZombieBabyTextureConverter());
        converters.put(Pattern.compile("^pig_zombie\\.png$"), new PigZombieTextureConverter());
        converters.put(Pattern.compile("^pig_.*?_baby\\.png$"), new PigBabyTextureConverter());
        converters.put(Pattern.compile("^pig_.*?\\.png$"), new PigTextureConverter());
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
