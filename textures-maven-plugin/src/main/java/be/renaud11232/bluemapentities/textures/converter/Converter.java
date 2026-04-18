package be.renaud11232.bluemapentities.textures.converter;

import java.io.IOException;
import java.nio.file.Path;

public interface Converter {
    boolean convert(Path path) throws IOException;
}
