package be.renaud11232.bluemapmobs.icon;

import com.flowpowered.math.vector.Vector2i;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class SkinIcon extends SimpleIcon {
    public SkinIcon(Path webroot, URL skin, String path, Vector2i anchor) throws IOException {
        super(generateSkinIconPath(webroot, path, skin), anchor);
    }

    private static String generateSkinIconPath(Path webroot, String pathTemplate, URL skin) throws IOException {
        String relativePath = pathTemplate.replace("{id}", skin.getFile());
        Path output = webroot.resolve(relativePath);
        if (Files.exists(output)) {
            return relativePath;
        }
        Files.createDirectories(output.getParent());
        BufferedImage textureImage = ImageIO.read(skin);
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
