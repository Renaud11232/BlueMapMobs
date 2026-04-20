package be.renaud11232.bluemapentities.textures.converter;

import java.awt.*;
import java.awt.image.BufferedImage;

public class RabbitBabyTextureConverter extends SimpleTextureConverter {
    @Override
    protected void buildGraphics(BufferedImage texture, Graphics2D icon) {
        BufferedImage leftEar = texture.getSubimage(19, 1, 2, 4);
        BufferedImage rightEar = texture.getSubimage(25, 1, 2, 4);
        BufferedImage face = texture.getSubimage(4, 4, 5, 4);
        icon.drawImage(leftEar, 6, 0, leftEar.getWidth() * 4, leftEar.getHeight() * 4, null);
        icon.drawImage(rightEar, 18, 0, rightEar.getWidth() * 4, rightEar.getHeight() * 4, null);
        icon.drawImage(face, 6, 16, face.getWidth() * 4, face.getHeight() * 4, null);
    }
}
