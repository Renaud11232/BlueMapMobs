package be.renaud11232.bluemapmobs.icon;

import com.flowpowered.math.vector.Vector2i;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.UUID;

public class PlayerTextureIcon extends SimpleIcon {
    public PlayerTextureIcon(String path, Vector2i anchor, String texture, Path webroot) throws IOException {
        super(generateTextureIconPath(path, texture, webroot), anchor);
    }

    public PlayerTextureIcon(String path, Vector2i anchor, UUID id, Path webroot) throws IOException {
        super(generateProfileIconPath(path, id, webroot), anchor);
    }

    private static String generateProfileIconPath(String pathTemplate, UUID playerId, Path webroot) throws IOException {
        String relativePath = pathTemplate.replace("{id}", playerId.toString());
        Path output = webroot.resolve(relativePath);
        if (Files.exists(output) && Files.getLastModifiedTime(output).toInstant().isAfter(Instant.now().minus(1, ChronoUnit.HOURS))) {
            return relativePath;
        }
        try (Reader reader = new InputStreamReader(URI.create("https://sessionserver.mojang.com/session/minecraft/profile/" + playerId).toURL().openStream())) {
            JsonElement root = JsonParser.parseReader(reader);
            JsonArray properties = root.getAsJsonObject().get("properties").getAsJsonArray();
            for (JsonElement element : properties) {
                JsonObject property = element.getAsJsonObject();
                if (property.get("name").getAsString().equals("textures")) {
                    return generateTextureIconPath(relativePath, property.get("value").getAsString(), webroot, true);
                }
            }
            throw new IOException("No texture info found !");
        }
    }

    private static String generateTextureIconPath(String pathTemplate, String texture, Path webroot) throws IOException {
        return generateTextureIconPath(pathTemplate, texture, webroot, false);
    }

    private static String generateTextureIconPath(String pathTemplate, String texture, Path webroot, boolean overwrite) throws IOException {
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
        String relativePath = pathTemplate.replace("{id}", textureId);
        Path output = webroot.resolve(relativePath);
        if (Files.exists(output) && !overwrite) {
            return relativePath;
        }
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
        return relativePath;
    }
}
