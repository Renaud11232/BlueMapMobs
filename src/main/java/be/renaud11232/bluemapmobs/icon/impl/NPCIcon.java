package be.renaud11232.bluemapmobs.icon.impl;

import com.flowpowered.math.vector.Vector2i;
import com.google.gson.JsonParser;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class NPCIcon extends SimpleIcon {
    public NPCIcon(String texture, Path webroot, Vector2i anchor) throws IOException {
        super(generateIconPath(texture, webroot), anchor);
    }

    private static String generateIconPath(String texture, Path webroot) throws IOException {
        String url = JsonParser.parseString(new String(Base64.getDecoder().decode(texture)))
                .getAsJsonObject()
                .get("textures")
                .getAsJsonObject()
                .get("SKIN")
                .getAsJsonObject()
                .get("url")
                .getAsString();
        String[] segments = url.split("/");
        String textureId = segments[segments.length - 1];
        String relativePath = String.format("assets/bluemapmobs/img/npc/custom/%s.png", textureId);
        Path output = webroot.resolve(relativePath);
        if (!Files.exists(output)) {
            Files.createDirectories(output.getParent());
            BufferedImage textureImage = ImageIO.read(URI.create(url).toURL());
            BufferedImage head;
            BufferedImage layer1 = textureImage.getSubimage(8, 8, 8, 8);
            BufferedImage layer2 = textureImage.getSubimage(40, 8, 8, 8);
            try {
                head = new BufferedImage(32, 32, BufferedImage.TYPE_INT_ARGB);
                Graphics2D graphics = head.createGraphics();
                graphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
                graphics.drawImage(layer1, 0, 0, 32, 32, null);
                graphics.drawImage(layer2, 0, 0, 32, 32, null);
            } catch(Throwable t) {
                head = new BufferedImage(8, 8, textureImage.getType());
                layer1.copyData(head.getRaster());
            }
            ImageIO.write(head, "png", output.toFile());
        }
        return relativePath;
    }
}
