package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class RabbitTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage leftEar = texture.getSubimage(27, 1, 2, 5);
        BufferedImage rightEar = texture.getSubimage(33, 1, 2, 5);
        BufferedImage face = texture.getSubimage(5, 21, 5, 5);
        icon.drawImage(leftEar, 6, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 18, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        icon.drawImage(face, 6, 12, face.getWidth() * 4, face.getHeight() * 4, null);
    }
}
