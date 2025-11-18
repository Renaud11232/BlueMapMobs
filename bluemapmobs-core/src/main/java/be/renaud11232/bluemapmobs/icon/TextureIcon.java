package be.renaud11232.bluemapmobs.icon;

import com.flowpowered.math.vector.Vector2i;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.util.Base64;

public class TextureIcon extends SkinIcon {
    public TextureIcon(Path webroot, String texture, String path, Vector2i anchor) throws IOException {
        super(webroot, getSkinURL(texture), path, anchor);
    }

    private static URL getSkinURL(String texture) throws MalformedURLException {
        String url = JsonParser.parseString(new String(Base64.getDecoder().decode(texture)))
                .getAsJsonObject()
                .get("textures")
                .getAsJsonObject()
                .get("SKIN")
                .getAsJsonObject()
                .get("url")
                .getAsString();
        return URI.create(url).toURL();
    }
}
